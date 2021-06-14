package com.example.first_drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UploadFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.fragment_upload, container, false)
        val recyclerview:RecyclerView=root.findViewById(R.id.upload_recycler)
        recyclerview.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<upload_docs_model>()
        for (i in 1..20) {
            val drawable = when(i%3)
            {
                1->R.drawable.ic_baseline_dashboard_24
                2->R.drawable.ic_baseline_work_24
                else ->R.drawable.ic_baseline_settings_24
            }
           data.add(upload_docs_model(drawable))
             }
        val adapter =Uploaded_docs_Adapter(data)
        recyclerview.adapter=adapter


        return root
    }


}