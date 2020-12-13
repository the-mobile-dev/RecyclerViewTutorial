package com.themobiledev.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.themobiledev.recyclerviewtutorial.models.TransportOption

class MainActivity : AppCompatActivity() {
    private val dataSet = listOf<TransportOption>(
        TransportOption(R.drawable.ic_baseline_airport_shuttle_24, R.string.bus, R.string.desc),
        TransportOption(R.drawable.ic_baseline_agriculture_24, R.string.tractor, R.string.desc),
        TransportOption(R.drawable.ic_baseline_directions_bike_24, R.string.bike, R.string.desc),
        TransportOption(R.drawable.ic_baseline_directions_boat_24, R.string.boat, R.string.desc),
        TransportOption(R.drawable.ic_baseline_directions_transit_24, R.string.subway, R.string.desc)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = TransportOptionAdapter(dataSet)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}