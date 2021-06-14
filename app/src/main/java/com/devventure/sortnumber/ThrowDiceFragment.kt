package com.devventure.sortnumber

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.devventure.sortnumber.databinding.FragmentThrowDiceBinding
import kotlinx.coroutines.delay

class ThrowDiceFragment : Fragment() {
    private var binding: FragmentThrowDiceBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThrowDiceBinding.inflate(inflater, container, false)

        val dado01 = binding?.dado1
        val dado02 = binding?.dado2
        val btn = binding?.playGame
        val welcomeText = binding?.welcomeText
        val shareButton = binding?.floatingActionButton

        welcomeText?.text = "Good lucky ${arguments?.getString("playerName")}!"

        val images = listOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

        btn?.setOnClickListener{
            dado01?.setImageResource(images.random())
            dado01?.animate()?.rotation(dado01.rotation - 720)?.start()
            dado02?.setImageResource(images.random())
            dado02?.animate()?.rotation(dado02.rotation - 720)?.start()
        }

        shareButton?.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "You are a lucky person !!!")
            intent.setPackage("com.whatsapp")
            intent.type = "text/plain"

            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null){
                    startActivity(intent)
                } else {
                    Toast.makeText(context, "You don´t have the WhatsApp application installed",
                        Toast.LENGTH_LONG).show()
                }
            }

        }

        return binding?.root
    }
}