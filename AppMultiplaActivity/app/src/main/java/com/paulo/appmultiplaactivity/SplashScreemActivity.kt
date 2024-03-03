package com.paulo.appmultiplaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screem)

        //Uma funcao handlre para elimiar a splash e chamar a proxima tela
        Handler(Looper.getMainLooper()).postDelayed({
            var i = Intent(this, MainActivity::class.java);
            startActivity(i);
            finish(); //elimina a splash
        },3000);
    }
}