package com.alexander_topilskii.full_test.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alexander_topilskii.full_test.logging.MyLogger;
import com.alexander_topilskii.full_test.MainActivity;
import com.alexander_topilskii.full_test.R;

public class MyActivity2 extends MyActivity1 {
    TextView log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity2);
        goToMainBtn = (Button) findViewById(R.id.goToMainFromMyActivity);
        log = (TextView) findViewById(R.id.activity2_log);
        log.setMovementMethod(new ScrollingMovementMethod());

        goToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyActivity2.this, MainActivity.class));
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        MyLogger.log(this, "onStart");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyLogger.log(this, "onRestart");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyLogger.log(this, "onResume");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyLogger.log(this, "onPause");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyLogger.log(this, "onStop");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyLogger.log(this, "onDestroy");
        log.setText("");
        log.setText(MyLogger.getLogHistory());
    }
}
