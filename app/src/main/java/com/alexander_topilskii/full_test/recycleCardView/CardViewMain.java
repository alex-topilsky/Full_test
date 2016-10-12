package com.alexander_topilskii.full_test.recycleCardView;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import com.alexander_topilskii.full_test.R;

public class CardViewMain extends Activity {
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_activity);

        cardView = (CardView) findViewById(R.id.my_cardview);
    }
}
