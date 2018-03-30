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
        placesBeijing.add(new Places(R.string.gugong, R.drawable.gu_gong,
                R.string.gugong_intro, R.drawable.gu_gong_s));
        placesBeijing.add(new Places(R.string.tiantan, R.drawable.tian_tan,
                R.string.tiantan_intro, R.drawable.tian_tan_s));
        placesBeijing.add(new Places(R.string.yiheyuan, R.drawable.yi_he_yuan,
                R.string.yiheyuan_intro, R.drawable.yi_he_yuan_s));
        placesBeijing.add(new Places(R.string.yuanmingyuan, R.drawable.yuan_ming_yuan,
                R.string.yuanmingyuan_intro, R.drawable.yuan_ming_yuan_s));
        placesBeijing.add(new Places(R.string.niaochao, R.drawable.niao_chao,
                R.string.niaochao_intro, R.drawable.niao_chao_s));
        placesBeijing.add(new Places(R.string.changcheng, R.drawable.chang_cheng,
                R.string.changcheng_intro, R.drawable.chang_cheng_s));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesBeijing);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ContentActivity.class);

                int placeNameRs = placesBeijing.get(position).getmPlaceNameRs();
                int placeIntroId = placesBeijing.get(position).getmPlaceIntroId();
                int placeImageId = placesBeijing.get(position).getmImageId();

                Bundle bundle = new Bundle();
                bundle.putInt("placeNameRs", placeNameRs);
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
