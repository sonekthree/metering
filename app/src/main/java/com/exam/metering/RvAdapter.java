package com.exam.metering;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Review_info_item;
import com.exam.metering.viewClassFragment.ViewHolderReview;

import java.util.ArrayList;
import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private int type;
    private List<Review_info_item> listData = new ArrayList<>();

    public RvAdapter(int type){
        this.type = type;
    }
    /*
    0 : viewClassActivity -> reviewfragment
    1 : profileActivity
    2 : viewClassActivity
    */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(type == 0){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_item, parent, false);
            return new ViewHolderReview(view);
        }else if(type == 1){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tag_item, parent, false);
            return new ViewHolderProfileTag(view);
        }else if(type == 2){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tag_item, parent, false);
            return new ViewHolderClassTag(view);
        }

        return null;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolderReview){
            ((ViewHolderReview)holder).onBind(listData.get(position));
        }else if(holder instanceof ViewHolderProfileTag){
            ((ViewHolderProfileTag)holder).onBind(listData.get(position));
        }else if(holder instanceof ViewHolderClassTag){
            ((ViewHolderClassTag)holder).onBind(listData.get(position));
        }
    }


    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void addItem(Review_info_item data) {
        listData.add(data);
    }
}
