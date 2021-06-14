package com.example.first_drawer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Transacrion_Adapter(private  val mList:List<Transaction_Model>):
    RecyclerView.Adapter<Transacrion_Adapter.ViewHolder>()
{
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val RecievedFrom: TextView = itemView.findViewById(R.id.RecevedFrom)
        val Amount: TextView = itemView.findViewById(R.id.Transaction_amount)
        val Transaction_Date: TextView = itemView.findViewById(R.id.Time_Transaction)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_history, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.Amount.text= ItemsViewModel.Amount.toString()
        holder.RecievedFrom.text=ItemsViewModel.Received
        holder.Transaction_Date.text=ItemsViewModel.Date
    }

    override fun getItemCount(): Int {

        return  mList.size
    }
}