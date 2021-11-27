package com.exam.metering.viewClassFragment;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.R;

public class ViewHolderReview extends RecyclerView.ViewHolder{

    TextView tv;
    RatingBar ratingBar;

    public ViewHolderReview(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv_review);
        ratingBar =itemView.findViewById(R.id.ratingbar);
    }

    public void onBind(Review_info_item data){
        tv.setText(data.content);
        ratingBar.setRating(data.rating);
    }

}
