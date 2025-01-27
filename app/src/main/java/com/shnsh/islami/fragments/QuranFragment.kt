package com.shnsh.islami.fragments

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
    lateinit var binding:FragmentQuranBinding
     private var quransData= mutableListOf<QuranData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding=FragmentQuranBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createQuranList()
        val adapter=QuranAdapter(quransData)
        binding.quranRecycle.adapter=adapter

    }

    private fun createQuranList() {
        for (i in 1..100)
        quransData.add(QuranData(i,"الفاتحة","alfatiha","30"))
    }


}