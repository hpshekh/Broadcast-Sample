package com.hpshekh.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("hpTag", "Broadcast Message Is Received!");
        Toast.makeText(context, "Broadcast Message Is Received!", Toast.LENGTH_SHORT).show();
    }
}