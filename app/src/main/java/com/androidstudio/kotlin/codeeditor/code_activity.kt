package com.androidstudio.kotlin.codeeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class code_activity : AppCompatActivity() {

    lateinit var web_browser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_activity)

        web_browser = findViewById(R.id.web_browser)

        web_browser.loadData(intent.getStringExtra("code").toString(),"text/html; charset=utf8",null)
    }
}