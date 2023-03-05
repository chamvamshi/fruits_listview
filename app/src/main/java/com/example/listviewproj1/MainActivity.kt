package com.example.listviewproj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)


        val Arraylists = arrayListOf<String>()
        Arraylists.add("MANGO")
        Arraylists.add("APPLE")
        Arraylists.add("ORANGE")
        Arraylists.add("PINEAPPLE")
        Arraylists.add("BANANA")
        Arraylists.add("MUSK MELON")

        val arrayListAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,Arraylists)
        listview.adapter =arrayListAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            val list = "Clicked on Item : " + (view as TextView).text.toString()
            Toast.makeText(this,list,Toast.LENGTH_SHORT).show()
        }


    }
}