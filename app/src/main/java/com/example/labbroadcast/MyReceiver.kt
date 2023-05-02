package com.example.labbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if (intent?.action == "com.example.labbroadcast.MY_CUSTOM_ACTION") {
            Toast.makeText(context,"5 seconds passed",Toast.LENGTH_LONG).show()
        }
    }
}