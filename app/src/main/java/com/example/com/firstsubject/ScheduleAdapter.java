package com.example.com.firstsubject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.com.firstsubject.data.ScheduleData;

import java.util.List;

/**
 * Created by com on 2016-08-14.
 */
public class ScheduleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ScheduleData> scheduleDataList;

    public void setSchedule(List<ScheduleData> scheduleDataList) {
        if (this.scheduleDataList != scheduleDataList) {
            this.scheduleDataList = scheduleDataList;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        if (scheduleDataList == null) {
            return 0;
        }
        return scheduleDataList.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_schedule, parent, false);
        ScheduleViewHolder holder = new ScheduleViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (scheduleDataList.size() > 0) {
            if (position < scheduleDataList.size()) {
                ScheduleViewHolder svh = (ScheduleViewHolder) holder;
                svh.setSchedule(scheduleDataList.get(position));
                return;
            }
            position -= scheduleDataList.size();
        }
        throw new IllegalArgumentException("invalid position");

    }
}
