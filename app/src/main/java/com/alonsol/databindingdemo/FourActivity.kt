package com.alonsol.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.alonsol.databindingdemo.databinding.ActivityFourBinding

class FourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityFourBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_four)
        binding.goods = ObservableGoods("yuayng", 11f, "细节决定成败")
    }

}
