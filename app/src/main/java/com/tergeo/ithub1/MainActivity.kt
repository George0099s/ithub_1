package com.tergeo.ithub1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tergeo.ithub1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        private const val NAME_KEY = "name"
        private const val AGE_KEY = "age"
    }

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.crash.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(NAME_KEY, "это Mike")
            intent.putExtra(AGE_KEY, "Ему 18")
            startActivity(intent)
        }
    }
}