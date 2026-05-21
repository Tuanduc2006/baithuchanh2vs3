package com.example.baitapui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class Bai4Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        showFragment(new InfoFragment());

        findViewById(R.id.btnInfo).setOnClickListener(v -> showFragment(new InfoFragment()));
        findViewById(R.id.btnHistory).setOnClickListener(v -> showFragment(new HistoryFragment()));
        findViewById(R.id.btnSetting).setOnClickListener(v -> showFragment(new SettingsFragment()));
    }

    private void showFragment(Fragment fragment) {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}
