package com.hybrid.timedemo.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.hybrid.timedemo.R

/**
 * A simple [Fragment] subclass.
 */
class AfternoonFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_afternoon, container, false)
    }


}
