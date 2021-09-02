    package app.ourapps.apps_rebuild.ui.seedp.germinasi_2.kutip_kch_2

import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.ourapps.apps_rebuild.databinding.FragmentSeedGermin2KutipKch2TambahBinding

    class SeedGermin2KutipKch2TambahFragment : Fragment() {

    private var _binding: FragmentSeedGermin2KutipKch2TambahBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSeedGermin2KutipKch2TambahBinding.inflate(layoutInflater, container, false)
        val root = binding.root

        // Inflate the layout for this fragment
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.edtNoKutip.inputType = InputType.TYPE_NULL
        binding.edtNoKutip.setTextIsSelectable(false)
    }
}