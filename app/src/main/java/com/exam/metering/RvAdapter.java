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

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(type == 0){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_item, parent, false);
            return new ViewHolderReview(view);
        }
        return null;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolderReview){
            ((ViewHolderReview)holder).onBind(listData.get(position));
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
