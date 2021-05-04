package com.enigmacamp.andoridbasickotlinvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    private lateinit var textInputName : TextInputEditText
    private lateinit var textViewName : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInputName = findViewById(R.id.input_name)
        textViewName = findViewById(R.id.text_view_name)
    }

    fun showName(view: View) {
        val name = textInputName.text
        textViewName.text = name
    }
}