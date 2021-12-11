package com.exam.metering;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Class_info_item;


public class ViewHolderCategory extends RecyclerView.ViewHolder{
    ImageView classImage;
    TextView txtOnline;
    TextView txtClassName;
    TextView txtCurNum;
    TextView txtAllNum;
    TextView txtUserName;
    TextView txtWeekCount;
    TextView txtHour;
    TextView txtAllCount;
    TextView txtPrice;

    public ViewHolderCategory(@NonNull View itemView) {
        super(itemView);
        //classImage = itemView.findViewById(R.id.class_image);
        txtOnline = itemView.findViewById(R.id.txt_online);
        txtClassName = itemView.findViewById(R.id.txt_classname);
        txtCurNum = itemView.findViewById(R.id.txt_curnum);
        txtAllNum = itemView.findViewById(R.id.txt_allnum);
        txtUserName = itemView.findViewById(R.id.txt_username);
        txtWeekCount = itemView.findViewById(R.id.txt_weekcount);
        txtHour = itemView.findViewById(R.id.txt_hour);
        txtAllCount = itemView.findViewById(R.id.txt_allcount);
        txtPrice = itemView.findViewById(R.id.txt_price);

    }

    public void onBind(Class_info_item data){
        //classImage.setImageDrawable(data.classPic);
        txtOnline.setText(data.classType);
        txtClassName.setText(data.className);
        txtCurNum.setText(""+data.classCurNum);
        txtAllNum.setText(""+data.classAllNum);
        txtUserName.setText(data.classUser);
        txtWeekCount.setText(""+data.classWeekCount);
        txtHour.setText(""+data.classHourTime);
        txtAllCount.setText(""+data.classAllNum);
        txtPrice.setText(""+data.classPrice);
    }
}
