package com.example.btthuchanhcuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class Fragment_TrangChu extends Fragment {
    ViewPager viewPager;
    GridView gridView;
    String[] titles = {"Trải nghiệm dịch vụ bảo trì của Daikin","[VNReview] Trải nghiệm dịch vụ bảo trì của Dai...","Mua máy lạnh từ E-Shop của Daikin","Máy lạnh 15 củ daikin có gì HOT?","5 cách dùng điều hòa không khí tiết kiệm điện"};
    String[] dates = {"21:08 - 22/09/2020","23:46 - 07/10/2020","11:19 - 30/09/2020","22:42 - 05/09/2020","22:39 - 05/09/2020"};
    int[] imgs ={R.drawable.anh1_tc,R.drawable.anh2_tc,R.drawable.anh3_tc, R.drawable.anh4_tc,R.drawable.anh5_tc};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_342 = inflater.inflate(R.layout.fragment_trangchu,container,false);

        viewPager = (ViewPager) view_342.findViewById(R.id.slide_anh);
        ImageAdapter imageAdapter = new ImageAdapter(getContext());
        viewPager.setAdapter(imageAdapter);

        gridView = (GridView) view_342.findViewById(R.id.gridview_trangchu);
        Fragment_TrangChu.CustomAdapter customAdapter = new Fragment_TrangChu.CustomAdapter();
        gridView.setAdapter(customAdapter);
        return view_342;
    }

    private class CustomAdapter extends  BaseAdapter{
        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.rowdata_gridview,null);
            TextView name = v.findViewById(R.id.tv_item);
            TextView date = v.findViewById(R.id.tv_date);
            ImageView iv = v.findViewById(R.id.iv_anh);

            name.setText(titles[position]);
            date.setText(dates[position]);
            iv.setImageResource(imgs[position]);
            return v;
        }
    }
}
