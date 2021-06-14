package com.example.first_drawer

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Drone_Details : AppCompatActivity() {

    lateinit var Drone_0ption: TextView
    lateinit var Drone_upload: TextView
    lateinit var upload_image_drone: ImageView
    private val cameraRequest = 1888
    val list = arrayOf("Yes", "No")
    val Lsit = arrayOf("Type A", "Type B", "Type C", "Type D")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drone__details)
        upload_image_drone = findViewById(R.id.upload_image_drone)
        Drone_upload = findViewById(R.id.photo_drone_upload)
        Drone_0ption = findViewById(R.id.drone_pic)
        Drone_0ption.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, cameraRequest)

        }

        //Permission for Camera
        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_DENIED
        )
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), cameraRequest)


        var Drone_type: Spinner = findViewById(R.id.spinner1)
        var DCGA: Spinner = findViewById(R.id.spinner2)
        if (DCGA != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, list
            )
            DCGA.adapter = adapter

        }

        if (Drone_type != null) {
            val adapter1 = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, Lsit
            )
            Drone_type.adapter = adapter1

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == cameraRequest) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            upload_image_drone.setImageBitmap(photo)
            Drone_0ption.visibility = View.INVISIBLE
            Drone_upload.visibility = View.VISIBLE
        }
    }

}


