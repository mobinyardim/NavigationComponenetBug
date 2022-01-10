package ir.inbo.navigationComponenetBug

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.findNavController

class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_b, container, false).apply {
            findViewById<Button>(R.id.button_first).setOnClickListener {
                findNavController().navigate(
                    R.id.CFragment,
                    Bundle().apply {
                        putLong("someLong", 55L)
                    },
                    NavOptions.Builder()
                        .setPopUpTo(R.id.CFragment, true)
                        .setLaunchSingleTop(true)
                        .build()
                )
            }
        }
    }
}