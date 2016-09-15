package com.alexander_topilskii.full_test.lifecycle;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.alexander_topilskii.full_test.logging.MyLogger;

public class MyBroadcastService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        MyLogger.log(this, "onCreate");

        BroadcastReceiver myBrodcast = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                MyLogger.log("BroadcastReceiver", "onReceive" + " " + intent.getAction());
            }
        };

        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        intentFilter.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(myBrodcast, intentFilter);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        MyLogger.log(this, "onBind");
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //super.onStartCommand(intent, flags, startId);
        return START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MyLogger.log(this, "onDestroy");
    }
}
