package com.example.android.journey;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeijingFragment extends Fragment {


    public BeijingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> placesBeijing = new ArrayList<>();
        placesBeijing.add(new Places("故宫", R.drawable.gu_gong,
                R.string.gugong_intro, R.drawable.gu_gong_s));
        placesBeijing.add(new Places("天坛", R.drawable.tian_tan,
                R.string.tiantan_intro, R.drawable.tian_tan_s));
        placesBeijing.add(new Places("颐和园", R.drawable.yi_he_yuan,
                R.string.yiheyuan_intro, R.drawable.yi_he_yuan_s));
        placesBeijing.add(new Places("圆明园", R.drawable.yuan_ming_yuan,
                R.string.yuanmingyuan_intro, R.drawable.yuan_ming_yuan_s));
        placesBeijing.add(new Places("国家体育场", R.drawable.niao_chao,
                R.string.niaochao_intro, R.drawable.niao_chao_s));
        placesBeijing.add(new Places("长城", R.drawable.chang_cheng,
                R.string.changcheng_intro, R.drawable.chang_cheng_s));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesBeijing);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ContentActivity.class);

                String placeName = placesBeijing.get(position).getmPlaceName();
                int placeIntroId = placesBeijing.get(position).getmPlaceIntroId();
                int placeImageId = placesBeijing.get(position).getmImageId();

                Bundle bundle = new Bundle();
                bundle.putString("placeName", placeName);
                bundle.putInt("placeIntroId", placeIntroId);
                bundle.putInt("placeImageId", placeImageId);
                intent.putExtras(bundle);
                placesBeijing.clear();
                startActivity(intent);
            }
        });


        return rootView;
    }

}
