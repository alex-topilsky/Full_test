package com.alexander_topilskii.full_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexander_topilskii.full_test.Logging.LogShower;
import com.alexander_topilskii.full_test.Logging.MyLogger;
import com.alexander_topilskii.full_test.lifecycle.MyActivity1;
import com.alexander_topilskii.full_test.lifecycle.MyActivity2;
import com.alexander_topilskii.full_test.lifecycle.MyService;

public class MainActivity extends AppCompatActivity {
    Button goToLogBtn;
    Button goToLifecycle1Btn;
    Button goToLifecycle2Btn;
    Button stopServiceBtn;
    Button startServiceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToLogBtn = (Button) findViewById(R.id.goToLog);
        goToLifecycle1Btn = (Button) findViewById(R.id.goToLifecycleActivity1);
        goToLifecycle2Btn = (Button) findViewById(R.id.goToLifecycleActivity2);
        startServiceBtn = (Button) findViewById(R.id.start_service);
        stopServiceBtn = (Button) findViewById(R.id.stop_service);

        goToLifecycle1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyActivity1.class));
            }
        });

        goToLifecycle2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyActivity2.class));
            }
        });

        goToLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LogShower.class);
                startActivity(intent);
            }
        });

        startServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyService.class));
            }
        });

        stopServiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLogger.log(this, "===========================");
    }
}
