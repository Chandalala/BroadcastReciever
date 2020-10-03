package com.chandalala.broadcastreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DynamicBroadcastReciever dynamicBroadcastReciever = new DynamicBroadcastReciever();
    private CustomBroadcastReciever customBroadcastReciever = new CustomBroadcastReciever();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //for custom broadcast receiver
        IntentFilter filter = new IntentFilter(CustomBroadcastReciever.CUSTOM_BROADCAST_RECEIVER);
        registerReceiver(customBroadcastReciever, filter);


    }


    //for custom broadcast receiver
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(customBroadcastReciever);
    }

    //start the broadcast receiver when the application starts
    @Override
    protected void onStart() {
        super.onStart();
        //Create an intent filter and pass on the action you want to listen to

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);

        //To pass more than one action use
        //filter.addAction();

        registerReceiver(dynamicBroadcastReciever, filter);


    }


    //Stop the broadcast receiver on stop
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(dynamicBroadcastReciever);
    }
}
