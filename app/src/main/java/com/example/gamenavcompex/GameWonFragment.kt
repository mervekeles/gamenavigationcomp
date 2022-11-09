package com.example.gamenavcompex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.gamenavcompex.databinding.FragmentGamewonBinding

class GameWonFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGamewonBinding>(inflater, R.layout.fragment_gamewon, container, false)

        return binding.root
    }
}