package com.example.abdo.globalprogramming;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager1;
    TabLayout tab1;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager1 = findViewById(R.id.viewpager1);
        tab1 = findViewById(R.id.tabLayout1);
        viewPagerAdapter  = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager1.setAdapter(viewPagerAdapter);
        tab1.setupWithViewPager(viewPager1);
        tab1.getTabAt(0).setText("Task1");
        tab1.getTabAt(1).setText("Task2");
    }
}
