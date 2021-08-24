package com.example.tasktracker

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.tasksRecyclerView)
        val listOfItems = mutableListOf<Task>()
        val adapter = Adapter(listOfItems)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val stringForTask = findViewById<EditText>(R.id.userTask).text.toString()
            listOfItems.add(Task(stringForTask)).toString()
            adapter.notifyDataSetChanged()
        }


    }

}



