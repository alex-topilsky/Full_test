package com.alexander_topilskii.full_test.lifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

import com.alexander_topilskii.full_test.Logging.MyLogger;

public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TYPE = "type";
    private static final int ID_ACTION_PLAY = 0;
    private static final int ID_ACTION_STOP = 1;

    public MyBroadcastReceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MyLogger.log(this, "onReceive" + intent.toString());

        int type = intent.getIntExtra(TYPE, ID_ACTION_STOP);
        switch (type) {
            case ID_ACTION_PLAY:
                context.startService(new Intent(context, TextView.class));
                break;
        }

    }
}
