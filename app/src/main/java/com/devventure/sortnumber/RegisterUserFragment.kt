package com.devventure.sortnumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.devventure.sortnumber.databinding.FragmentRegisterUserBinding

class RegisterUserFragment : Fragment() {
    private var binding: FragmentRegisterUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterUserBinding.inflate(inflater, container, false)
        val playerName = binding?.playerName
        val registerPlayer = binding?.registerPlayer

        registerPlayer?.setOnClickListener{
            val player = playerName?.text.toString()
            findNavController().navigate(R.id.action_registerUserFragment_to_throwDiceFragment2, bundleOf("playerName" to player))
        }
        return binding?.root
    }

}
