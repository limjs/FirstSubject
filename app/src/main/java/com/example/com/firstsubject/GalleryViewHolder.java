package com.example.com.firstsubject;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.com.firstsubject.data.GalleryData;

/**
 * Created by com on 2016-08-15.
 */
public class GalleryViewHolder extends RecyclerView.ViewHolder {
    GalleryData galleryData;
    TextView nameView, titleView, dateView, countView;

    public GalleryViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView) itemView.findViewById(R.id.text_name);
        titleView = (TextView) itemView.findViewById(R.id.text_title);
        dateView = (TextView) itemView.findViewById(R.id.text_date);
        countView = (TextView) itemView.findViewById(R.id.text_gnum);
    }

    public void setGalleryData(GalleryData galleryData) {
        this.galleryData = galleryData;
        nameView.setText(galleryData.name);
        titleView.setText(galleryData.title);
        dateView.setText(galleryData.date);
        countView.setText(galleryData.count);
    }
}
