package com.navigation.ca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_blank.view.*

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        view.btGo.setOnClickListener{ goToSecond() }

        return view
    }

    private fun goToSecond() {
        var nome = "Gilson Junior"
        var brinquedo = BrinquedoDTO(1, "descricao", "status", 2, "19.99", null, "10 dias", "situacao", "acao", 3)
        var action:BlankFragmentDirections.ActionBlankFragmentToSecondFragment = BlankFragmentDirections.actionBlankFragmentToSecondFragment(nome, brinquedo)

        this.findNavController().navigate(action)
    }
}