package com.example.filmapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    private lateinit var editTextText3: AppCompatButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)

        /*val bt = v.findViewById<Button>(R.id.editTextText3)

        editTextText3.setOnClickListener {
            val crimeFragment = CrimeFragment()
            val transaction: FragmentTransaction? = fragmentManager?.beginTransaction()

            transaction?.replace(R.id.mainLayout, crimeFragment)
                transaction?.commit()

        }*/





        return v


    }

}