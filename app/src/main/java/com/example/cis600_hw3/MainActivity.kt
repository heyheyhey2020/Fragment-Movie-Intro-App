package com.example.cis600_hw3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_about_me.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val title = "Task2"
//        val fragment = AboutMeFragment.newInstance(title)
        btnAboutMe.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentAboutMe, AboutMeFragment() ,"BlankFragment")
                .commit()
        }
        btnActivity2.setOnClickListener{
            val intent: Intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        btnActivity3.setOnClickListener{
            val intent: Intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }



//    override fun onFragmentInteraction(v: View) {
//        val intent = Intent(this,Activity2::class.java)
//        startActivity(intent)
//        val title = findViewById<Button>(v.id).text.toString()
//        val fragment = AboutMeFragment.newInstance(title)
//        supportFragmentManager.beginTransaction().replace(R.id.fragmentAboutMe, fragment).addToBackStack(null).commit()

//    }
}

