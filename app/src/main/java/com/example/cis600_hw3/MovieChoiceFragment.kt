package com.example.cis600_hw3

import android.content.Context
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_movie_choice.*


class MovieChoiceFragment : Fragment(),OnClickListener{

    private var isTablet = false
    private var navc : NavController? = null
    private var listener: OnMasterListener? = null
//    var bnt1 : Button? = null
//    var bnt2 : Button? = null
//    var bnt3 : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (resources.getBoolean(R.bool.isTablet)) {
            isTablet = true
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_choice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navc = Navigation.findNavController(view)
//        MVmulan.findViewById<Button>(R.id.MVmulan)
//        MVrogue.findViewById<Button>(R.id.MVrogue)
//        MVscoob.findViewById<Button>(R.id.MVscoob)
        if (!isTablet) {
            view.findViewById<Button>(R.id.MVmulan)?.setOnClickListener(this)
            view.findViewById<Button>(R.id.MVrogue)?.setOnClickListener(this)
            view.findViewById<Button>(R.id.MVscoob)?.setOnClickListener(this)
        } else {
            view.findViewById<Button>(R.id.MVmulan)?.setOnClickListener {
                onTabletButtonPressed(it, "Mulan")
            }
            view.findViewById<Button>(R.id.MVrogue)?.setOnClickListener {
                onTabletButtonPressed(it, "Rogue")
            }
            view.findViewById<Button>(R.id.MVscoob)?.setOnClickListener {
                onTabletButtonPressed(it, "Scoob")
            }
        }
    }

    fun onTabletButtonPressed(v: View, title: String) {
        listener?.OnButtonSelected(v, title)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnMasterListener) {
            listener = context
        }
    }



    override fun onClick(v: View?) {
        MVmulan.setOnClickListener{
            navc?.navigate(R.id.action_movieChoiceFragment_to_mulanFragment)
        }
        MVrogue.setOnClickListener{
            navc?.navigate(R.id.action_movieChoiceFragment_to_rogueFragment)
        }
        MVscoob.setOnClickListener{
            navc?.navigate(R.id.action_movieChoiceFragment_to_scoobFragment)
        }
    }

    interface OnMasterListener {
        fun OnButtonSelected(v: View, title: String)
    }

}

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"
//
///**
// * A simple [Fragment] subclass.
// * Use the [MovieChoiceFragment.newInstance] factory method to
// * create an instance of this fragment.
// */
//class MovieChoiceFragment() : Fragment(), OnClickListener {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    constructor(parcel: Parcel) : this() {
//        param1 = parcel.readString()
//        param2 = parcel.readString()
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_movie_choice, container, false)
//    }
//
//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment MovieChoiceFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            MovieChoiceFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(param1)
//        parcel.writeString(param2)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<MovieChoiceFragment> {
//        override fun createFromParcel(parcel: Parcel): MovieChoiceFragment {
//            return MovieChoiceFragment(parcel)
//        }
//
//        override fun newArray(size: Int): Array<MovieChoiceFragment?> {
//            return arrayOfNulls(size)
//        }
//    }
//}