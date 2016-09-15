package com.alexander_topilskii.full_test.lifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.alexander_topilskii.full_test.logging.MyLogger;

public class MyBroadcastReceiver extends BroadcastReceiver {
    public MyBroadcastReceiver() {
        super();
        MyLogger.log(this, "MyBroadcastReceiver constructor");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MyLogger.log(this, "onReceive" + " " + intent.getAction());
    }
}
