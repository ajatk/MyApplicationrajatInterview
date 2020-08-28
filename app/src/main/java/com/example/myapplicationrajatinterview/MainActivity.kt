package com.example.myapplicationrajatinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationrajatinterview.fragment.HomeFragment
import com.facebook.drawee.backends.pipeline.Fresco

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //FacebookSdk.sdkInitialize(this);
        Fresco.initialize(this)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_container, HomeFragment()).commit()
    }
}