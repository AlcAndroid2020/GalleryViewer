package com.alcodes.alcodesgalleryviewerdemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.alcodes.alcodesgalleryviewerdemo.databinding.ActivityMainBinding;
import com.alcodes.alcodesgalleryviewerdemo.databinding.bindingcallbacks.MainBindingCallback;
import com.alcodes.alcodessmgalleryviewer.activities.AsmGvrMainActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainBindingCallback {

    private ActivityMainBinding mDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Init data binding.
        mDataBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mDataBinding.getRoot());

        mDataBinding.setBindingCallback(this);
    }

    @Override
    public void onLocalFilesDemoButtonClicked() {
        // TODO
//        startActivity(new Intent(this, AsmGvrMainActivity.class));
        Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUrlDemoButtonClicked() {
        // TODO
        Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show();
    }
}
