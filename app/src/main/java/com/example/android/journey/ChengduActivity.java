package com.example.android.journey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ChengduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ChengduFragment())
                .commit();
    }
}
