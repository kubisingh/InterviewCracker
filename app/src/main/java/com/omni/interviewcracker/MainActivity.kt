package com.omni.interviewcracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omni.androidfeature.AndroidMain
import com.omni.javafeatures.JavaMain
import com.omni.kotlinfeatures.KotlinMain
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener {
            startActivity(Intent(baseContext, AndroidMain::class.java))
        }
        textView1.setOnClickListener {
            startActivity(Intent(baseContext, JavaMain::class.java))
        }
        textView2.setOnClickListener {
            startActivity(Intent(baseContext, KotlinMain::class.java))
        }
    }
}
