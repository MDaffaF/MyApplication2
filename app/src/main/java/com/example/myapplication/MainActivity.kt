package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
    private lateinit var binding: AdapterList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Inisialisasi RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList(
                judul = "Judul 1", subJudul = "Deskripsi 1",
                imageUrl = "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            ),
            ItemList(
                judul = "Judul 2", subJudul = "Deskripsi 2",
                imageUrl = "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            ),
            ItemList(
                judul = "Judul 3", subJudul = "Deskripsi 3",
                imageUrl = "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            )
        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}