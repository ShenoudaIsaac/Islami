package com.shnsh.islami.fragments

import AppConstants
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shnsh.islami.QuranAdapter
import com.shnsh.islami.R
import com.shnsh.islami.databinding.FragmentQuranBinding
import com.shnsh.islami.models.QuranData

class QuranFragment : Fragment() {
    lateinit var  adapter:QuranAdapter
    lateinit var binding:FragmentQuranBinding
     private var quransData= mutableListOf<QuranData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding=FragmentQuranBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter=QuranAdapter(quranList)
        binding.quranRecycle.adapter=adapter

    }
    val quranList=AppConstants.getQuranData()




}