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


        val editTextMensagem = findViewById<EditText>(R.id.entradaTexto)
        val buttonEnviar = findViewById<Button>(R.id.botaoEnviar)

        buttonEnviar.setOnClickListener {
            val mensagem = editTextMensagem.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("mensagem", mensagem)
            startActivity(intent)
        }
    }
}