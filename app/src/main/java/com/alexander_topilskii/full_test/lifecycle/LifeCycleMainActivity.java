package com.alexander_topilskii.full_test.lifecycle;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexander_topilskii.full_test.MainActivity;
import com.alexander_topilskii.full_test.R;
import com.alexander_topilskii.full_test.fragments.MainFragmentsActivity;
import com.alexander_topilskii.full_test.logging.LogShower;

public class LifeCycleMainActivity extends Activity {
    Button goToLifecycle1Btn;
    Button goToLifecycle2Btn;
    Button stopServiceBtn;
    Button startServiceBtn;
    Button sendBroadcast;
    Button goToFragmentActivity;
    Button goToFragmentsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_cicycle_main);

        goToLifecycle1Btn = (Button) findViewById(R.id.goToLifecycleActivity1);
        goToLifecycle2Btn = (Button) findViewById(R.id.goToLifecycleActivity2);
        startServiceBtn = (Button) findViewById(R.id.start_service);
        stopServiceBtn = (Button) findViewById(R.id.stop_service);
        sendBroadcast = (Button) findViewById(R.id.sendBroadcast);
        goToFragmentActivity = (Button) findViewById(R.id.fragment_open_activity);
        goToFragmentsActivity = (Button) findViewById(R.id.fragments_open_activity);

        goToLifecycle1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleMainActivity.this, MyActivity1.class));
            }
        });

        goToLifecycle2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleMainActivity.this, MyActivity2.class));
            }
        });


        startServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(LifeCycleMainActivity.this, MyService.class));
            }
        });

        stopServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(LifeCycleMainActivity.this, MyService.class));
            }
        });

        sendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("TOPILSKII_INTENT");
                sendBroadcast(intent);
            }
        });

        goToFragmentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleMainActivity.this, MyFragmentActivity.class));
            }
        });

        goToFragmentsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleMainActivity.this, MainFragmentsActivity.class));
            }
        });
    }
}
