package com.rasel.aiphoto

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 50, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "Rasel AI Photo Studio"
        title.textSize = 26f
        title.setTextColor(Color.BLUE)
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Professional Passport Photo Editor"
        subtitle.textSize = 16f
        layout.addView(subtitle)

        val button = Button(this)
        button.text = "Select Photo"
        layout.addView(button)

        setContentView(layout)
    }
}
