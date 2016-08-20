package com.example.com.firstsubject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.com.firstsubject.R;
import com.example.com.firstsubject.data.SurveyData;

/**
 * Created by com on 2016-08-15.
 */
public class SurveyViewHolder extends RecyclerView.ViewHolder {
    SurveyData surveyData;
    TextView titleView, lessonView, answerView;

    public SurveyViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView) itemView.findViewById(R.id.text_lesson_title);
        lessonView = (TextView) itemView.findViewById(R.id.text_lessonnum);
        answerView = (TextView) itemView.findViewById(R.id.text_answernum);
    }

    public void setSurveyData(SurveyData surveyData) {
        this.surveyData = surveyData;
        titleView.setText(surveyData.title);
        lessonView.setText(surveyData.lesson);
        answerView.setText(surveyData.answer);
    }
}
