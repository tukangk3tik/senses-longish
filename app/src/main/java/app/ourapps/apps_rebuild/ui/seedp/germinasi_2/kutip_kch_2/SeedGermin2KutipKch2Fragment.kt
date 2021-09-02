package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.R
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2KutipKch2Binding

class SeedGermin2KutipKch2Fragment : Fragment() {

    private var _binding: FragmentSeedGermin2KutipKch2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin2KutipKch2Binding.inflate(layoutInflater, container, false)
        val root = binding.root

        binding.btnAddItem.setOnClickListener {
            val mFragment = SeedGermin2KutipKch2TambahFragment()
            val mFragmentManager = parentFragmentManager
            mFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_kutip_kch2, mFragment, SeedGermin2KutipKch2TambahFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        // Inflate the layout for this fragment
        return root
    }
}