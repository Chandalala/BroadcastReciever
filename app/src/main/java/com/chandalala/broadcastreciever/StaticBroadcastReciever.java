package com.chandalala.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/*STATIC BROADCAST RECEIVER
*
* These are registered in the manifest file
* */

public class StaticBroadcastReciever extends BroadcastReceiver {

    /*
    * Insert the broadcast receiver in the android manifest file
    */

    @Override
    public void onReceive(Context context, Intent intent) {

        /*intent contains the action that was triggered*/
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context, "Boot completed", Toast.LENGTH_SHORT).show();
        }

    }

}
