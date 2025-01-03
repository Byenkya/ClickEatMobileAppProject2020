package com.clickEat.ug.screens

import android.content.Context
import android.net.ConnectivityManager
import android.view.Gravity
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.clickEat.ug.databinding.NoInternetConnectionBinding
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.SSLHandshakeException

@Suppress("DEPRECATION")
class CheckInternetConnection(val context: Context){
    suspend fun isConnectedToInternet(fragment: Fragment, layout: LinearLayout): Boolean{
        return if (onlyCheckForInternetConnectionAsync().await()){
            true
        }else{
            val binding = NoInternetConnectionBinding.inflate(fragment.layoutInflater)
            binding.reloadButton.setOnClickListener {
                binding.reloadButton.isEnabled = false
                val fm = fragment.parentFragmentManager.beginTransaction()
                fm.detach(fragment)
                fm.attach(fragment)
                fm.commit()
            }

            layout.removeAllViews()
            layout.addView(binding.root)
            layout.gravity = Gravity.CENTER
            false
        }
    }

    suspend fun onlyCheckForInternetConnectionAsync(): Deferred<Boolean>{
        return GlobalScope.async {
            val connectionManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val info = connectionManager.activeNetworkInfo
            val handShake = async {performHandshake()}
            info != null && info.isConnected && handShake.await()

        }
    }

    private fun performHandshake(): Boolean{
        return try {
            val url = URL("http://92.205.24.64/api/v1/")
            val urlConnection = url.openConnection() as HttpURLConnection
            val inputStream = urlConnection.responseCode
            urlConnection.disconnect()
            true
        } catch (t: IOException) {
            false
        } catch (t: SSLHandshakeException) {
            false
        }

    }

}