package com.example.first_drawer

import android.Manifest
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.first_drawer.ui.home.DashboardFragment

class Proflile_activity : AppCompatActivity() {
    lateinit var photoO_0ption:TextView
    lateinit var photoO_upload:TextView

    private val cameraRequest = 1888
    lateinit var  upload_image_profile:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proflile_activity)
        photoO_0ption=findViewById(R.id.photo_profile_option)
        photoO_upload=findViewById(R.id.photo_profile_upload)
        upload_image_profile=findViewById(R.id.upload_image_profile)

        //Permission for Camera
        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), cameraRequest)

        //Take photo button
        photoO_0ption.setOnClickListener {

                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, cameraRequest)

        }
    }
//    private fun showDialog(title: String) {
//        val dialog = Dialog(this)
//        //dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setCancelable(true)
//        dialog.setTitle(title)
//        dialog.setContentView(R.layout.option_select_profile)
//        val Choose = dialog.findViewById(R.id.Choose_btn) as TextView
//        val take_pic = dialog.findViewById(R.id.take_photo_btn) as TextView
//        Choose.setOnClickListener {
//            dialog.dismiss()
//        }
//        take_pic.setOnClickListener { dialog.dismiss() }
//        dialog.show()

//    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == cameraRequest) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            upload_image_profile.setImageBitmap(photo)
            photoO_0ption.visibility= View.INVISIBLE
            photoO_upload.visibility= View.VISIBLE
        }
    }


}