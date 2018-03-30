package com.example.android.journey;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/3/29.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {


    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    final int[] colors = {R.color.blue_1, R.color.blue_2, R.color.blue_3, R.color.blue_4, R.color.blue_5, R.color.blue_6};


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Places placesCurrent = getItem(position);

        int color = ContextCompat.getColor(getContext(), colors[position]);


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        imageView.setImageResource(placesCurrent.getmImageIdSmall());

        ImageView botton = (ImageView) listItemView.findViewById(R.id.botton);
        botton.setBackgroundColor(color);

        TextView textView = (TextView) listItemView.findViewById(R.id.place_name);
        textView.setText(placesCurrent.getmPlaceName());

        textView.setBackgroundColor(color);

        return listItemView;
    }
}
