package com.example.gamenavcompex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private val drawerLayout:DrawerLayout by lazy{
        findViewById(R.id.drawer_layout)
    }
    private val navController by lazy{
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)as NavHostFragment
         navHostFragment.findNavController()
    }
    private val appBarConfiguration: AppBarConfiguration by lazy{
        AppBarConfiguration(setOf(
            R.id.mainFragment,R.id.aboutFragment2), drawerLayout)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

setupDrawerLayout()

    }
    private fun setupDrawerLayout() {

        val navView: NavigationView = findViewById(R.id.nav_view)
        //navView.setupWithNavController(navController)
        //NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        // here this ids are form fragment which should show navigation icon
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }

    override fun onSupportNavigateUp(): Boolean {
        //return NavigationUI.navigateUp(navController, drawerLayout)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}