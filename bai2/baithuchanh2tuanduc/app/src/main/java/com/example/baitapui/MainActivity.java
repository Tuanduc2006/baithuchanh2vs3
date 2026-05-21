package com.example.baitapui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBai1).setOnClickListener(v -> startActivity(new Intent(this, Bai1Activity.class)));
        findViewById(R.id.btnBai2).setOnClickListener(v -> startActivity(new Intent(this, Bai2Activity.class)));
        findViewById(R.id.btnBai3).setOnClickListener(v -> startActivity(new Intent(this, Bai3Activity.class)));
        findViewById(R.id.btnBai4).setOnClickListener(v -> startActivity(new Intent(this, Bai4Activity.class)));
        findViewById(R.id.btnBai5).setOnClickListener(v -> startActivity(new Intent(this, Bai5HomeActivity.class)));
    }
}
