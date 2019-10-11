package com.alonsol.databindingdemo

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.alonsol.databindingdemo.databinding.ActivityFiveBinding

class FiveActivity : AppCompatActivity() {

    private lateinit var user: User
    private lateinit var binding: ActivityFiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_five)
        user = User("yuyang", "123")
        binding.userInfo = user
        binding.userPresenter = UserPresenter()
    }

    inner class UserPresenter {

        fun onUserNameClick(user: User) {
            Toast.makeText(this@FiveActivity, "用户名：${user.name}", Toast.LENGTH_SHORT).show()
        }

        fun afterTextChanged(s: Editable) {
            user.name = s.toString()
            binding.userInfo = user
        }

        fun afterUserPasswordChanged(s: Editable) {
            user.password = s.toString()
            binding.userInfo = user
        }
    }
}
