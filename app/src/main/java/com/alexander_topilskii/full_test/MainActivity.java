package com.alexander_topilskii.full_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexander_topilskii.full_test.fragments.MainFragmentsActivity;
import com.alexander_topilskii.full_test.lifecycle.LifeCycleMainActivity;
import com.alexander_topilskii.full_test.lifecycle.MyFragmentActivity;
import com.alexander_topilskii.full_test.lifecycle.MyBroadcastService;
import com.alexander_topilskii.full_test.logging.LogShower;
import com.alexander_topilskii.full_test.logging.MyLogger;
import com.alexander_topilskii.full_test.lifecycle.MyActivity1;
import com.alexander_topilskii.full_test.lifecycle.MyActivity2;
import com.alexander_topilskii.full_test.lifecycle.MyService;
import com.alexander_topilskii.full_test.recycleCardView.CardViewMain;

public class MainActivity extends AppCompatActivity {

    Button goToLogBtn;
    Button goToLifeCycleBtn;

    Button goToCardViewActivity;
    Button goToFileActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToLogBtn = (Button) findViewById(R.id.goToLog);

        goToCardViewActivity = (Button) findViewById(R.id.cardview_open_activity);
        goToFileActivity = (Button) findViewById(R.id.work_with_file);
        goToLifeCycleBtn = (Button) findViewById(R.id.lifcycle_activity_btn);

        startService(new Intent(MainActivity.this, MyBroadcastService.class));
        //registerReceiver(new MyBroadcastReceiver(), filter);

        goToLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LogShower.class);
                startActivity(intent);
            }
        });

        goToLifeCycleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LifeCycleMainActivity.class);
                startActivity(intent);
            }
        });

        goToCardViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CardViewMain.class));
            }
        });

        goToFileActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WorkWithFiles.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLogger.log(this, "===========================");
    }
}
