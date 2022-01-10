package com.tergeo.ithub1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tergeo.ithub1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "SecondActivity"
        private const val NAME_KEY = "name"
        private const val AGE_KEY = "age"
    }

    private var binding: ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val name = intent.getStringExtra(NAME_KEY)
        val age = intent.getStringExtra(AGE_KEY)

        binding!!.userInfoText.text = "$name\n$age"

        binding!!.showUserInfoButton.setOnClickListener {
            val name = binding!!.nameEdit.text.toString()
            val group = binding!!.groupEdit.text.toString()

            binding!!.userInfoText.text = if (name.isNotEmpty() && group.isNotEmpty())
                "Имя: $name\nГруппа: $group"
            else
                "Тут пусто"

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        Log.d(TAG, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: ")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ")
        super.onDestroy()
    }
}