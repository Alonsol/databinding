package com.alonsol.databindingdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import androidx.databinding.ObservableMap
import com.alonsol.databindingdemo.databinding.ActivityThreeBinding
import kotlin.random.Random

class ThreeActivity : AppCompatActivity() {


    private lateinit var map: ObservableMap<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityThreeBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_three)
        map = ObservableArrayMap<String, String>()
        map.put("name", "yuyang")
        map.put("age", "29")
        binding.map = map
        var list = ObservableArrayList<String>()
        list.add("hello")
        list.add("nihao")
        binding.list = list
        binding.map = map
        binding.key = "name"

    }

    fun onClick(view: View) {
        map.put("name", "aobama,hi" + Random.nextInt(100))
    }
}
