package com.androidstudio.kotlin.codeeditor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AutoCompleteTextView
import android.widget.Button
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    lateinit var user_code:AutoCompleteTextView
    lateinit var run_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_code = findViewById(R.id.user_code)
        run_btn = findViewById(R.id.run_btn)

        run_btn.setOnClickListener{
            Run()
        }
    }

    private fun Run() {
        var intent = Intent(this@MainActivity,code_activity::class.java)
        intent.putExtra("code",user_code.text.toString())
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}