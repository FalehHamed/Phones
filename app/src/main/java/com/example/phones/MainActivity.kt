package com.example.phones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.phones.adapter.PhonesAdapter
import com.example.phones.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val datset = DataSource().loadPhones()
        val recyclerView = findViewById<RecyclerView>(R.id.rv_Phones)
        val adapter = PhonesAdapter(this, datset)
        recyclerView.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

    }
}