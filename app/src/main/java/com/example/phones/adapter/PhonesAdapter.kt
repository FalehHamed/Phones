package com.example.phones.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.phones.R
import com.example.phones.model.Phones

class PhonesAdapter (private val context: Context,
                     private val dataset : List<Phones>)
    : RecyclerView.Adapter<PhonesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_phones, parent, false)
        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.PhoneName.text = context.resources.getString(item.PhoneName)
        holder.PhoneImage.setImageResource(item.PhoneImage)

        holder.itemView.setOnClickListener {
            Toast.makeText(context, item.PhoneName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = dataset.size


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val PhoneName : TextView = view.findViewById(R.id.item_phones_name)
        val PhoneImage : ImageView = view.findViewById(R.id.item_phones_img)

    }

}