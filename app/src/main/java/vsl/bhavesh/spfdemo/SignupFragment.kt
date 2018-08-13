package vsl.bhavesh.spfdemo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.signup_frag.*
import kotlinx.android.synthetic.main.signup_frag.view.*

class SignupFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)

        // login fragment converted into view object
        var v = inflater.inflate(R.layout.signup_frag, container, false)

        v.r_signup.setOnClickListener {

            // To store data into Shared Preference  [ START ]
            var spf = activity!!.getSharedPreferences("spf_name",Context.MODE_PRIVATE)
            var spe = spf.edit()
            spe.putString("email", r_email.text.toString())
            spe.putString("pass", r_pass.text.toString())
            spe.putString("mobile", r_mobile.text.toString())
            spe.putString("gender", r_gender.text.toString())
            spe.commit()
            // To store data into Shared Preference  [ END ]



            // After signup done then redirect to login fragment  [ START ]
            var fManager = activity!!.supportFragmentManager
            var vx = fManager.beginTransaction()  // start transation
            vx.add(R.id.frame1,LoginFragment()) // set login fragment as a default one
            vx.commit() // commit
            // After signup done then redirect to login fragment  [ END ]


        }


        return v   // return view object
    }

}