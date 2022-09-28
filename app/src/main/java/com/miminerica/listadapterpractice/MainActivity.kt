package com.miminerica.listadapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miminerica.listadapterpractice.adapters.MyListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myList = arrayListOf("one", "two", "three", "four", "five")

        val myAdapter =  MyListAdapter(this, myList, R.layout.adapter_list_view)

        listView.adapter = myAdapter
    }
}