package com.shnsh.islami.fragments

import android.graphics.Matrix
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView.ScaleType
import androidx.fragment.app.Fragment
import com.shnsh.islami.databinding.FragmentSebhaBinding


class SebhaFragment : Fragment() {
    lateinit var binding:FragmentSebhaBinding

    var counterr=0
    var zekrr="سبحان الله"
   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSebhaBinding.inflate(inflater,container,false)
        return binding.root

    }
    var degrees= 150f

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.counter.text =counterr.toString()
        binding.zekr.text=zekrr

        binding.sebhaBody.setOnClickListener {

            val matrix = Matrix()



            binding.sebhaBody.setScaleType(ScaleType.MATRIX) //required
            matrix.postRotate(
                degrees,
                (binding.sebhaBody.getDrawable().getBounds().width() / 2).toFloat(),
                (binding.sebhaBody.getDrawable().getBounds().height() / 2).toFloat()
            )
            degrees=degrees+150
            binding.sebhaBody.setImageMatrix(matrix)
            counterr++
            binding.counter.text = counterr.toString()
            if (counterr % 33 == 0)
                binding.zekr.text = "الحمد لله"
            if (counterr % 66 == 0)
                binding.zekr.text="استغفر الله"
            if (counterr%99==0)
                binding.zekr.text="سبحان الله"


        }}}


