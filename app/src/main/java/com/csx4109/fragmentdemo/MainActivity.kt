package com.csx4109.fragmentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.csx4109.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val view: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        view.btnRecyclerView.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        view.btnFragment1.setOnClickListener {
            val intent = Intent(this, Fragment1Activity::class.java)
            startActivity(intent)
        }

        view.btnFragment2.setOnClickListener {
            val intent = Intent(this, Fragment2Activity::class.java)
            startActivity(intent)
        }

        view.btnButtomNavigation.setOnClickListener {
            val intent = Intent(this, ButtomNavigationActivity::class.java)
            startActivity(intent)
        }

        view.btnApiCall.setOnClickListener {
            val intent = Intent(this, ApiCallActivity::class.java)
            startActivity(intent)
        }

        view.btnUniversity.setOnClickListener {
            val intent = Intent(this, UniversityListActivity::class.java)
            startActivity(intent)
        }

        view.btnLoginPage.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}