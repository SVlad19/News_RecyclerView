package com.example.lab5_1

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val news = getNews()
        val rvNews = findViewById<RecyclerView>(R.id.rvNews)
        rvNews.adapter = NewsAdapter(news, this)
        rvNews.layoutManager = LinearLayoutManager(this)

    }

    fun getNews(): ArrayList<News>{

        val value = Random()

        val listHeader = ArrayList<String>(listOf(
            "Cyber Attack","Climate Crisis","Space Exploration","Health Crisis","Artificial Intelligence",
            "Renewable Energy","Cybersecurity","Environmental Crisis","Humanitarian Crisis","Social Justice",
            "Education Reform","Gender Equality","Political Crisis","Transportation Innovation","Economic Recovery"
        ))

        val listDescription = ArrayList<String>(listOf(
            "Global Outage - A major cyber attack has caused a global outage, disrupting essential services and leaving millions without access to critical systems.",
            "Extreme weather conditions continue to wreak havoc around the world, with floods,devastating communities and ecosystems.",
            "Lunar Mission - NASA has announced plans for a new lunar mission.",
            "Pandemic Update - As the COVID-19 pandemic continues to spread.",
            "Ethical Concerns - The rise of artificial intelligence is raising ethical concerns.",
            "Wind Power - Wind power is emerging as a key player in the transition to renewable energy.",
            "Data Breach - A major data breach has exposed sensitive information belonging to millions of individuals.",
            "Plastic Pollution - The world is facing an environmental crisis as plastic pollution continues to devastate marine life and ecosystems.",
            "Refugee Crisis - The global refugee crisis continues to worsen, with millions of people fleeing conflict",
            "Racial Injustice - The fight for racial justice continues, as communities demand accountability and reform in the wake of systemic racism and police brutality.",
            "Digital Learning - The COVID-19 pandemic has accelerated the shift to digital learning.",
            "Women's Empowerment - Women's empowerment is gaining momentum around the world.",
            "Democratic Backsliding - The world is facing a crisis of democracy, with authoritarian leaders and illiberal forces eroding democratic institutions and norms.",
            "Electric Vehicles - Electric vehicles are transforming the transportation industry.",
            "Post-Pandemic Rebuilding - As the world emerges from the COVID-19 pandemic."
        ))

        val listImage = ArrayList<Int>(listOf(R.drawable.news1,R.drawable.news2,R.drawable.news3,
            R.drawable.news4,R.drawable.news5
        ))

        val listNews = ArrayList<News>()

        for(i in 0..14){
            listNews.add(News(listHeader[i],listDescription[i],
                BitmapFactory.decodeResource(resources,listImage[value.nextInt(5)])))
        }

        return listNews
    }

}