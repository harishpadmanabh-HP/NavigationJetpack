package com.hp.navigationjetpack


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.hp.navigationjetpack.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment with binding

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_second, container, false)

        // !! refers it cant be a null
        var input:String? = arguments!!.getString("user_input")

        binding.textview.text = input
        return binding.root
    }


}
