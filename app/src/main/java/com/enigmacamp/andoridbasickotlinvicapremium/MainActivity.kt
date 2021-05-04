package com.enigmacamp.andoridbasickotlinvicapremium

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView : MaterialTextView
    private var starCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
    }

    fun increase(view: View) {
        //pakai ++ boleh atau pakai +=1 karena sama setiap valuenya akan bertamabah satu
        starCounter+=1
        textView.text = starCounter.toString()
    }
    fun decrease(view: View) {
        starCounter-=1
        textView.text = starCounter.toString()
    }
}