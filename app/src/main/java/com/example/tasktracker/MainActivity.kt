package com.example.tasktracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.mutableListOf as mutableListOf1


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data
        // Lookup the recyclerview in activity layout
        val rvTasks = findViewById<RecyclerView>(R.id.tasksRecyclerView)

        // Create adapter passing in the sample user data
        val listOfItems = mutableListOf1<String>()
        // Attach the adapter to the recyclerview to populate items
        val adapter = Adapter(listOfItems)
        rvTasks.adapter = adapter
        // Set layout manager to position the items
        rvTasks.layoutManager = LinearLayoutManager(this)
        // That's all!

        // floating action button click will launch activity create task


    }

}



