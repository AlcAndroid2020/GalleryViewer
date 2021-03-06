package com.alcodes.alcodesgalleryviewerdemo;

import android.app.Application;

import com.alcodes.alcodessmgalleryviewer.AsmGvrApp;

import timber.log.Timber;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        AsmGvrApp.init(this);
    }
}
