package com.claudio.appduastelas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)

        val nome = intent.getStringExtra("nome")
        val mensagem = intent.getStringExtra("mensagem")

        textoResultado.text = "Olá, $nome!\nSua mensagem foi:\n\"$mensagem\""

        botaoVoltar.setOnClickListener {
            finish() // Volta para a primeira tela
        }}
}