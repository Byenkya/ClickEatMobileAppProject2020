package com.clickEat.ug.api

import android.content.Context
import com.clickEat.ug.data.CustomerToken
import com.clickEat.ug.database.AppDataBase
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class ApiConnection (val context: Context) {
    companion object {
        private const val BASE_URL = "http://92.205.24.64/api/v1/"
    }

    private val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

    private val httpClient = OkHttpClient.Builder()
            .connectTimeout(5, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.MINUTES)
            .writeTimeout(15, TimeUnit.MINUTES)
            .addInterceptor(CustomInterceptor(context))
            .build()

    private val connection = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(BASE_URL)
            .client(httpClient)
            .build()

    val connectionService: ApiService by lazy {
        connection.create(ApiService::class.java)
    }
}

class CustomInterceptor(val context: Context): Interceptor {
    private lateinit var response: okhttp3.Response

    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        return with(chain){
            val request = request()
            response = if (request.method == "POST"){
                proceed(
                        request
                                .newBuilder()
                                .addHeader("Content-Type", "application/json")
                                .addHeader("Authorization", Credentials.basic(CustomerToken.token, ""))
                                .build()

                )
            }else{
                proceed(
                        request
                                .newBuilder()
                                .addHeader("Authorization", Credentials.basic(CustomerToken.token, ""))
                                .build()
                )
            }
            response.headers["Authorization"]?.let{
                saveToken(it, context)
            }
            response
        }
    }
}

fun saveToken(token: String, context: Context){
    CoroutineScope(Dispatchers.IO).launch {
        val newToken = token.substringAfter("")
        if(newToken != CustomerToken.token && updateCustomerToken(newToken, context)){
            CustomerToken.token = newToken
        }
    }
}

suspend fun updateCustomerToken(token: String, context: Context): Boolean{
    return withContext(Dispatchers.IO){
        AppDataBase.getInstance(context).databaseDao.updateCustomerToken(token, CustomerToken.token)
        true
    }
}

