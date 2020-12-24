package com.example.btthuchanhcuoiky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_TaiKhoan extends Fragment {

    TextView tv_thht_342,tv_cd_342,tv_cauhoi_342;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 = inflater.inflate(R.layout.fragment_user, container, false);
        return v_342;
    }
}