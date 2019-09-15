package com.example.doan2.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.doan2.View.TrangChu.Fragment.FBlog;
import com.example.doan2.View.TrangChu.Fragment.FGoiY;
import com.example.doan2.View.TrangChu.Fragment.FPoint;
import com.example.doan2.View.TrangChu.Fragment.FPointStore;
import com.example.doan2.View.TrangChu.Fragment.FlashSale;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment = new ArrayList<Fragment>();
    List<String> titleFragment = new ArrayList<String>();


        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return listFragment.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        listFragment.add(fragment);
        titleFragment.add(title);
    }
    @Override
    public int getCount() {

        return listFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
