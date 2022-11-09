package com.example.gamenavcompex

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import com.example.gamenavcompex.databinding.FragmentMainBinding
import kotlinx.coroutines.Dispatchers.Main

class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater,
            R.layout.fragment_main,
            container,
            false)
        binding.playButton.setOnClickListener {view: View ->
            var playerName = binding.textInputLayout.editText?.text.toString()

            view.findNavController()
                .navigate(MainFragmentDirections.actionMainFragmentToGameFragment(playerName))




        }

        return binding.root
    }
}

