package com.fastcampus.clone.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val button: ImageButton by lazy {
        findViewById(R.id.main_button)
    }



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        installSplashScreen()

        setContentView(R.layout.activity_main)
        val content:  View = findViewById(android.R.id.content)
        var splashOut=false
        content.viewTreeObserver.addOnDrawListener{
            splashOut
        }
        CoroutineScope(Dispatchers.IO).launch{
            delay(5000)
            splashOut=true
        }
        button.setOnClickListener{
            startActivity(Intent(this, SubActivity::class.java))

        }
    }
}