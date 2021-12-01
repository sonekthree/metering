package com.exam.metering;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Review_info_item;

public class ViewHolderClassTag extends RecyclerView.ViewHolder{
    TextView tag;
    public ViewHolderClassTag(@NonNull View itemView) {
        super(itemView);
        tag = itemView.findViewById(R.id.profile_tag);
    }

    public void onBind(Review_info_item data){
        tag.setText(data.tag);
    }
}
