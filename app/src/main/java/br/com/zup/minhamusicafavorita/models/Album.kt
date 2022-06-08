package br.com.zup.minhamusicafavorita.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Album(
    private val fotoAlbum: Int,
    private val nomeDoAlbum: String,
    private val descricaoDoAlbum: String,
    private val artista: String,
    private val lancamento: Int,
    private val gravadora: String,
    private val estudio: String,
    private val formato: String,
    private val generos: String
): Parcelable{
    fun getFotoAlbum() = fotoAlbum
    fun getNomeDoAlbum() = nomeDoAlbum
    fun getDescricaoDoAlbum() = descricaoDoAlbum
    fun getArtista() = artista
    fun getLancamento() = lancamento
    fun getGravadora() = gravadora
    fun getEstudio() = estudio
    fun getFormato() = formato
    fun getGeneros() = generos
}