package com.clickEat.ug.screens.signup

import android.annotation.SuppressLint
import android.app.Application
import android.content.ContentUris
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.ApiResponse
import com.clickEat.ug.data.AruaDistrict
import com.clickEat.ug.data.NewUser
import kotlinx.coroutines.*


class SignUpModelView(application: Application): AndroidViewModel(application){
    private val viewModalJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModalJob)

    var result = MutableLiveData<ApiResponse?>()

    init {
    }




//    fun postServer(newUser: NewUser){
////        val file = FileUtil.getPath(contentURI, context)
////        val requestFile: RequestBody = file!!.toRequestBody("image/*".toMediaTypeOrNull())
////        val map: MutableMap<String, RequestBody> = mutableMapOf()
////        map["filename"] = requestFile
//
//        signUpUser(newUser)
//    }

    // This method  converts String to RequestBody
//    private fun toRequestBody(value: String): RequestBody {
//        return value!!.toRequestBody("text/plain".toMediaTypeOrNull())
//    }

    fun signUpUser(newUser: NewUser){
        coroutineScope.launch {
            try{
                result.value = createAccount(newUser)
            }catch (it: Throwable){
                result.value = ApiResponse("error", it.message, 0)
            }
        }
    }


    private suspend fun createAccount(newUser: NewUser): ApiResponse{

            return withContext(Dispatchers.IO){
                ApiConnection(getApplication()).connectionService.signUpAsync(newUser).await()
            }

    }


    override fun onCleared() {
        super.onCleared()
        viewModalJob.cancel()
    }
}

object FileUtil {
    /*
     * Gets the file path of the given Uri.
     */
    @SuppressLint("NewApi")
    fun getPath(uri: Uri, context: Context): String? {
        var uri = uri
        val needToCheckUri = Build.VERSION.SDK_INT >= 19
        var selection: String? = null
        var selectionArgs: Array<String>? = null
        // Uri is different in versions after KITKAT (Android 4.4), we need to
        // deal with different Uris.
        if (needToCheckUri && DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).toTypedArray()
                return Environment.getExternalStorageDirectory().toString() + "/" + split[1]
            } else if (isDownloadsDocument(uri)) {
                val id = DocumentsContract.getDocumentId(uri)
                if (id.startsWith("raw:")) {
                    return id.replaceFirst("raw:".toRegex(), "")
                }
                uri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(id))
            } else if (isMediaDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).toTypedArray()
                val type = split[0]
                when (type) {
                    "image" -> uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                    "video" -> uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                    "audio" -> uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                }
                selection = "_id=?"
                selectionArgs = arrayOf(
                        split[1]
                )
            }
        }
        if ("content".equals(uri.scheme, ignoreCase = true)) {
            val projection = arrayOf(
                    MediaStore.Images.Media.DATA
            )
            try {
                context.contentResolver.query(uri, projection, selection, selectionArgs, null).use { cursor ->
                    if (cursor != null && cursor.moveToFirst()) {
                        val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
                        return cursor.getString(columnIndex)
                    }
                }
            } catch (e: Exception) {
                Log.e("on getPath", "Exception", e)
            }
        } else if ("file".equals(uri.scheme, ignoreCase = true)) {
            return uri.path
        }
        return null
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    private fun isExternalStorageDocument(uri: Uri): Boolean {
        return "com.android.externalstorage.documents" == uri.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    private fun isDownloadsDocument(uri: Uri): Boolean {
        return "com.android.providers.downloads.documents" == uri.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    private fun isMediaDocument(uri: Uri): Boolean {
        return "com.android.providers.media.documents" == uri.authority
    }
}