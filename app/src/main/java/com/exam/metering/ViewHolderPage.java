package com.exam.metering;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderPage extends RecyclerView.ViewHolder {

    private TextView class_img;
    private RelativeLayout rl_layout;

    DataPage data;

    ViewHolderPage(View itemView) {
        super(itemView);
        class_img = itemView.findViewById(R.id.class_img);
        rl_layout = itemView.findViewById(R.id.rl_layout);
    }

    public void onBind(DataPage data){
        this.data = data;

        class_img.setText(data.getTitle());
        rl_layout.setBackgroundResource(data.getColor());
    }
}
