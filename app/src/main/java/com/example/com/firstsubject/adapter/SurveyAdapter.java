package com.example.com.firstsubject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.com.firstsubject.R;
import com.example.com.firstsubject.data.SurveyData;
import com.example.com.firstsubject.view.SurveyViewHolder;

import java.util.List;

/**
 * Created by com on 2016-08-15.
 */
public class SurveyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<SurveyData> surveyDataList;

    public void setSurveyDataList(List<SurveyData> surveyDataList) {
        if (this.surveyDataList != surveyDataList) {
            this.surveyDataList = surveyDataList;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        if (surveyDataList == null) {
            return 0;
        }
        return surveyDataList.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_survey, parent, false);
        SurveyViewHolder holder = new SurveyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (surveyDataList.size() > 0) {
            if (position < surveyDataList.size()) {
                SurveyViewHolder svh = (SurveyViewHolder) holder;
                svh.setSurveyData(surveyDataList.get(position));
                return;
            }
            position -= surveyDataList.size();
        }
        throw new IllegalArgumentException("invalid position");
    }

}
