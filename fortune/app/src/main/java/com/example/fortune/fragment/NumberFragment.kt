package com.example.fortune.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.fortune.R
import kotlinx.android.synthetic.main.fragment_number.*


class NumberFragment : Fragment(), View.OnClickListener  {
    lateinit var navController : NavController
    var score = -1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_number, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        et_1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun afterTextChanged(editable: Editable) {
                val edtChar: String = et_1.text.toString()
                if (edtChar.length == 1) {
                    et_2.requestFocus()
                } else if (edtChar.isEmpty()) {
                    et_1.requestFocus()
                }
            }
        })

        et_2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun afterTextChanged(editable: Editable) {
                val edtChar: String = et_2.text.toString()
                if (edtChar.length == 1) {
                    et_3.requestFocus()
                } else if (edtChar.isEmpty()) {
                    et_2.requestFocus()
                }
            }
        })

        et_3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}

            override fun afterTextChanged(editable: Editable) {
                val edtChar: String = et_3.text.toString()
                if (edtChar.length == 1) {
                    et_4.requestFocus()
                } else if (edtChar.isEmpty()) {
                    et_3.requestFocus()
                }
            }
        })

        number_next_btn.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.number_next_btn -> {navigateWithValue()}
        }
    }

    private fun navigateWithValue() {
        score = et_1.text.toString().toInt() + et_2.text.toString().toInt() + et_3.text.toString().toInt() + et_4.text.toString().toInt()
        val bundle = bundleOf("value" to score)
        navController.navigate(R.id.action_numberFragment_to_resultFragment, bundle)

    }

}