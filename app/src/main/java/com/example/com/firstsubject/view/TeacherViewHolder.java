package com.example.com.firstsubject.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.com.firstsubject.R;
import com.example.com.firstsubject.data.TeacherData;

/**
 * Created by com on 2016-08-20.
 */
public class TeacherViewHolder extends RecyclerView.ViewHolder {
    TeacherData teacherData;
    TextView nameView, lessonView, emailView, introView;

    public TeacherViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView) itemView.findViewById(R.id.text_teacher_name);
        emailView = (TextView) itemView.findViewById(R.id.text_teacher_email);
        introView = (TextView) itemView.findViewById(R.id.text_teacher_intro);
        lessonView = (TextView) itemView.findViewById(R.id.text_teacher_lesson);
    }

    public void setTeacherData(TeacherData teacherData) {
        this.teacherData = teacherData;
        nameView.setText(teacherData.name);
        emailView.setText(teacherData.email);
        introView.setText(teacherData.intro);
        lessonView.setText(teacherData.lesson);
    }
}
