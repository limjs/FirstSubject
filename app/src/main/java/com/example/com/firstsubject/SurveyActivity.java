package com.example.com.firstsubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.com.firstsubject.adapter.SurveyAdapter;
import com.example.com.firstsubject.data.SurveyData;

import java.util.ArrayList;
import java.util.List;

public class SurveyActivity extends AppCompatActivity {
    RecyclerView listView;
    SurveyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (RecyclerView) findViewById(R.id.rv_list_survey);
        mAdapter = new SurveyAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);

        initData();
    }

    private void initData() {
        List<SurveyData> surveyDataList = new ArrayList<>();

        SurveyData sFirst = new SurveyData();
        sFirst.title = "2016년 08월 12일 강의만족도설문";
        sFirst.lesson = "1";
        sFirst.answer = "1";
        surveyDataList.add(sFirst);

        SurveyData sSecond = new SurveyData();
        sSecond.title = "2016년 08월 11일 강의만족도설문";
        sSecond.lesson = "2";
        sSecond.answer = "2";
        surveyDataList.add(sSecond);

        SurveyData sThird = new SurveyData();
        sThird.title = "2016년 08월 10일 강의만족도설문";
        sThird.lesson = "1";
        sThird.answer = "1";
        surveyDataList.add(sThird);

        SurveyData sForth = new SurveyData();
        sForth.title = "2016년 08월 09일 강의만족도설문";
        sForth.lesson = "1";
        sForth.answer = "1";
        surveyDataList.add(sForth);

        SurveyData sFifth = new SurveyData();
        sFifth.title = "2016년 08월 08일 강의만족도설문";
        sFifth.lesson = "1";
        sFifth.answer = "1";
        surveyDataList.add(sFifth);

        SurveyData sSixth = new SurveyData();
        sSixth.title = "2016년 08월 07일 강의만족도설문";
        sSixth.lesson = "1";
        sSixth.answer = "1";
        surveyDataList.add(sSixth);

        SurveyData sSeventh = new SurveyData();
        sSeventh.title = "2016년 08월 06일 강의만족도설문";
        sSeventh.lesson = "2";
        sSeventh.answer = "2";
        surveyDataList.add(sSeventh);

        SurveyData sEighth = new SurveyData();
        sEighth.title = "2016년 08월 05일 강의만족도설문";
        sEighth.lesson = "1";
        sEighth.answer = "1";
        surveyDataList.add(sEighth);

        SurveyData sNineth = new SurveyData();
        sNineth.title = "2016년 08월 04일 강의만족도설문";
        sNineth.lesson = "1";
        sNineth.answer = "1";
        surveyDataList.add(sNineth);

        SurveyData sTenth = new SurveyData();
        sTenth.title = "2016년 08월 03일 강의만족도설문";
        sTenth.lesson = "1";
        sTenth.answer = "1";
        surveyDataList.add(sTenth);


        mAdapter.setSurveyDataList(surveyDataList);
    }
}
