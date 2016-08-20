package com.example.com.firstsubject;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.com.firstsubject.data.ScheduleData;

/**
 * Created by com on 2016-08-14.
 */
public class ScheduleViewHolder extends RecyclerView.ViewHolder {
    ScheduleData schedule;
    TextView scheduleView;

    public ScheduleViewHolder(View itemView) {
        super(itemView);
        scheduleView = (TextView) itemView.findViewById(R.id.text_schedule);
    }

    public void setSchedule(ScheduleData schedule) {
        this.schedule = schedule;
        scheduleView.setText(schedule.text);
    }
}
