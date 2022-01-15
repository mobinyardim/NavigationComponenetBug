package ir.inbo.navigationComponenetBug

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class AFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(
            "currentDestination",
            findNavController().currentDestination?.label.toString()
        )
        return inflater.inflate(R.layout.fragment_a, container, false).apply {
            findViewById<Button>(R.id.button_first).setOnClickListener {
                findNavController().navigate(
                    R.id.BFragment,
                    Bundle().apply {
                        putLong("someLong", 55L)
                    },
                    NavOptions.Builder()
                        .setPopUpTo(R.id.BFragment, true)
                        .setLaunchSingleTop(true)
                        .build()
                )
            }
        }
    }

}