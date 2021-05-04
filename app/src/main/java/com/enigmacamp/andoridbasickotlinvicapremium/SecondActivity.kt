package com.enigmacamp.andoridbasickotlinvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView

class SecondActivity : AppCompatActivity() {

    private lateinit var nametextView : MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nametextView = findViewById(R.id.text_view_secondActivity)

        val name = intent.getStringExtra(MainActivity.USER_NAME)
        nametextView.text = name
    }
}