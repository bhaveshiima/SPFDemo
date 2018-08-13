package vsl.bhavesh.spfdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Now set default fragment as a login

        var fManager = supportFragmentManager
        var vx = fManager.beginTransaction()  // start transation
        vx.add(R.id.frame1,LoginFragment()) // set login fragment as a default one
        vx.commit() // commit



    } //onCreate
} // MainActivity
