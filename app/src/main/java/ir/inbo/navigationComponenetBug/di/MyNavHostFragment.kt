package ir.inbo.navigationComponenetBug.di

import android.content.Context
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import ir.inbo.navigationComponenetBug.di.MyFragmentFactory
import javax.inject.Inject
import kotlin.time.ExperimentalTime


@AndroidEntryPoint
@ExperimentalTime
class MyNavHostFragment : NavHostFragment() {


    @Inject
    lateinit var fragmentFactory: MyFragmentFactory

    override fun onAttach(context: Context) {
        super.onAttach(context)
        childFragmentManager.fragmentFactory = fragmentFactory
    }

}