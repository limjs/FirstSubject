package com.example.com.firstsubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.com.firstsubject.adapter.TeacherAdapter;
import com.example.com.firstsubject.data.TeacherData;

import java.util.ArrayList;
import java.util.List;

public class TeacherInfoActivity extends AppCompatActivity {
    RecyclerView listView;
    TeacherAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_info);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (RecyclerView) findViewById(R.id.rv_list_teacher);
        mAdapter = new TeacherAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);


        initData();
    }

    private void initData() {
        List<TeacherData> teacherDataList = new ArrayList<>();

        TeacherData tFirst = new TeacherData();
        tFirst.name = "최지웅";
        tFirst.lesson = "[SK고용디딤돌 소개]";
        tFirst.email = "jiwoong.choi@sk.com";
        tFirst.intro = "등록된 약력이 없습니다.";
        teacherDataList.add(tFirst);

        TeacherData tSecond = new TeacherData();
        tSecond.name = "박선호";
        tSecond.lesson = "[종합 Review]";
        tSecond.email = "prefer@sk.com";
        tSecond.intro = "등록된 약력이 없습니다.";
        teacherDataList.add(tSecond);

        TeacherData tThird = new TeacherData();
        tThird.name = "서유미";
        tThird.lesson = "[우리들 이야기]";
        tThird.email = "symym@naver.com";
        tThird.intro = "현 다중지능연구소 연구강사" + "\n" + "전 한국리더십센터 마케팅 홍보 팀장";
        teacherDataList.add(tThird);

        TeacherData tForth = new TeacherData();
        tForth.name = "김주성";
        tForth.lesson = "[개별 PJT. 아이디어 발표 및 팀빌딩]";
        tForth.email = "jskim@sptek.co.kr";
        tForth.intro = "등록된 약력이 없습니다.";
        teacherDataList.add(tForth);

        TeacherData tFifth = new TeacherData();
        tFifth.name = "연승익";
        tFifth.lesson = "[팀 기획안 발표]";
        tFifth.email = "dongja94@naver.com";
        tFifth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tFifth);

        TeacherData tSixth = new TeacherData();
        tSixth.name = "연승익";
        tSixth.lesson = "[네비게이션 구현]";
        tSixth.email = "dongja94@naver.com";
        tSixth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tSixth);

        TeacherData tSeventh = new TeacherData();
        tSeventh.name = "연승익";
        tSeventh.lesson = "[동작/통신 테스트]";
        tSeventh.email = "dongja94@naver.com";
        tSeventh.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tSeventh);

        TeacherData tEighth = new TeacherData();
        tEighth.name = "연승익";
        tEighth.lesson = "[디버깅(모바일안드로이드)]";
        tEighth.email = "dongja94@naver.com";
        tEighth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tEighth);

        TeacherData tNinth = new TeacherData();
        tNinth.name = "연승익";
        tNinth.lesson = "[시스템 설계(모바일안드로이드)]";
        tNinth.email = "dongja94@naver.com";
        tNinth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tNinth);

        TeacherData tTenth = new TeacherData();
        tTenth.name = "연승익";
        tTenth.lesson = "[안드로이드 프로그래밍(1)]";
        tTenth.email = "dongja94@naver.com";
        tTenth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tTenth);

        TeacherData tEleventh = new TeacherData();
        tEleventh.name = "연승익";
        tEleventh.lesson = "[안드로이드 프로그래밍(2)]";
        tEleventh.email = "dongja94@naver.com";
        tEleventh.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tEleventh);

        TeacherData tTwelfth = new TeacherData();
        tTwelfth.name = "연승익";
        tTwelfth.lesson = "[안드로이드 프로그래밍(3)]";
        tTwelfth.email = "dongja94@naver.com";
        tTwelfth.intro = "(주)디지털파이 대표&안드로이드 강의";
        teacherDataList.add(tTwelfth);


        mAdapter.setTeacherDataList(teacherDataList);
    }
}
