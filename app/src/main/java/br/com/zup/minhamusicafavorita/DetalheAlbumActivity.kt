package br.com.zup.minhamusicafavorita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalheAlbumBinding

class DetalheAlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheAlbumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}