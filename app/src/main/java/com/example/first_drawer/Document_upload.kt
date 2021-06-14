package com.example.first_drawer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.FileUtils
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Document_upload : AppCompatActivity() {
    lateinit var select: TextView
    lateinit var image_docs: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_document_upload)

        image_docs = findViewById(R.id.logo_icon)
        select = findViewById(R.id.Proof_name)
        select.setOnClickListener {
            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)

            startActivityForResult(Intent.createChooser(intent, "Select a file"), 111)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 111 && resultCode == RESULT_OK) {
            val selectedFile = data?.data //The uri with the location of the file
               image_docs.setImageURI(selectedFile)
        }
    }

}