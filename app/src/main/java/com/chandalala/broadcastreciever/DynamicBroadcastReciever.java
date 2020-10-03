package com.chandalala.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

/*Dynamic BROADCAST RECEIVER
 *
 * These are NOT registered in the manifest file
 * Create an instance of the broadcast receiver in the main class
 * */

public class DynamicBroadcastReciever extends BroadcastReceiver {


    //Do what you want to do when an event you registered for has been triggered
    @Override
    public void onReceive(Context context, Intent intent) {

        /*intent contains the action that was triggered*/
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            boolean noConnectivity = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);

            if (noConnectivity){
                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
