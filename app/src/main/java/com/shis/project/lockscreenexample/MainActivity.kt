package com.shis.project.lockscreenexample

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val broadcastReceiver : BroadcastReceiver = ScreenBroadcastReceiver()
        val filter = IntentFilter().apply{
            //IntentFilter()를 이용하여 Broadcast 중 수신하고 싶은 메세지들을 addAction()를 이용하여 추가한다.
            addAction(Intent.ACTION_SCREEN_ON)
        }

        //BroadcastReceiver를 등록
        registerReceiver(broadcastReceiver,filter)
    }
}