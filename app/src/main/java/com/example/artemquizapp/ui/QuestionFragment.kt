package com.example.artemquizapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.artemquizapp.R
import com.example.artemquizapp.databinding.FragmentQuestionBinding
import com.example.artemquizapp.viewmodels.QuizViewModel

class QuestionFragment : Fragment() {

    private var _binding: FragmentQuestionBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel : QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener {
            viewModel.cn.value = viewModel.cn.value!! + 1
           // findNavController().navigate(R.id.action_questionFragment_to_quizResultFragment)
        }
        viewModel.cn.observe(requireActivity()) { number ->
            binding.currentTextView.text = number.toString()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}