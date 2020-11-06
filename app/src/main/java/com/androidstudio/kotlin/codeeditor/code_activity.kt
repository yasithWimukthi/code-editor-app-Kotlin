package com.androidstudio.kotlin.codeeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView

class code_activity : AppCompatActivity() {

    lateinit var web_browser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_activity)

        web_browser = findViewById(R.id.web_browser)

        web_browser.loadData(intent.getStringExtra("code").toString(),"text/html; charset=utf8",null)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.code_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item?.itemId){

            R.id.en_js ->{
                web_browser.settings.javaScriptEnabled
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}