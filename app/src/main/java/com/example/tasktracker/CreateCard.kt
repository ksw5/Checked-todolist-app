package com.example.tasktracker


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_task.*



class CreateCard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)

        add_button.setOnClickListener {
            if(tasksTitle.text.toString().trim{it <= ' '}.isNotEmpty()) {
                var title = tasksTitle.getText().toString()
                DataObject.setData(title)
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
        }
    }
}


