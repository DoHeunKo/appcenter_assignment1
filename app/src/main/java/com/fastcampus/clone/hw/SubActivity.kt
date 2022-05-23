package com.fastcampus.clone.hw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SubActivity : AppCompatActivity() {

    val recyclerView : RecyclerView by lazy{
        findViewById(R.id.sub_recyclerView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        recyclerView.adapter = SubAdapter(createData())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createData(): ArrayList<Company>{
        val data = arrayListOf<Company>()
        data.add(Company("NAVER","1999","Korea"))
        data.add(Company("GOOGLE","1998","USA"))
        data.add(Company("FACEBOOK","2004","USA"))
        data.add(Company("KAKAO","2014","Korea"))
        data.add(Company("NCsoft","1997","Korea"))
        data.add(Company("LINE","2000","Japan"))
        data.add(Company("APPLE","1976","USA"))
        data.add(Company("HUAWEI","1987","China"))
        data.add(Company("AMAZON","1994","USA"))
        data.add(Company("MICROSOFT","1975","USA"))
        data.add(Company("SONY","1946","Japan"))
        data.add(Company("IBM","1911","USA"))
        data.add(Company("SAMSUNG","1938","Korea"))

        return data
    }
}