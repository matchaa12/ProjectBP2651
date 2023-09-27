package com.example.projectbp2651

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginModel : AppCompatActivity() {
    variabel
    var username = ""
    var password = ""
    //method/fc
    fun LoginCheck():Boolean{
        if (username.equals("bayu") && password.equals("amikom")){
            return true
        }else{
            return
        }
    }
}