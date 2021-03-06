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
public class ChengduFragment extends Fragment {


    public ChengduFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> placesChengdu = new ArrayList<>();
        placesChengdu.add(new Places(R.string.xiongmao, R.drawable.xiong_mao,
                R.string.xiongmao_intro, R.drawable.xiong_mao_s));
        placesChengdu.add(new Places(R.string.jinli, R.drawable.jin_li,
                R.string.jinli_intro, R.drawable.jin_li_s));
        placesChengdu.add(new Places(R.string.dufu, R.drawable.du_fu,
                R.string.dufu_intro, R.drawable.du_fu_s));
        placesChengdu.add(new Places(R.string.dujiangyan, R.drawable.du_jiang_yan,
                R.string.dujiangyan_intro, R.drawable.du_jiang_yan_s));
        placesChengdu.add(new Places(R.string.wuhouci, R.drawable.wu_hou_ci,
                R.string.wuhouci_intro, R.drawable.wu_hou_ci_s));
        placesChengdu.add(new Places(R.string.xiling, R.drawable.xi_ling,
                R.string.xiling_intro, R.drawable.xi_ling_s));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesChengdu);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ContentActivity.class);

                int placeNameRs = placesChengdu.get(position).getmPlaceNameRs();
                int placeIntroId = placesChengdu.get(position).getmPlaceIntroId();
                int placeImageId = placesChengdu.get(position).getmImageId();

                Bundle bundle = new Bundle();
                bundle.putInt("placeNameRs", placeNameRs);
                bundle.putInt("placeIntroId", placeIntroId);
                bundle.putInt("placeImageId", placeImageId);
                intent.putExtras(bundle);
                placesChengdu.clear();
                startActivity(intent);
            }
        });

        return rootView;
    }
}
