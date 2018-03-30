package com.example.android.journey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class XiamenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new XiamenFragment())
                .commit();
    }
}
