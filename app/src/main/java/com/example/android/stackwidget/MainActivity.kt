package com.example.android.stackwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// AppWidget 官方文档：
// https://developer.android.google.cn/guide/topics/appwidgets
//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}