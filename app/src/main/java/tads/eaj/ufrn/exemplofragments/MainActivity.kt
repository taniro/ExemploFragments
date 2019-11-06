package tads.eaj.ufrn.exemplofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        var fm = supportFragmentManager
        var fragmentTransaction = fm.beginTransaction()
        var f1 = Fragment1()
        fragmentTransaction.add(R.id.layout_alvo, f1, "Fragment 1")
        fragmentTransaction.commit()

         */

        /*
        fragmentTransaction = fm.beginTransaction()
        val f2 = Fragment2()
        fragmentTransaction.add(R.id.layout_alvo, f2, "Fragment 2")
        fragmentTransaction.commit()

         */

        /*
        // Create new fragment and transaction

        var fm = supportFragmentManager
        var fragmentTransaction = fm.beginTransaction()
        var f1 = Fragment1()
        fragmentTransaction.add(R.id.layout_alvo, f1, "Fragment 1")
        fragmentTransaction.commit()


        val fm2 = supportFragmentManager
        val ft2 = fm2.beginTransaction()
        val newFragment = Fragment2()
        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        ft2.replace(R.id.layout_alvo, newFragment)
        //ft2.addToBackStack(null)
        // Commit the transaction
        ft2.commit()

         */
    }
}
