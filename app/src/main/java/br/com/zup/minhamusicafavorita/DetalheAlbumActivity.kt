package br.com.zup.minhamusicafavorita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalheAlbumBinding
import br.com.zup.minhamusicafavorita.models.Album

class DetalheAlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheAlbumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val album = intent.getBundleExtra(BANDA)

    }

    fun mostrarDado(textView: TextView,campo: Int, texto: String){
        textView.text = getString(campo, texto)
    }
}