package br.com.zup.minhamusicafavorita.fotos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhamusicafavorita.databinding.CardAlbumBinding
import br.com.zup.minhamusicafavorita.models.Album

class AlbumAdapter(
    private var listaAlbuns: MutableList<Album>,
    private var clickAlbum: (album: Album) -> Unit
) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaAlbuns[position]

        holder.setarInformacoes(item)
        holder.binding.cvAlbum.setOnClickListener{
            clickAlbum(item)
        }
    }

    override fun getItemCount(): Int = listaAlbuns.size

    fun atualizarListaAlbuns(novaLista: MutableList<Album>) {
        if (listaAlbuns.size == 0) {
            listaAlbuns = novaLista
        }else{
            listaAlbuns.addAll(novaLista)
        }

        notifyDataSetChanged()
    }

    class ViewHolder(val binding: CardAlbumBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setarInformacoes(album: Album) {
            binding.ivFotoAlbum.setImageResource(album.getFotoAlbum())
        }
    }
}