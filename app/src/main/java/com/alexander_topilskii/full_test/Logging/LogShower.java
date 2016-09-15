package com.alexander_topilskii.full_test.Logging;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alexander_topilskii.full_test.MainActivity;
import com.alexander_topilskii.full_test.R;

public class LogShower extends Activity {
    Button goToMainBtn;
    Button clearBtn;
    TextView textHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_shower);
        goToMainBtn = (Button) findViewById(R.id.goToMain);
        clearBtn = (Button) findViewById(R.id.clear);
        textHistory = (TextView) findViewById(R.id.textView);


        textHistory.setText(MyLogger.getLogHistory());
        textHistory.setMovementMethod(new ScrollingMovementMethod());
        goToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogShower.this, MainActivity.class));
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textHistory.setText("");
                MyLogger.clearHistory();
            }
        });
    }
}
