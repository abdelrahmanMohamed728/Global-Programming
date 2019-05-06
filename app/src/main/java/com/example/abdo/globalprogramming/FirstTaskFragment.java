package com.example.abdo.globalprogramming;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstTaskFragment extends Fragment {
   ListView listView1;
   List<Item> list;
   FirstTaskAdapter listAdapter;
    public FirstTaskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_first_task, container, false);
        listView1 = v.findViewById(R.id.listview1);
        list = new ArrayList<>();
        list.add(new Item(R.drawable.food3,"Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times"));
        list.add(new Item(R.drawable.food5,"Info"));
        list.add(new Item(R.drawable.food7,"Info"));
        list.add(new Item(R.drawable.foo6,"INfo"));
        listAdapter = new FirstTaskAdapter(getContext(),list);
        listView1.setAdapter(listAdapter);
        return v;
    }

}
