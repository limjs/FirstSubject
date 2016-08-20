package com.example.com.firstsubject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.com.firstsubject.data.ScheduleData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView listView;
    ScheduleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //시간표 리사이클러 뷰//
        listView = (RecyclerView) findViewById(R.id.list_view);
        mAdapter = new ScheduleAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);
        //시간표 리사이클러 뷰//

        //버튼 누르면 다른 액티비티로 이동//
        ImageButton imgbtn = (ImageButton) findViewById(R.id.imgbtn_gallery);
        imgbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(intent);
            }
        });

        ImageButton imgbtn2 = (ImageButton) findViewById(R.id.imgbtn_survey);
        imgbtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SurveyActivity.class);
                startActivity(intent);
            }
        });


        //버튼 누르면 다른 액티비티로 이동//

        initData();
    }

    private void initData() {

        List<ScheduleData> scheduleDataList = new ArrayList<>();

        ScheduleData scheduleFirst = new ScheduleData();
        scheduleFirst.text = "수업이 없습니다.";
        scheduleDataList.add(scheduleFirst);

        ScheduleData schduleSecond = new ScheduleData();
        schduleSecond.text = "수업이 없습니다.";
        scheduleDataList.add(schduleSecond);

        ScheduleData schduleThird = new ScheduleData();
        schduleThird.text = "수업이 없습니다.";
        scheduleDataList.add(schduleThird);

        ScheduleData scheduleForth = new ScheduleData();
        scheduleForth.text = "수업이 없습니다.";
        scheduleDataList.add(scheduleForth);

        mAdapter.setSchedule(scheduleDataList);
    }
}
