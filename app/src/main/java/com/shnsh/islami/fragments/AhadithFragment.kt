package com.shnsh.islami.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shnsh.islami.R
import com.shnsh.islami.adapters.HadithAdapter
import com.shnsh.islami.databinding.FragmentAhadithBinding
import com.shnsh.islami.models.AhadithData

class AhadithFragment : Fragment() {
    private val ahadithlist=mutableListOf<AhadithData>()
    lateinit var  adapter:HadithAdapter


    lateinit var binding:FragmentAhadithBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentAhadithBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readAhadithFile()
        adapter=HadithAdapter(ahadithlist)
        binding.rvAhadith.adapter=adapter



    }
    fun readAhadithFile(){
        val fileContent=activity?.assets?.open("ahadith/ahadeth.txt")
            ?.bufferedReader().use { it?.readText() }
        if (fileContent==null)return
        val hadithList=fileContent?.trim()?.split("#")
        hadithList?.forEach { singleHadith ->
            val lines=singleHadith.trim().split("\n")
            val title= lines[0]
            val content =lines.takeLast(lines.size-1).joinToString ( "\n" )
            val hadith=AhadithData(title,content)
            ahadithlist.add(hadith)

        }
    }
}