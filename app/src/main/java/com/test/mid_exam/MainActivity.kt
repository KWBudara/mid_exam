package com.test.mid_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun adapter(
            flagImages: List<Int>,
            countryNames: List<String>
        ): RecyclerView.Adapter<RecyclerView.ViewHolder>? {
            TODO("Not yet implemented")
        }

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
            recyclerView.layoutManager= LinearLayoutManager(this)
            // Using ArrayList to store images data
            // Using ArrayList to store images data
            val flagImages= listOf(R.drawable.argentina,R.drawable.argentina)
            val countryNames= listOf("Argentina","Australia")
            recyclerView.adapter=adapter(flagImages,countryNames)
        }
    }
}