package com.example.gamenavcompex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.gamenavcompex.databinding.FragmentGameBinding
import com.example.gamenavcompex.databinding.FragmentMainBinding

class GameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater,
            R.layout.fragment_game,
            container,
            false
        )
        val args = GameFragmentArgs.fromBundle(requireArguments())

        binding.nameView.text =  args.playerName
        binding.submitButton.setOnClickListener { view: View ->
            val checkedId = binding.radioGroup.checkedRadioButtonId

            if (checkedId == R.id.radioButton3) {
            //gamewon
            // We've won!  Navigate to the gameWonFragment.
            view.findNavController()
                .navigate(R.id.action_gameFragment_to_gameWonFragment)

            }
        else{
            //gameover
                view.findNavController()
                    .navigate(R.id.action_gameFragment_to_gameOverFragment)

            }
            }
        return binding.root

    }
}
