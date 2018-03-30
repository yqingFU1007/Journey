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
public class XiamenFragment extends Fragment {


    public XiamenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> placesXiamen = new ArrayList<>();
        placesXiamen.add(new Places(R.string.gulangyu, R.drawable.gu_lang_yu,
                R.string.gulangyu_intro, R.drawable.gu_lang_yu_s));
        placesXiamen.add(new Places(R.string.xiada, R.drawable.xia_da,
                R.string.xiada_intro, R.drawable.xia_da_s));
        placesXiamen.add(new Places(R.string.zengcuoan, R.drawable.zeng_cuo_an,
                R.string.zengcuoan_intro, R.drawable.zeng_cuo_an_s));
        placesXiamen.add(new Places(R.string.nanputuo, R.drawable.nan_pu_tuo,
                R.string.nanputuo_intro, R.drawable.nan_pu_tuo_s));
        placesXiamen.add(new Places(R.string.zhiwuyuan, R.drawable.zhi_wu_yuan,
                R.string.zhiwuyuan_intro, R.drawable.zhi_wu_yuan_s));
        placesXiamen.add(new Places(R.string.paotai, R.drawable.pao_tai,
                R.string.paotai_intro, R.drawable.pao_tai_s));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), placesXiamen);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(getActivity(), ContentActivity.class);

                int placeNameRs = placesXiamen.get(position).getmPlaceNameRs();
                int placeIntroId = placesXiamen.get(position).getmPlaceIntroId();
                int placeImageId = placesXiamen.get(position).getmImageId();

                Bundle bundle = new Bundle();
                bundle.putInt("placeNameRs", placeNameRs);
                bundle.putInt("placeIntroId", placeIntroId);
                bundle.putInt("placeImageId", placeImageId);
                intent.putExtras(bundle);
                placesXiamen.clear();
                startActivity(intent);
            }
        });


        return rootView;
    }

}
