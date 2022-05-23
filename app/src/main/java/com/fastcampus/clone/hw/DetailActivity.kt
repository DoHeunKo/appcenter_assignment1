package com.fastcampus.clone.hw

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity(){

    private val detailName : TextView by lazy{
        findViewById(R.id.detailName)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        detailName.text = intent.getStringExtra("name")+
                "\n is a company in \n"+ intent.getStringExtra("where")
    }
}