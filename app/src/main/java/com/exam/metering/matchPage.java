package com.exam.metering;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class matchPage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_match_page, container, false);
        // Inflate the layout for this fragment
        ImageView imageView = view.findViewById(R.id.class_image);
        imageView.setClipToOutline(true);
        Log.d("후훗","후후후");
        return view;
    }
}