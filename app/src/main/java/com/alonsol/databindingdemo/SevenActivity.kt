package com.alonsol.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_seven.*

class SevenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)
        var list = ArrayList<User>()
        for (i in 10..100) {
            var user = User("name$i", "password$i")
            list.add(user)
        }


        recylerView.layoutManager = LinearLayoutManager(this)
        recylerView.adapter = UserAdapter(list)

    }
}
