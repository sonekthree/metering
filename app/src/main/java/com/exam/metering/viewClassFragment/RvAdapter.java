package com.exam.metering.viewClassFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.R;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CustomViewHolder> {

    private Context context;
    private String review;
    private List<Review_info> items;
    RatingBar ratingBar;
    public RvAdapter(Context context, List<Review_info> items) {
        this.context = context;
        this.items = items;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_item, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        ratingBar = view.findViewById(R.id.ratingbar);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        final float rating = items.get(position).rating;
        final String content = items.get(position).content;
        ratingBar.setRating(rating);
        holder.tv.setText(content);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        public CustomViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv_review);
        }
    }
}
