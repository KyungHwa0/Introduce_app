package com.example.mypage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSingUp = findViewById<Button>(R.id.btnSignUp)
        btnSingUp.setOnClickListener {
            val edit_id = findViewById<EditText>(R.id.editId)
            val edit_pw = findViewById<EditText>(R.id.editPw)
            val edit_name = findViewById<EditText>(R.id.editName)
            val idData = edit_id.text.toString()
            val pwData = edit_pw.text.toString()
            val intent = Intent(this, SignInActivity::class.java)
            if (edit_id.length() == 0) {
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (edit_pw.length() == 0) {
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (edit_name.length() == 0) {
                Toast.makeText(applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                intent.putExtra("strIdData", idData)
                intent.putExtra("strPwData", pwData)
                startActivity(intent)
                finish()
            }
        }
    }
}