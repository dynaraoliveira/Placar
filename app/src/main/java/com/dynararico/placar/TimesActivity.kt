package com.dynararico.placar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)

        btIniciarJogo.setOnClickListener{
            val intent = Intent(this,PlacarActivity::class.java)
            intent.putExtra("TIMEA", inputTimeA.text.toString())
            intent.putExtra("TIMEB", inputTimeB.text.toString())
            startActivity(intent)
        }

        btNovoJogo.setOnClickListener{

        }
    }
}
