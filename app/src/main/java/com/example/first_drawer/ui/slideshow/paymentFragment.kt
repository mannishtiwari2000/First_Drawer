package com.example.first_drawer.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.first_drawer.R
import com.example.first_drawer.Transacrion_Adapter
import com.example.first_drawer.Transaction_Model

class paymentFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_payment, container, false)

        val recycler:RecyclerView=root.findViewById(R.id.Transaction_Recyclerview)
        recycler.layoutManager = LinearLayoutManager(context)
        val data = ArrayList<Transaction_Model>()
        for (i in 1..20) {
            data.add(Transaction_Model("Manish", "Item " + i,"23 Jan"))
        }
        val adapter =Transacrion_Adapter(data)
        recycler.adapter=adapter
        return root
    }
}