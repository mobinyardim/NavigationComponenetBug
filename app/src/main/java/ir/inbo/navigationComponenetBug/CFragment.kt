package ir.inbo.navigationComponenetBug

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class CFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(
            "currentDestination",
            findNavController().currentDestination?.label.toString()
        )
        return inflater.inflate(R.layout.fragment_c, container, false)
    }
}