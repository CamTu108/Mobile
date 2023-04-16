package com.example.ex2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ex2.fragment.blueFragment;
import com.example.ex2.fragment.grayFragment;
import com.example.ex2.fragment.greenFragment;
import com.example.ex2.fragment.redFragment;

public class colorAdapter extends FragmentStateAdapter {
    public colorAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment= blueFragment.newInstance();
                break;
            case 1:
                fragment= grayFragment.newInstance();
                break;
            case 2:
                fragment= greenFragment.newInstance();
                break;
            case 3:
                fragment= redFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
