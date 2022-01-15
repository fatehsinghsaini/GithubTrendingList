package com.os.githubtrendingexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.os.githubtrendingexample.R
import com.os.githubtrendingexample.utils.DateUtils.swap
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = arrayListOf(1,3,4,5,7,8)
        arrayList.swap(0,3)

    }


}