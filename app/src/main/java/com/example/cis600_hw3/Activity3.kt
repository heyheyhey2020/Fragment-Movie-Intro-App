package com.example.cis600_hw3

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity(), MovieChoiceFragment.OnMasterListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.fragmentContainer, MovieChoiceFragment() ,"choiceFragment")
//            .commit()
    }

    override fun OnButtonSelected(v: View, title: String) {
        if (resources.getBoolean(R.bool.isTablet)) {
            if (title == "Mulan") {
                findViewById<Button>(R.id.MVmulan).setOnClickListener {
                    val fragment = MulanFragment.newInstance("p1", "p2")
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentMV, fragment).addToBackStack(null).commit()
                }
            }

            if (title == "Rogue") {
                findViewById<Button>(R.id.MVrogue).setOnClickListener {
                    val fragment = RogueFragment.newInstance("p1", "p2")
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentMV, fragment).addToBackStack(null).commit()
                }
            }

            if (title == "Scoob") {
                findViewById<Button>(R.id.MVscoob).setOnClickListener {
                    val fragment = ScoobFragment.newInstance("p1", "p2")
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentMV, fragment).addToBackStack(null).commit()
                }
            }
        }
    }

}