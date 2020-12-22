package com.example.cis600_hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_2.*
import java.util.ArrayList

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(MulanFragment(),"Mulan")
        adapter.addFragment(RogueFragment(),"Rogue")
        adapter.addFragment(ScoobFragment(),"Scoob")
        viewPage.adapter = adapter
        tabLayout.setupWithViewPager(viewPage)
    }
}


class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList: MutableList<Fragment> = ArrayList()
    private val titleList: MutableList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(Fragment:Fragment,title:String){
        fragmentList.add(Fragment)
        titleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }
}