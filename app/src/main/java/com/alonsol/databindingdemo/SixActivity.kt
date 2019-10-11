package com.alonsol.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.alonsol.databindingdemo.databinding.ActivitySixBinding

class SixActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySixBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_six)
        var image = Image("http://sjflkwlefw.jpg")
        binding.image = image
        image.url = "http://11111111111111111111.png"

    }
}
