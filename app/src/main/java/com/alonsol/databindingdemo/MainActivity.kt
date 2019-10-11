package com.alonsol.databindingdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.alonsol.databindingdemo.databinding.CustomBinding

class MainActivity : AppCompatActivity() {

    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: CustomBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        user = User("yuyang", "123")
        binding.userInfo = user

        binding.tvUserName.setOnClickListener {
            binding.tvUserName.text = "点击后姓名"
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.tvPassword.setOnClickListener {
            binding.tvPassword.text = "点击后密码"
            startActivity(Intent(this, FourActivity::class.java))
        }
        binding.tvFive.setOnClickListener {
            startActivity(Intent(this, FiveActivity::class.java))
        }

        binding.tvSix.setOnClickListener {
            startActivity(Intent(this, SixActivity::class.java))
        }

        binding.tvSeven.setOnClickListener {
            startActivity(Intent(this, SevenActivity::class.java))
        }
        binding.tvEight.setOnClickListener {
            startActivity(Intent(this, EightActivity::class.java))
        }
    }


}
