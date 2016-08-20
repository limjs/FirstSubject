package com.example.com.firstsubject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.com.firstsubject.data.GalleryData;

import java.util.List;

/**
 * Created by com on 2016-08-15.
 */
public class GalleryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<GalleryData> galleryDataList;

    public void setGalleryDataList(List<GalleryData> galleryDataList) {
        if (this.galleryDataList != galleryDataList) {
            this.galleryDataList = galleryDataList;
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemCount() {
        if (galleryDataList == null) {
            return 0;
        }
        return galleryDataList.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_gallery_card, parent, false);
        GalleryViewHolder holder = new GalleryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (galleryDataList.size() > 0) {
            if (position < galleryDataList.size()) {
                GalleryViewHolder svh = (GalleryViewHolder) holder;
                svh.setGalleryData(galleryDataList.get(position));
                return;
            }
            position -= galleryDataList.size();
        }
        throw new IllegalArgumentException("invalid position");
    }

}
