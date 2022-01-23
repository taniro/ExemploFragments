package tads.eaj.ufrn.exemplofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import tads.eaj.ufrn.exemplofragments.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding


    /*
    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.myNavHostFragment)
        return navController.navigateUp()
    }

     */

    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController,binding.drawerView)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerView)
        NavigationUI.setupWithNavController(binding.navView, navController)

        /*
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        val fragment = Fragment1()
        ft.add(R.id.layout_alvo, fragment, "fragment")
        ft.commit()
         */


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
        fragmentTransaction.replace(R.id.layout_alvo, f2, "Fragment 2")
        fragmentTransaction.commit()

         */




        // Create new fragment and transaction

        /*
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
        ft2.addToBackStack(null)
        // Commit the transaction
        ft2.commit()

         */



        /*
        button1 = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)

        button1.setOnClickListener {
            var fm = supportFragmentManager
            var fragmentTransaction = fm.beginTransaction()
            var f1 = Fragment1()
            fragmentTransaction.replace(R.id.layout_alvo, f1, "Fragment 1")
            //fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        button2.setOnClickListener {
            var fm = supportFragmentManager
            var fragmentTransaction = fm.beginTransaction()
            var f2 = Fragment3()
            fragmentTransaction.replace(R.id.layout_alvo, f2, "Fragment 2")
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

         */


    }
}
