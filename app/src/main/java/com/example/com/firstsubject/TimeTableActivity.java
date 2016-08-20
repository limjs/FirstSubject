package com.example.com.firstsubject;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.com.firstsubject.adapter.TimeTableViewPagerAdapter;

public class TimeTableActivity extends AppCompatActivity {
    ViewPager mPager;
    TimeTableViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        mPager = (ViewPager) findViewById(R.id.timetable_viewpager);
        mAdapter = new TimeTableViewPagerAdapter();
        mPager.setAdapter(mAdapter);

        initData();

    }

    private void initData() {
        for (int i = 0; i < 5; i++) {
            mAdapter.add(i + 12);
        }
    }
}
