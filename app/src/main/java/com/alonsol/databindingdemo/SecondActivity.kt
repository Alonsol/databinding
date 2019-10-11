package com.alonsol.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import com.alonsol.databindingdemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var goods: Goods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var binding: ActivitySecondBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_second)
        goods = Goods("yuang", "a boy", 10000.0f)

        binding.goods = goods
        binding.goodsHandler = GoodHandler()

    }

}
