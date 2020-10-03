package com.chandalala.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;


public class HeavyWorkBroadcastReciever extends BroadcastReceiver {


    //Do what you want to do when an event you registered for has been triggered
    @Override
    public void onReceive(Context context, Intent intent) {

        PendingResult pendingResult = goAsync();

        //Then do heavy work on the background thread

        //Once the work is done call the below
        pendingResult.finish();


    }
}
