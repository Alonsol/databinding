package com.alonsol.databindingdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_eight.*
import kotlin.random.Random

class EightActivity : AppCompatActivity() {

    private lateinit var userObservableArrayList: ObservableArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)
        recylerView.layoutManager = LinearLayoutManager(this)
        initData()
        var userAdapter = UserAdapter(userObservableArrayList)
        userAdapter.notifyDataSetChanged()
        userObservableArrayList.addOnListChangedCallback(DynamicChangeCallback<User>(userAdapter))
        recylerView.adapter = userAdapter
    }

    private fun initData() {
        userObservableArrayList = ObservableArrayList()
        for (i in 0..20) {
            var user = User("user_$i", "${Random.nextInt() * 4}")
            userObservableArrayList.add(user)
        }
    }

    fun addItem(view: View) {
        var user = User("user_$100", "${Random.nextInt() * 4}")
        userObservableArrayList.add(1, user)
    }

    fun addItemList(view: View) {
        var userList = ArrayList<User>()
        for (i in 0..3) {
            var user = User("user_$100", "${Random.nextInt() * 4}")
            userList.add(user)
        }
        userObservableArrayList.addAll(1, userList)
    }

    fun removeItem(view: View) {
        if (userObservableArrayList.size > 1) {
            userObservableArrayList.removeAt(1)
        }
    }

    fun updateItem(view: View) {
        var user = userObservableArrayList[1]
        user.name = "user_${Random.nextInt()}"
        userObservableArrayList.set(1, user)
    }
}
