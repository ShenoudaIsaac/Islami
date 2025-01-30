package com.shnsh.islami.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shnsh.islami.databinding.ItemQuranBinding
import com.shnsh.islami.models.QuranData

class QuranAdapter(var quransData: MutableList< QuranData>):RecyclerView.Adapter<QuranAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding=ItemQuranBinding.inflate(LayoutInflater.from(parent.context),parent,false)
return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quranData=quransData[position]
        holder.numSuras.text=" ${quranData.surasSorting +1  }"
        holder.surasNameAr.text=quranData.arSurasName
        holder.surasNameEn.text=quranData.enSurasName
        holder.versesNum.text=quranData.numOfVerses
        onItemClickListener?.let{
            holder.binding.root.setOnClickListener {
                onItemClickListener?.onItemClicked(quranData, position)
            }
        }
    }

    override fun getItemCount(): Int =quransData.size
    var onItemClickListener: OnItemClickListener?=null
fun interface OnItemClickListener{
    fun onItemClicked(quransData: QuranData,position: Int)
}



    class ViewHolder(val binding: ItemQuranBinding) :RecyclerView.ViewHolder(binding.root){
        val numSuras=binding.numSuras
        val surasNameAr=binding.surasNameAr
        val surasNameEn=binding.surasNameEn
        val versesNum=binding.numVerses




    }}
