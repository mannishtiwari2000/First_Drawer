package com.example.first_drawer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Uploaded_docs_Adapter(private val mList: List<upload_docs_model>) : RecyclerView.Adapter<Uploaded_docs_Adapter.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val image:ImageView=ItemView.findViewById(R.id.upload_docs_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.uploaded_document,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     //   val Uploaded_docs= mList[position]
     // holder.image.setImageResource(Uploaded_docs.image)
//
    }

    override fun getItemCount(): Int {
       return mList.size
    }
}