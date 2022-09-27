package com.example.rectckerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {
    val fruitList = listOf<String>("Mango", "Apple", "Banana","Lemon","Pear","Orange")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.myTextView.text=fruit
    }

    override fun getItemCount(): Int {
       return  fruitList.size
    }

}

class MyViewHolder(val view:View):RecyclerView.ViewHolder(view){
    val myTextView = view.findViewById<TextView>(R.id.tvName)

}