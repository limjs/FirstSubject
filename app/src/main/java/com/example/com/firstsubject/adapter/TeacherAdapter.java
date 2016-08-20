package com.example.com.firstsubject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.com.firstsubject.R;
import com.example.com.firstsubject.data.TeacherData;
import com.example.com.firstsubject.view.TeacherViewHolder;

import java.util.List;

/**
 * Created by com on 2016-08-20.
 */
public class TeacherAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<TeacherData> teacherDataList;

    public void setTeacherDataList(List<TeacherData> teacherDataList) {
        if (this.teacherDataList != teacherDataList) {
            this.teacherDataList = teacherDataList;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        if (teacherDataList == null) {
            return 0;
        }
        return teacherDataList.size();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_teacher_info, parent, false);
        TeacherViewHolder holder = new TeacherViewHolder(view);
        return holder;

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (teacherDataList.size() > 0) {
            if (position < teacherDataList.size()) {
                TeacherViewHolder tvh = (TeacherViewHolder) holder;
                tvh.setTeacherData(teacherDataList.get(position));
                return;
            }
            position -= teacherDataList.size();
        }
        throw new IllegalArgumentException("invalid position");
    }

}
