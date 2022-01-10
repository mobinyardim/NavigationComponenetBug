package ir.inbo.navigationComponenetBug

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import ir.inbo.navigationComponenetBug.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navHostFragment = childFragmentManager.findFragmentById(
            R.id.nav_host_inner
        ) as NavHostFragment

        navController = navHostFragment.navController
        navController.setGraph(R.navigation.inner_nav_graph, Bundle().apply {
            putLong("someLong", 55L)
        })

        navController.addOnDestinationChangedListener { _, destination, _ ->
            Log.i("CurrentDestination", destination.label.toString())
        }

        binding.first.setOnClickListener {
            navController.navigate(
                R.id.AFragment,
                Bundle().apply {
                    putLong("someLong", 65L)
                },
                NavOptions.Builder()
                    .build()
            )
        }
        binding.second.setOnClickListener {
            navController.navigate(
                R.id.BFragment,
                Bundle().apply {
                    putLong("someLong",  65L)
                },
                NavOptions.Builder()
                    .build()
            )
        }
        binding.third.setOnClickListener {
            navController.navigate(
                R.id.CFragment,
                Bundle().apply {
                    putLong("someLong", 65L)
                },
                NavOptions.Builder()
                    .build()
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}