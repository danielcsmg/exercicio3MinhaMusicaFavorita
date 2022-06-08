package br.com.zup.minhamusicafavorita.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.databinding.ActivityMainBinding
import br.com.zup.minhamusicafavorita.informacoes.InformacoesActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            val intent = Intent(this, InformacoesActivity::class.java)
            startActivity(intent)
        }
    }
}