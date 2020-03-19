package com.alcodes.alcodesgalleryviewerdemo;

import android.app.Application;

import com.alcodes.alcodessmgalleryviewer.AsmGvrApp;

import timber.log.Timber;

public class App extends Application {

    // TODO REF: https://proandroiddev.com/your-android-libraries-should-not-ask-an-application-context-51986cc140d4

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        AsmGvrApp.init(this);
    }
}
