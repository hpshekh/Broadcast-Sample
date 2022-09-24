package com.hpshekh.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class ConnectionBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            if (isConnected(context)) {
                Toast.makeText(context, "Your are Online Now", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Your are Offline Now", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {

        }
    }

    private boolean isConnected(Context context) {
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = cm.getActiveNetworkInfo();
            //should check null because in airplane mode it will be null
            return (networkInfo != null && networkInfo.isConnected());
        } catch (Exception e) {
            return false;
        }

    }
}