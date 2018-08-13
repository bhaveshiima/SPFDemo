package vsl.bhavesh.spfdemo

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

        // Login Button code
        v.login.setOnClickListener {

            var spf = activity!!.getSharedPreferences("spf_name", Context.MODE_PRIVATE) // creating
            var email = spf.getString("email","No value")
            var pass = spf.getString("pass", "No value")

            if(email == v.email.text.toString() && pass == v.pass.text.toString()){

                var fManager = activity!!.supportFragmentManager
                var vx = fManager.beginTransaction()  // start transation
                vx.add(R.id.frame1,WelcomeFragment()) // set signup fragment as a default one
                vx.commit() // commit


            }else{
                Toast.makeText(activity,"Invalid User", Toast.LENGTH_LONG).show()
            }

        }

        return v   // return view object
    }

}