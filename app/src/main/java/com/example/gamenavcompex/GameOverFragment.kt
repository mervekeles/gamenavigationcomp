package com.example.gamenavcompex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.gamenavcompex.databinding.FragmentGameoverBinding
import com.example.gamenavcompex.databinding.FragmentGamewonBinding

class GameOverFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameoverBinding>(inflater, R.layout.fragment_gameover, container, false)
binding.tryAgainButton.setOnClickListener { view ->
    view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
}
        return binding.root
    }
}