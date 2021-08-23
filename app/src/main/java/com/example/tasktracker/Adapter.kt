package com.example.tasktracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val listOfItems: MutableList<Task>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val items = inflater.inflate(R.layout.view, parent, false)
        // Return a new holder instance
        return ViewHolder(items)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task: Task = listOfItems.get(position)
        holder.title.text = task.title.toString()

    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val title: TextView = itemView.findViewById<EditText>(R.id.title)

    }


}