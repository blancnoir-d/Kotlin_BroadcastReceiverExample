package com.shis.project.lockscreenexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ScreenBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        //디바이스 화면이 켜질때마다 토스트 메세지 출력..
        if (intent != null) {
            if(intent.action.equals(Intent.ACTION_SCREEN_ON)){ // ACTION_SCREEN_ON: 화면이 켜졌을 때 (getAction() -> action)
                val toast = Toast.makeText(context, "good", Toast.LENGTH_LONG)
                toast.show()
            }
        }
    }
}