package br.com.zup.minhamusicafavorita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalheAlbumBinding
import br.com.zup.minhamusicafavorita.models.Album

class DetalheAlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheAlbumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = TITULO_DETALHE_ALBUM


        val bundle = intent.getBundleExtra("BUNDLE")
        val album = bundle?.getParcelable<Album>(BANDA)
        album?.let {
            binding.ivAlbum.setImageResource(album.getFotoAlbum())
            binding.tvTitulo.text = album.getNomeDoAlbum()
            binding.tvDescricaoAlbum.text = album.getDescricaoDoAlbum()
            mostrarDado(binding.tvArtista, R.string.artista, album.getArtista())
            mostrarDado(binding.tvLancamento, R.string.lancamento, album.getLancamento().toString())
            mostrarDado(binding.tvGravadora, R.string.gravadora, album.getGravadora())
            mostrarDado(binding.tvEstudio, R.string.estudio, album.getEstudio())
            mostrarDado(binding.tvFormato, R.string.formato, album.getFormato())
            mostrarDado(binding.tvGenero, R.string.genero, album.getGeneros())

            binding.ivFavorito.setOnClickListener{
                if (!album.favorito){
                    Toast.makeText(this, MENSAGEM_FAVORITAR, Toast.LENGTH_LONG).show()
                    album.favorito = true
                }
            }
        }
    }

    fun mostrarDado(textView: TextView,campo: Int, texto: String){
        textView.text = getString(campo, texto)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}