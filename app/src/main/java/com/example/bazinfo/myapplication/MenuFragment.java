package com.example.bazinfo.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_menu, container, false);
        ListView listsimple=v.findViewById(R.id.listsimple);
        ArrayList<String> listdsi=new ArrayList<>();
        listdsi.add(" les_plats");
        listdsi.add("soupes");
        listdsi.add("dessert");
        listdsi.add("jus");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,listdsi);
        listsimple.setAdapter(adapter);



        return v;
    }

}
