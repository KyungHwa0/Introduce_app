package com.example.mypage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)

        val editId = findViewById<EditText>(R.id.editId)
        val idData = intent.getStringExtra("strIdData")
        editId.setText(idData)

        val pwData = intent.getStringExtra("strIdData")
        val editPw = findViewById<EditText>(R.id.editPw)
        editPw.setText(pwData)

        val btnSingUp = findViewById<Button>(R.id.btnSignUp)
        btnSingUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        val btnLogIn = findViewById<Button>(R.id.btnLogin)
        btnLogIn.setOnClickListener {
            val edit_id = findViewById<EditText>(R.id.editId)
            val idData = edit_id.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            if (editId.length() == 0) {
                Toast.makeText(applicationContext, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (editPw.length() == 0) {
                Toast.makeText(applicationContext, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                Toast.makeText(applicationContext, "로그인성공", Toast.LENGTH_SHORT).show()
                intent.putExtra("strIdData", idData)
                startActivity(intent)
            }
        }

    }
}