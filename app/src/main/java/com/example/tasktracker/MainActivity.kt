package com.example.tasktracker

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.tasksRecyclerView)
        val listOfItems = mutableListOf<Task>()
        val adapter = Adapter(listOfItems)
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val stringForTask = findViewById<EditText>(R.id.userTask)
            listOfItems.add(Task(stringForTask))
        }
        adapter.notifyDataSetChanged()
    }

}



