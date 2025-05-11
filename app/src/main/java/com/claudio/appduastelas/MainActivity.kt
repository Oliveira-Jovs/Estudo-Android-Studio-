package com.claudio.appduastelas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.editTextNome)
        val mensagem = findViewById<EditText>(R.id.editTextMensagem)
        val botaoEnviar = findViewById<Button>(R.id.botaoEnviar)

        botaoEnviar.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("nome", nome.text.toString())
                putExtra("mensagem", mensagem.text.toString())
            }
            startActivity(intent)
        }
    }
}