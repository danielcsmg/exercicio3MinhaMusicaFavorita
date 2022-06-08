package br.com.zup.minhamusicafavorita.informacoes

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.adapter.InformacoesAdapter
import br.com.zup.minhamusicafavorita.databinding.ActivityInformacoesBinding
import com.google.android.material.tabs.TabLayoutMediator

class InformacoesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformacoesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInformacoesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        exibirAppBarCustomizada()

        val tabLayout = binding.tlInformacoes
        val viewPager = binding.vpInformacoesBanda
        viewPager.adapter = InformacoesAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Informações"
                1 -> tab.text = "Fotos"
            }
        }.attach()
    }

    private fun exibirAppBarCustomizada() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.detalhes_banda)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}