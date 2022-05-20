package com.example.food_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.food_app.R;


public class FragmentSecond extends Fragment {
//    private RecyclerView recyclerViewItem;
//    private RecyclerviewAdapter recyclerviewAdapter;
    public FragmentSecond() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_cart, container, false);
    }
}