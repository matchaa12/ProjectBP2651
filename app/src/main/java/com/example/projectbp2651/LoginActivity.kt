package com.example.projectbp2651

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //intent explicit
        //instance
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        val loginModel =LoginModel()
        //event btn Login click
        btnLogin.setOnClickListener {
            //input
            loginModel.username = txtUsername.text.toString()
            loginModel.password = txtPassword.text.toString()
            //validate
            if (txtUsername.text.toString().equals("bayu") &&
                txtPassword.text.toString().equals("amikom")
            ) {
                //call home activity
                val intenHome = Intent(this, HomeActivity::class.java)
                startActivity(intenHome)
            } else {
                Toast.makeText(this, "Username/Password salah!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}