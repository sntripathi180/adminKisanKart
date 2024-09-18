package com.example.adminappkisan.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adminappkisan.databinding.DeliveryItemBinding

class DeliveryAdapter(private val customerNames:MutableList<String>,private val moneyStatus:MutableList<Boolean>): RecyclerView.Adapter<DeliveryAdapter.DeliveryviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveryviewHolder {
        val binding =DeliveryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DeliveryviewHolder(binding)
    }



    override fun onBindViewHolder(holder: DeliveryviewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int =customerNames.size


    inner class DeliveryviewHolder (private val binding: DeliveryItemBinding) :RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.apply {
                customerName.text=customerNames[position]
                if(moneyStatus[position] == true){
                    statusMoney.text = "Received"
                }else{
                    statusMoney.text = "NotReceived"
                }

                val colorMap = mapOf(
                    true to Color.GREEN,false to Color.RED
                )
                statusMoney.setTextColor(colorMap[moneyStatus[position]]?:Color.BLACK)
                StausColor.backgroundTintList= ColorStateList.valueOf(colorMap[moneyStatus[position]]?:Color.BLACK)
            }
        }
    }

}