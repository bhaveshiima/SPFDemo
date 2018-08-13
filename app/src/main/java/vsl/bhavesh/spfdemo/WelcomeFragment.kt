package vsl.bhavesh.spfdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)

        // login fragment converted into view object
        var v = inflater.inflate(R.layout.welcome_frag, container, false)
        return v   // return view object
    }

}