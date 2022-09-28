package com.miminerica.listadapterpractice.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.miminerica.listadapterpractice.R
import com.miminerica.listadapterpractice.MainActivity
import kotlinx.android.synthetic.main.activity_main.*


class MyListAdapter(val mContext : Context, val mList : ArrayList<String>, val resId : Int ) : BaseAdapter() {
    override fun getCount(): Int {
        return mList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, view: View?, p2: ViewGroup?): View {
        var tempRow = view
        if ( tempRow == null) {
            tempRow = View.inflate(mContext, resId, null)
        }

        val txt = tempRow!!.findViewById<TextView>(R.id.txt)
        val btn1 = tempRow.findViewById<Button>(R.id.btn1)
        val btn2 = tempRow.findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener {

        }

        txt.text = mList[position]

        return tempRow
    }
}