package com.example.com.firstsubject;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.com.firstsubject.adapter.DrawerAdapter;
import com.example.com.firstsubject.data.DrawerChild;
import com.example.com.firstsubject.data.DrawerGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment {


    public static final int ID_USER_INFO = 100;
    public static final int ID_MY_CLASSROOM = 200;
    public static final int ID_NOTICE = 201;
    public static final int ID_SCHEDULE = 202;
    public static final int ID_SATISFY_SURVEY = 203;
    public static final int ID_ONLINE_CLASS = 204;
    public static final int ID_EDU_INFO = 300;
    public static final int ID_EDU_PROGRAM = 301;
    public static final int ID_EDU_PLACE = 302;
    public static final int ID_COMMUNITY = 400;
    public static final int ID_RESOURCE = 401;
    public static final int ID_GALARY = 402;
    public static final int ID_TEACHER_INFO = 403;
    public static final int ID_SURVEY = 404;
    public static final String MENU_USER_INFO = "임지수 모바일안드로이드 개발-단일반";
    public static final String MENU_MY_CLASSROOM = "나의 강의실";
    DrawerGroup[] menuList = {
            new DrawerGroup(MENU_USER_INFO, ID_USER_INFO),
            new DrawerGroup(MENU_MY_CLASSROOM, ID_MY_CLASSROOM,
                    new DrawerChild("공지사항", ID_NOTICE),
                    new DrawerChild("시간표", ID_SCHEDULE),
                    new DrawerChild("만족도설문", ID_SATISFY_SURVEY),
                    new DrawerChild("On-Line과정", ID_ONLINE_CLASS)),
            new DrawerGroup("교육안내", ID_EDU_INFO,
                    new DrawerChild("교육프로그램", ID_EDU_PROGRAM),
                    new DrawerChild("교육장소", ID_EDU_PLACE)),
            new DrawerGroup("커뮤니티", ID_COMMUNITY,
                    new DrawerChild("자료실", ID_RESOURCE),
                    new DrawerChild("갤러리", ID_GALARY),
                    new DrawerChild("강사정보", ID_TEACHER_INFO),
                    new DrawerChild("설문조사", ID_SURVEY))
    };
    ExpandableListView listView;
    DrawerAdapter mAdapter;

    public DrawerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new DrawerAdapter(menuList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_custom_drawer, container, false);
        View drawerHeader = inflater.inflate(R.layout.header_custom_drawer, container, false);
        listView = (ExpandableListView) view.findViewById(R.id.expandableListView);
        listView.addHeaderView(drawerHeader);
        listView.setAdapter(mAdapter);


        for (int i = 0; i < menuList.length; i++) {
            listView.expandGroup(i);
        }

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView listView, View view, int groupposition, int childposition, long id) {

                int gid = (int) mAdapter.getGroupId(groupposition);
                int cid = (int) mAdapter.getChildId(groupposition, childposition);

                Intent intent;

                if (gid == 1) {
                    if (cid == 0) {
                        intent = new Intent(getActivity(), NoticeActivity.class);
                        startActivity(intent);
                    } else if (cid == 1) {
                        Toast.makeText(getActivity(), "시간표 클릭", Toast.LENGTH_SHORT).show();
                        intent = new Intent(getActivity(), TimeTableActivity.class);
                        startActivity(intent);
                    } else if (cid == 2) {
                        intent = new Intent(getActivity(), SurveyActivity.class);
                        startActivity(intent);
                    } else if (cid == 3) {
                        Toast.makeText(getActivity(), "on-line과정 클릭", Toast.LENGTH_SHORT).show();
                    }
                } else if (gid == 2) {
                    if (cid == 0) {
                        Toast.makeText(getActivity(), "교육프로그램 클릭", Toast.LENGTH_SHORT).show();
                    } else if (cid == 1) {
                        Toast.makeText(getActivity(), "교육장소 클릭", Toast.LENGTH_SHORT).show();
                    }
                } else if (gid == 3) {
                    if (cid == 0) {
                        Toast.makeText(getActivity(), "자료실 클릭", Toast.LENGTH_SHORT).show();
                    } else if (cid == 1) {
                        intent = new Intent(getActivity(), GalleryActivity.class);
                        startActivity(intent);
                    } else if (cid == 2) {
                        intent = new Intent(getActivity(), TeacherInfoActivity.class);
                        startActivity(intent);
                    } else if (cid == 3) {
                        Toast.makeText(getActivity(), "설문조사 클릭", Toast.LENGTH_SHORT).show();
                    }
                }
                return true;
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
