package com.zoomapps.eromance.Controllers

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.MediaStore
import android.provider.DocumentsContract
import android.content.ContentUris
import android.graphics.Bitmap
import android.os.Environment.getExternalStorageDirectory
import android.os.Build
import android.os.Environment
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import java.io.ByteArrayOutputStream
import android.graphics.BitmapFactory
import android.util.Log
import android.widget.Toast
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import java.io.File
import java.util.*


/**
 * Created by User on 03.05.2017.
 */


fun getPath(context: Context, uri: Uri): String? {

    val isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

    // DocumentProvider
    if (isKitKat && DocumentsContract.isDocumentUri(context, uri)) {
        // ExternalStorageProvider
        if (isExternalStorageDocument(uri)) {
            val docId = DocumentsContract.getDocumentId(uri)
            val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val type = split[0]

            if ("primary".equals(type, ignoreCase = true)) {
                return Environment.getExternalStorageDirectory().toString() + "/" + split[1]
            }

            // TODO handle non-primary volumes
        } else if (isDownloadsDocument(uri)) {

            val id = DocumentsContract.getDocumentId(uri)
            val contentUri = ContentUris.withAppendedId(
                    Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(id)!!)

            return getDataColumn(context, contentUri, null, null)
        } else if (isMediaDocument(uri)) {
            val docId = DocumentsContract.getDocumentId(uri)
            val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val type = split[0]

            var contentUri: Uri? = null
            if ("image" == type) {
                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            } else if ("video" == type) {
                contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            } else if ("audio" == type) {
                contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            }

            val selection = "_id=?"
            val selectionArgs = arrayOf(split[1])

            return getDataColumn(context, contentUri, selection, selectionArgs)
        }// MediaProvider
        // DownloadsProvider
    } else if ("content".equals(uri.scheme, ignoreCase = true)) {

        // Return the remote address
        if (isGooglePhotosUri(uri))
            return uri.lastPathSegment

        return getDataColumn(context, uri, null, null)
    } else if ("file".equals(uri.scheme, ignoreCase = true)) {
        return uri.path
    }// File
    // MediaStore (and general)

    return null
}
fun loadImageToIV(_ctx:Context , toView: ImageView , img_path:String?){
    if(img_path!=null && checkImage(img_path))
                Glide.with(_ctx)
                        .load(GlobalVariables.server_url + img_path)
                        .error(R.drawable.error_image_place_holder)
                        .into(toView)


}
fun loadImageToIV(_ctx:Context , toView: CircleImageView , img_path:String?){
    if(img_path!=null && checkImage(img_path))
        Glide.with(_ctx)
                .load(GlobalVariables.server_url + img_path)
                .error(R.drawable.error_image_place_holder)
                .into(toView)
    Log.e("avatar", GlobalVariables.server_url + img_path);
}
fun getImagePath(img_path:String?):String? {
    if(checkImage(img_path))
        return GlobalVariables.server_url + img_path;
    else
        return null
}

fun setRating(_ctx:Context , toView: ImageView , rating:Double){
   val roundRating = Math.round(rating.toFloat())
    when(roundRating){
        0->{
            toView.setImageResource(R.drawable.icon_user_stars_zero)
        }
        1->{
            toView.setImageResource(R.drawable.icon_user_stars_one)
        }
        2->{
            toView.setImageResource(R.drawable.icon_user_stars_two)
        }
        3->{
            toView.setImageResource(R.drawable.icon_user_stars_three)
        }
        4->{
            toView.setImageResource(R.drawable.icon_user_stars_four)
        }
        5->{
            toView.setImageResource(R.drawable.icon_user_stars_five)
        }
    }
}
/**
 * Get the value of the data column for this Uri. This is useful for
 * MediaStore Uris, and other file-based ContentProviders.

 * @param context The context.
 * *
 * @param uri The Uri to query.
 * *
 * @param selection (Optional) Filter used in the query.
 * *
 * @param selectionArgs (Optional) Selection arguments used in the query.
 * *
 * @return The value of the _data column, which is typically a file path.
 */
fun getDataColumn(context: Context, uri: Uri?, selection: String?,
                  selectionArgs: Array<String>?): String? {

    var cursor: Cursor? = null
    val column = "_data"
    val projection = arrayOf(column)

    try {
        cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null)
        if (cursor != null && cursor!!.moveToFirst()) {
            val index = cursor!!.getColumnIndexOrThrow(column)
            return cursor!!.getString(index)
        }
    } finally {
        if (cursor != null)
            cursor!!.close()
    }
    return null
}

/**
 * @param uri The Uri to check.
 * *
 * @return Whether the Uri authority is ExternalStorageProvider.
 */
fun isExternalStorageDocument(uri: Uri): Boolean {
    return "com.android.externalstorage.documents" == uri.getAuthority()
}

/**
 * @param uri The Uri to check.
 * *
 * @return Whether the Uri authority is DownloadsProvider.
 */
fun isDownloadsDocument(uri: Uri): Boolean {
    return "com.android.providers.downloads.documents" == uri.getAuthority()
}

/**
 * @param uri The Uri to check.
 * *
 * @return Whether the Uri authority is MediaProvider.
 */
fun isMediaDocument(uri: Uri): Boolean {
    return "com.android.providers.media.documents" == uri.getAuthority()
}

/**
 * @param uri The Uri to check.
 * *
 * @return Whether the Uri authority is Google Photos.
 */
fun isGooglePhotosUri(uri: Uri): Boolean {
    return "com.google.android.apps.photos.content" == uri.getAuthority()
}

fun getImageUri( inContext:Context, inImage: Bitmap?): Uri? {
    val bytes = ByteArrayOutputStream()
    inImage?.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
    // val path = MediaStore.Images.Media.insertImage(this.getContentResolver(), inImage, "title", null);
    var image_name = System.currentTimeMillis().toString();
    val path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage,if(image_name!=null) image_name+"_eromance" else "newTest", null)
    if(path!=null)
        return Uri.parse(path)
    else
        return null

}

fun calculateInSampleSize(
        options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
    // Raw height and width of image
    val height = options.outHeight
    val width = options.outWidth

    val stretch_width = Math.round(width.toFloat() / reqWidth.toFloat())
    val stretch_height = Math.round(height.toFloat() / reqHeight.toFloat())

    if (stretch_width <= stretch_height)
        return stretch_height
    else
        return stretch_width
}
fun bitmapToUriConverter(ctx:Context , mBitmap: Bitmap): Uri? {
    var uri: Uri? = null
    try {
        val options = BitmapFactory.Options()
        // Calculate inSampleSize
       // options.inSampleSize = calculateInSampleSize(options, 100, 100)

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false
        val newBitmap = Bitmap.createScaledBitmap(mBitmap, mBitmap.width, mBitmap.height,
                true)
//        val newBitmap = Bitmap.createScaledBitmap(mBitmap, 200, 200,
//                true)
        val file = File(ctx.getFilesDir(), "Image"
                + Random().nextInt() + ".jpeg")
        val out = ctx.openFileOutput(file.getName(),
                Context.MODE_WORLD_READABLE)
        newBitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
        out.flush()
        out.close()
        //get absolute path
        val realPath = file.getAbsolutePath()
        val f = File(realPath)
        uri = Uri.fromFile(f)

    } catch (e: Exception) {
        Log.e("Your Error Message", e.message)
    }

    return uri
}