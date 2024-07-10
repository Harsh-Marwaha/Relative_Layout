package com.example.relativelayout

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var frameLayout: FrameLayout

    var bmiFragment = BmiFragment()
    var navCalculator = CalculatorFragment()
    var navTicTacToe = TicTacToeFragment()
    var navImageView = ImageViewFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.bottomNavigationBar)
        frameLayout=findViewById(R.id.frameLayout)

        replace(bmiFragment)

        bottomNavigationView.itemIconTintList=null

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.navBmi -> replace(bmiFragment)
                R.id.navCalculator -> replace(navCalculator)
                R.id.navTicTacToe -> replace(navTicTacToe)
                R.id.navImageView -> replace(navImageView)
            }
            true
        }
    }

    fun replace(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }
}