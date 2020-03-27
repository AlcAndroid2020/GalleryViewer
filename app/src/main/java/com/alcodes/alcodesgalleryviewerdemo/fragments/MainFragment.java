package com.alcodes.alcodesgalleryviewerdemo.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alcodes.alcodesgalleryviewerdemo.databinding.FragmentMainBinding;
import com.alcodes.alcodesgalleryviewerdemo.databinding.bindingcallbacks.MainBindingCallback;
import com.alcodes.alcodessmgalleryviewer.activities.AsmGvrMainActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment implements MainBindingCallback {

    private FragmentMainBinding mDataBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Init data binding;
        mDataBinding = FragmentMainBinding.inflate(inflater, container, false);

        return mDataBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Init binding callback.
        mDataBinding.setBindingCallback(this);
    }

    @Override
    public void onLocalFilesDemoButtonClicked() {
        // TODO
        startActivity(new Intent(requireActivity(), AsmGvrMainActivity.class));
//        Toast.makeText(requireActivity(), "Coming soon...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUrlDemoButtonClicked() {
        // TODO
        Toast.makeText(requireActivity(), "Coming soon...", Toast.LENGTH_SHORT).show();
    }
}
