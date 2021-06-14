package com.example.first_drawer.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.first_drawer.Document_upload
import com.example.first_drawer.Drone_Details
import com.example.first_drawer.Proflile_activity
import com.example.first_drawer.R
import com.example.first_drawer.ui.slideshow.paymentFragment

class DashboardFragment : Fragment() {

lateinit var Profile_card:CardView
lateinit var Drone_card:CardView
lateinit var Document_card:CardView
lateinit var Legal_card:CardView
lateinit var job_card:CardView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.frament_dashboard, container, false)
        Profile_card=root.findViewById(R.id.profile_act)
        job_card=root.findViewById(R.id.job_card)
        job_card.setOnClickListener {
            Toast.makeText(context,"Coming Soon...",Toast.LENGTH_LONG).show()
        }


        Drone_card=root.findViewById(R.id.Drone_card)
        Drone_card.setOnClickListener {
            startActivity(Intent(context,Drone_Details::class.java))
        }

        Legal_card=root.findViewById(R.id.Legal_card)

        Legal_card.setOnClickListener {
            Toast.makeText(context,"Coming Soon...",Toast.LENGTH_LONG).show()
        }

        Document_card=root.findViewById(R.id.document_card)

        Document_card.setOnClickListener{
            startActivity(Intent(context,Document_upload::class.java))
        }



        Profile_card.setOnClickListener {

            //val intent = Intent (requireContext(), Proflile_activity::class.java)
         //   Toast.makeText(context!!, "Rating is: ", Toast.LENGTH_LONG).show()

            startActivity(Intent(context,Proflile_activity::class.java))
        }
        return root
    }


}