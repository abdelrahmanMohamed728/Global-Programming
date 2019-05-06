package com.example.abdo.globalprogramming;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondTaskFragment extends Fragment {
    ListView listView;
    SecondTaskAdapter adapter;
    List<Item> list;
    ImageView cart;
    public SecondTaskFragment()
    {

    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_second_task, container, false);
        listView = v.findViewById(R.id.listview2);
        list = new ArrayList<>();
        list.add(new Item(R.drawable.food3,"Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times"));
        list.add(new Item(R.drawable.food5,"Info"));
        list.add(new Item(R.drawable.food7,"Info"));
        list.add(new Item(R.drawable.foo6,"INfo"));
        adapter =   new SecondTaskAdapter(getContext(),list);
        listView.setAdapter(adapter);
        final ArrayList<Item>l = new ArrayList<>();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, final long id) {
                Button btn1 = view.findViewById(R.id.btn2);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        l.add(list.get(position));
                    }
                });
            }
        });
        cart = v.findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),FinishAcitivity.class);
                intent.putExtra("myList",l);
                startActivity(intent);
            }
        });
        return  v;
    }

}
