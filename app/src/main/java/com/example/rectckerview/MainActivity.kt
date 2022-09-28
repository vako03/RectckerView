package com.example.rectckerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitList = listOf<Fruit>(
        Fruit("Mango","Joe"),
        Fruit( "Apple","Frank"),
        Fruit("Banana","Ton"),
        Fruit("Lemon","Alex"),
        Fruit ("Pear","Jie"),
        Fruit("Orange","Alex")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)

        recyclerView.setBackgroundColor(Color.YELLOW)

        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitList)


    }
}