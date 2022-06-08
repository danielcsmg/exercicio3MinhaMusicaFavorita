package br.com.zup.minhamusicafavorita.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavorita.fotos.FotosFragment
import br.com.zup.minhamusicafavorita.InformacoesFragment

class InformacoesAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> InformacoesFragment()
            1 -> FotosFragment()
            else -> InformacoesFragment()
        }
    }
}