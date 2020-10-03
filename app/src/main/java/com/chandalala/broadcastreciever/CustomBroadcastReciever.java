package com.chandalala.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;


public class CustomBroadcastReciever extends BroadcastReceiver {

    public static final String CUSTOM_BROADCAST_RECEIVER = "com.chandalala.CUSTOM_ACTION";

    //Do what you want to do when an event you registered for has been triggered
    @Override
    public void onReceive(Context context, Intent intent) {

        /*intent contains the action that was triggered*/
        if (CUSTOM_BROADCAST_RECEIVER.equals(intent.getAction())){

            String recievedText = intent.getStringExtra(CUSTOM_BROADCAST_RECEIVER);
            Toast.makeText(context, recievedText, Toast.LENGTH_SHORT).show();

        }
    }
}
