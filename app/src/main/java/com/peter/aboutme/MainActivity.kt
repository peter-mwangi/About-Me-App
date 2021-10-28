package com.peter.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var nameInput: EditText
    lateinit var doneBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.name_input)
        doneBtn = findViewById(R.id.done_btn)

        doneBtn.setOnClickListener {

            if (nameInput.text.isEmpty())
            {
                nameInput.setError("Cannot Be Empty")
                nameInput.requestFocus();
            }
            else
            {
                Toast.makeText(this, nameInput.text.toString(), Toast.LENGTH_LONG).show();
                nameInput.text = null
            }
        }

    }
}
