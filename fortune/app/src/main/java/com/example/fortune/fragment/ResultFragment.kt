package com.example.fortune.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fortune.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment(), View.OnClickListener {
    lateinit var navController : NavController
    var score = -1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        score = arguments?.getInt("value")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        setResult(score)

        result_home_btn.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.result_home_btn -> {
                navController.navigate(R.id.action_resultFragment_to_mainFragment)
            }
        }
    }

    private fun setResult(score: Int) {
        when(score){
            1 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_1)
            }
            2 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_2)
            }
            3 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_3)
            }
            4 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_4)
            }
            5 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_5)
            }
            6 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_6)
            }
            7 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_7)
            }
            8 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_8)
            }
            9 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_9)
            }
            10 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_10)
            }
            11 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_11)
            }
            12 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_12)
            }
            13 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_13)
            }
            14 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_14)
            }
            15 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_15)
            }
            16 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_16)
            }
            17 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_17)
            }
            18 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_18)
            }
            19 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_19)
            }
            20 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_20)
            }
            21 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_21)
            }
            22 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_22)
            }
            23 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_23)
            }
            24 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_24)
            }
            25 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_25)
            }
            26 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_26)
            }
            27 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_27)
            }
            28 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_28)
            }
            29 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_29)
            }
            30 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_30)
            }
            31 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_31)
            }
            32 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_32)
            }
            33 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_33)
            }
            34 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_34)
            }
            35 -> {
                tv_result_title.text = getString(R.string.G)
                tv_result_sub.text = getString(R.string.context_35)
            }
            36 -> {
                tv_result_title.text = getString(R.string.H)
                tv_result_sub.text = getString(R.string.context_36)
            }
        }
    }

}