package com.shnsh.islami

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shnsh.islami.databinding.ItemQuranBinding
import com.shnsh.islami.models.QuranData

class QuranAdapter(var quransData: MutableList< QuranData>):RecyclerView.Adapter<QuranAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding=ItemQuranBinding.inflate(LayoutInflater.from(parent.context),parent,false)
return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuranAdapter.ViewHolder, position: Int) {
        val quranData=quransData[position]
        holder.binding.numSuras.text=quranData.surasSorting.toString()
        holder.binding.surasNameAr.text=quranData.arSurasName
        holder.binding.surasNameEn.text=quranData.enSurasName
        holder.binding.numVerses.text=quranData.numOfVerses

    }

    override fun getItemCount(): Int =quransData.size




    class ViewHolder(val binding: ItemQuranBinding) :RecyclerView.ViewHolder(binding.root){
        val numSuras=binding.numSuras
        val surasNameAr=binding.surasNameAr
        val surasNameEn=binding.surasNameEn
        val versesNum=binding.numVerses




    }}
