package com.exam.metering.viewClassFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.R;

import java.util.ArrayList;
import java.util.List;


public class reviewFragment extends Fragment {
    private RecyclerView rv;
    private LinearLayoutManager llm;
    private TextView avg_tv;
    private List<Review_info> count;
    private float total;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_review, container, false);
        rv = (RecyclerView) view.findViewById(R.id.main_rv);
        llm = new LinearLayoutManager(view.getContext());
        avg_tv = (TextView) view.findViewById(R.id.avg);
        String review = "너무좋아요";
        count = new ArrayList<>();
        count.add(new Review_info((float) 3.0, "너무 좋았어요"));
        count.add(new Review_info((float) 2.0, "별로인듯!"));

        for(Review_info i : count){
            total+=i.rating;
        }
        avg_tv.setText(""+total/count.size());

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);
        RvAdapter adapter = new RvAdapter(getActivity().getApplicationContext(),  count);
        rv.setAdapter(adapter);

        return view;
    }
}

class Review_info{
    float rating;
    String content;

    Review_info(float rating, String content){
        this.rating = rating;
        this. content = content;
    }
}
