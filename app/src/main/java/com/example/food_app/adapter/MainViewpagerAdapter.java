package com.example.food_app.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.food_app.fragment.FragmentFirst;
import com.example.food_app.fragment.FragmentSecond;
import com.example.food_app.fragment.FragmentThird;

public class MainViewpagerAdapter extends FragmentStateAdapter {
    public MainViewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FragmentFirst();
            case 1:
                return new FragmentSecond();
            case 2:
                return new FragmentThird();

            default:
                return new FragmentFirst();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
