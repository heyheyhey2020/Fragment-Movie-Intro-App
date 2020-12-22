package com.example.cis600_hw3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_about_me.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "title"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutMeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class AboutMeFragment : androidx.fragment.app.Fragment() {
    // TODO: Rename and change types of parameters
    private var param: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val contentView =  inflater.inflate(R.layout.fragment_about_me, container, false)
        return contentView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        btnActivity2.setOnClickListener{
//            val intent = Intent(activity,Activity2::class.java)
//            startActivity(intent)
//            Toast.makeText(activity,"try",Toast.LENGTH_SHORT)
//        }
    }

//    override fun onStart() {
//        super.onStart()
//        btnActivity2.setOnClickListener{
//            val intent = Intent(activity,Activity2::class.java)
//            startActivity(intent)
//        }
//        btnActivity3.setOnClickListener{
//            val intent = Intent(activity,Activity3::class.java)
//            startActivity(intent)
//        }
//    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(view: View)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            AboutMeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

}