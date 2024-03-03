package com.paulo.appmenurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplahScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            var i = intent
            var j = Intent(this, DadosDoPedidoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
            }, 2000)
    }
}