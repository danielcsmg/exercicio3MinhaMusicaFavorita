package br.com.zup.minhamusicafavorita.fotos

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhamusicafavorita.BANDA
import br.com.zup.minhamusicafavorita.DetalheAlbumActivity
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.fotos.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.models.Album

class FotosFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private lateinit var listaAlbuns: MutableList<Album>
    private val adapter: AlbumAdapter by lazy {
        AlbumAdapter(mutableListOf(), this::irParaDetalheAlbum)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFotosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.rvAlbum
        adicionarListaDeAlbuns()

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 2)

        R.layout.card_album


    }

    private fun adicionarListaDeAlbuns() {
        listaAlbuns = mutableListOf(
            Album(
                R.drawable.high_voltage_acdc,
                "High Voltage",
                "High Voltage é o álbum de estreia da banda de rock australiana, AC/DC, lançado em 17 de fevereiro de 1975, apenas na Austrália.",
                "AC/DC",
                1975,
                "Albert Productions",
                "Columbia Records",
                "Disco",
                "Rock, Hard rock, Blues-rock"
            ),

            Album(
                R.drawable.tnt_acdc,
                "T.N.T.",
                "T.N.T. é o segundo álbum de estúdio da banda de rock australiana AC/DC.",
                "AC/DC",
                1976,
                "Albert Productions",
                "Columbia Records",
                "Disco",
                "Rock, Hard rock, Blues-rock"
            ),

            Album(
                R.drawable.dirty_deeds_done_dirt_cheap_acdc,
                "Dirty Deeds Done Dirt Cheap (1976)",
                "Dirty Deeds Done Dirt Cheap é o terceiro álbum de estúdio da banda de rock australiana AC/DC, lançado a 20 de setembro de 1976.",
                "AC/DC",
                1976,
                "Albert Productions",
                "Columbia Records",
                "Disco",
                "Rock, Hard rock, Blues-rock, Heavy metal"
            ),
        )

        adapter.atualizarListaAlbuns(listaAlbuns)
    }

    private fun irParaDetalheAlbum(album: Album){
        val bundle = bundleOf(BANDA to album)
        startActivity(Intent(context, DetalheAlbumActivity::class.java), bundle)
    }

}