package com.example.android.journey;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class XianFragment extends Fragment {

    public XianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> placesXian = new ArrayList<>();

        placesXian.add(new Places(R.string.bingmayong, R.drawable.bing_ma_yong,
                R.string.bingmayong_intro, R.drawable.bing_ma_yong_s));
        placesXian.add(new Places(R.string.huaqinggong, R.drawable.hua_qing_chi,
                R.string.huaqingchi_intro, R.drawable.hua_qing_gong_s));
        placesXian.add(new Places(R.string.qianling, R.drawable.qian_ling,
                R.string.qianling_intro, R.drawable.qian_ling_s));
        placesXian.add(new Places(R.string.huashan, R.drawable.hua_shan,
                R.string.huashan_intro, R.drawable.hua_shan_s));
        placesXian.add(new Places(R.string.dayanta, R.drawable.da_yan_ta,
                R.string.dayanta_intro, R.drawable.da_yan_ta_s));
        placesXian.add(new Places(R.string.furongyuan, R.drawable.fu_rong_yuan,
                R.string.furongyuan_intro, R.drawable.fu_rong_yuan_s));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesXian);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ContentActivity.class);

                int placeNameRs = placesXian.get(position).getmPlaceNameRs();
                int placeIntroId = placesXian.get(position).getmPlaceIntroId();
                int placeImageId = placesXian.get(position).getmImageId();

                Bundle bundle = new Bundle();
                bundle.putInt("placeNameRs", placeNameRs);
                bundle.putInt("placeIntroId", placeIntroId);
                bundle.putInt("placeImageId", placeImageId);
                intent.putExtras(bundle);
                placesXian.clear();
                startActivity(intent);
            }
        });

        return rootView;
    }

}
