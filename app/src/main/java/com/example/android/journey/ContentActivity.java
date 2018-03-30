package com.example.android.journey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);

        ImageView imageView = (ImageView) this.findViewById(R.id.image);
        TextView textViewTitle = (TextView) this.findViewById(R.id.title);
        TextView textViewContent = (TextView) this.findViewById(R.id.content);

        Intent intent = getIntent();
        String placeName = intent.getStringExtra("placeName");
        int placeIntroId = intent.getIntExtra("placeIntroId", 0);
        int placeImageId = intent.getIntExtra("placeImageId", 0);

        textViewTitle.setText(placeName);
        textViewContent.setText(placeIntroId);
        imageView.setImageResource(placeImageId);
    }
}
