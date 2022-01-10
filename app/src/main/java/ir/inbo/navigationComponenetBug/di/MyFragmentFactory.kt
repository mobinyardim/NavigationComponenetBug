package ir.inbo.navigationComponenetBug.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import ir.inbo.navigationComponenetBug.AFragment
import ir.inbo.navigationComponenetBug.BFragment
import ir.inbo.navigationComponenetBug.CFragment
import ir.inbo.navigationComponenetBug.FirstFragment
import javax.inject.Inject
import kotlin.time.ExperimentalTime

@ExperimentalTime
class MyFragmentFactory @Inject constructor(

) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            AFragment::class.java.name -> {
                AFragment()
            }
            BFragment::class.java.name -> {
                BFragment()
            }
            CFragment::class.java.name -> {
                CFragment()
            }
            FirstFragment::class.java.name -> {
                FirstFragment()
            }
            else -> super.instantiate(classLoader, className)
        }
    }
}