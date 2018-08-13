package vsl.bhavesh.spfdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.login_frag.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)

        // login fragment converted into view object
        var v = inflater.inflate(R.layout.login_frag, container, false)

        // when user click on Signup button >> navigate to signup form [ START ]
        v.signup.setOnClickListener {

            var fManager = activity!!.supportFragmentManager
            var vx = fManager.beginTransaction()  // start transation
            vx.add(R.id.frame1,SignupFragment()) // set signup fragment as a default one
            vx.commit() // commit
        }
        // when user click on Signup button >> navigate to signup form [ END ]


        return v   // return view object
    }

}