package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.aerasi_r_gelap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import app.ourapps.apps_rebuild.databinding.ActivitySeedGermin2AerasiRgelapBinding
import app.ourapps.apps_rebuild.ui.seedp.germinasi_2.rendam.SeedGermin2RendamFragment

class SeedGermin2AerasiRGelapActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySeedGermin2AerasiRgelapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySeedGermin2AerasiRgelapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mListFragment = SeedGermin2AerasiRGelapFragment()
        val fragment = mFragmentManager.findFragmentByTag(SeedGermin2AerasiRGelapFragment::class.java.simpleName)

        if (fragment !is SeedGermin2AerasiRGelapFragment) {
            mFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerAerasiRuangGelap.id, mListFragment, SeedGermin2AerasiRGelapFragment::class.java.simpleName)
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}