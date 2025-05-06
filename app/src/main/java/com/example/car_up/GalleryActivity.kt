package com.example.car_up

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    private val parts = arrayOf(
        R.drawable.ecu, R.drawable.suspension, R.drawable.exhaust, R.drawable.turbocharge
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = PartAdapter(this, parts)
    }
}