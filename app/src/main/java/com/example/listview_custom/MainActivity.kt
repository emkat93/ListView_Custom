package com.example.listview_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    val TAG = "StateChange"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "OnCreate")

        val listView = findViewById<ListView>(R.id.ListView)
        var list = ArrayList<Profile>()

        list.add(Profile("Andrew","815-123-5555",R.drawable.ic_launcher_background))
        list.add(Profile("Emily", "815-456-1111",R.drawable.ic_launcher_background))
        list.add(Profile("Mom", "815-789-4444",R.drawable.ic_launcher_background))
        list.add(Profile("Dad", "815-147-3333",R.drawable.ic_launcher_background))
        list.add(Profile("Sis", "815-258-2222",R.drawable.ic_launcher_background))
        list.add(Profile("Brother", "815-369-6666",R.drawable.ic_launcher_background))
        list.add(Profile("Grandpa", "815-753-8888",R.drawable.ic_launcher_background))
        list.add(Profile("Grandma", "815-159-7777",R.drawable.ic_launcher_background))


        listView.adapter = MyCustomAdapter(this, R.layout.custom_phone_profile_layout, list)

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "OnRestart")
    }

}