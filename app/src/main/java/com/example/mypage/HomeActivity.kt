package com.example.mypage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imgView = findViewById<ImageView>(R.id.myImg)
        val imageRandom = when ((1..5).random()) {
            1 -> imgView.setImageResource(R.drawable.latte1)
            2 -> imgView.setImageResource(R.drawable.latte2)
            3 -> imgView.setImageResource(R.drawable.latte3)
            4 -> imgView.setImageResource(R.drawable.latte4)
            5 -> imgView.setImageResource(R.drawable.latte5)
            else ->
                imgView.setImageResource(R.drawable.latte1)

        }

        val idData = "ID : " + intent.getStringExtra("strIdData")
        val editId = findViewById<EditText>(R.id.editId)
        editId.setText(idData)

        val btnExt = findViewById<Button>(R.id.btnExt)
        btnExt.setOnClickListener {
            finish()
        }
    }
}