package com.alonsol.databindingdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.alonsol.databindingdemo.databinding.FragmentBindingBinding;

public class BindingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBindingBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_binding, container, false);
        return binding.getRoot();
    }
}
