package com.example.com.firstsubject.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.com.firstsubject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by com on 2016-08-20.
 */
public class TimeTableViewPagerAdapter extends PagerAdapter {
    List<Integer> items = new ArrayList<>();

    public void add(int day) {
        items.add(day);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.view_timetable, container, false);
        TextView todayView, tomorrowView, yesterdayView;

        todayView = (TextView) view.findViewById(R.id.text_today);
        tomorrowView = (TextView) view.findViewById(R.id.text_tomorrow);
        yesterdayView = (TextView) view.findViewById(R.id.text_yesterday);

        int today = items.get(position);
        int yesterday = items.get(position) - 1;
        int tomorrow = items.get(position) + 1;

        todayView.setText("" + today);
        tomorrowView.setText("" + tomorrow);
        yesterdayView.setText("" + yesterday);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
