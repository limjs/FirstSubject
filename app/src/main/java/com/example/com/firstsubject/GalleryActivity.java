package com.example.com.firstsubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.com.firstsubject.data.GalleryData;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    RecyclerView listView;
    GalleryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        listView = (RecyclerView) findViewById(R.id.rv_list_gallery);
        mAdapter = new GalleryAdapter();
        listView.setAdapter(mAdapter);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(manager);

        initData();
    }

    private void initData() {

        List<GalleryData> galleryDataList = new ArrayList<>();

        GalleryData dFirst = new GalleryData();
        dFirst.title = "2016.07.18 동국대 C 문서작성 (5)";
        dFirst.name = "홍길동";
        dFirst.date = "2016-07-18";
        dFirst.count = "10";
        galleryDataList.add(dFirst);

        GalleryData dSecond = new GalleryData();
        dSecond.title = "2016.07.18 동국대 C 문서작성 (4)";
        dSecond.name = "홍길동";
        dSecond.date = "2016-07-18";
        dSecond.count = "10";
        galleryDataList.add(dSecond);

        GalleryData dThird = new GalleryData();
        dThird.title = "2016.07.18 동국대 C 문서작성 (3)";
        dThird.name = "홍길동";
        dThird.date = "2016-07-18";
        dThird.count = "10";
        galleryDataList.add(dThird);

        GalleryData dForth = new GalleryData();
        dForth.title = "2016.07.18 동국대 C 문서작성 (2)";
        dForth.name = "홍길동";
        dForth.date = "2016-07-18";
        dForth.count = "10";
        galleryDataList.add(dForth);

        GalleryData dFifth = new GalleryData();
        dFifth.title = "2016.07.18 동국대 C 문서작성 (1)";
        dFifth.name = "홍길동";
        dFifth.date = "2016-07-18";
        dFifth.count = "10";
        galleryDataList.add(dFifth);

        mAdapter.setGalleryDataList(galleryDataList);
    }
}
