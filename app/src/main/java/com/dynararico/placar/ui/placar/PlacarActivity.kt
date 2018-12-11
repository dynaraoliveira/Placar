package com.dynararico.placar.ui.placar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dynararico.placar.R
import com.dynararico.placar.utils.KEY_EXTRA_TIME_A
import com.dynararico.placar.utils.KEY_EXTRA_TIME_B
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var placarA: Int = 0
    private var placarB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        if(savedInstanceState!=null){
            placarA = savedInstanceState.getInt("PLACAR_CASA")
            placarB = savedInstanceState.getInt("PLACAR_VISITANTE")

            tvPlacarTimeA.text = placarA.toString()
            tvPlacarTimeB.text = placarB.toString()
        }

        tvTimeA.text = intent.extras.getString(KEY_EXTRA_TIME_A)
        tvTimeB.text = intent.extras.getString(KEY_EXTRA_TIME_B)

        bt3PontosTimeA.setOnClickListener { adicionaPontoTimeA(3) }
        bt2PontosTimeA.setOnClickListener { adicionaPontoTimeA(2) }
        bt1PontoTimeA.setOnClickListener { adicionaPontoTimeA(1) }

        bt3PontosTimeB.setOnClickListener { adicionaPontoTimeB(3) }
        bt2PontosTimeB.setOnClickListener { adicionaPontoTimeB(2) }
        bt1PontoTimeB.setOnClickListener {  adicionaPontoTimeB(1) }

        btReiniciar.setOnClickListener {  }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("PLACAR_CASA", placarA)
        outState?.putInt("PLACAR_VISITANTE", placarB)
    }

    private fun adicionaPontoTimeA(ponto: Int) {
        placarA += ponto
        tvPlacarTimeA.text = placarA.toString()
    }

    private fun adicionaPontoTimeB(ponto: Int) {
        placarB += ponto
        tvPlacarTimeB.text = placarB.toString()
    }
}

