package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private var titlesList = mutableListOf<String>()
    private var scorelist = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    lateinit var view_pager2: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        view_pager2.adapter = ViewPagerAdapter(titlesList, scorelist, imagesList)
    }

    private fun addToList(title: String, score: String, image: Int){
        titlesList.add(title)
        scorelist.add(score)
        imagesList.add(image)
    }

    private fun postToList(){
        addToList("Spiderman: No Way\\nHome", "9.1/10.0 IMDd", R.drawable.spiderman)
        addToList("Eternals", "9.5/10.0 IMDd", R.drawable.image2)

    }


}