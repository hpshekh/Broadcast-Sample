package com.hpshekh.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import com.hpshekh.broadcastreceiver.receiver.ConnectionBroadcastReceiver;
import com.hpshekh.broadcastreceiver.receiver.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {
    ConnectionBroadcastReceiver cBR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cBR = new ConnectionBroadcastReceiver();
        registerReceiver(cBR, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(cBR);
    }
}