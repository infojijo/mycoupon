package com.cjnet.mycoupons.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cjnet.mycoupons.R

class ListFragment : Fragment() {

    private lateinit var dashboardViewModel: ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(ListViewModel::class.java)
        //This method is just a sample.
        val rootViewName = inflater.inflate(R.layout.fragment_list, container, false)
        val textView: TextView = rootViewName.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
            //it here means this in old Java language
            //even i have few changes to be done, here we go.
            //in between that main branch pushed
            //second line for rebase

            //fixes made by other teams.

            //feature 1

            //feature 2
            //this is a huge bug fix

            //feature 1

            //feature 2
            //this is a huge bug fix

            //nice bug fix 13
        })
        return rootViewName
    }
}