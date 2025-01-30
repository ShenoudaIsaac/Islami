package com.shnsh.islami.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shnsh.islami.R
import com.shnsh.islami.databinding.FragmentSebhaBinding

class SebhaFragment : Fragment() {
    lateinit var binding:FragmentSebhaBinding

    var counterr=0
   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSebhaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.counter.text="0"
        binding.counter.setOnClickListener {
            counterr++
            binding.counter.text=counterr.toString()
        }
    }

}