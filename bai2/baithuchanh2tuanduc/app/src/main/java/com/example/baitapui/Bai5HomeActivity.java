package com.example.baitapui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Bai5HomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5_home);

        findViewById(R.id.boxStudent).setOnClickListener(v -> startActivity(new Intent(this, Bai5StudentListActivity.class)));
        findViewById(R.id.btnAddStudent).setOnClickListener(v -> startActivity(new Intent(this, Bai5AddStudentActivity.class)));

        findViewById(R.id.boxTeacher).setOnClickListener(v -> Toast.makeText(this, "Màn hình Giảng viên", Toast.LENGTH_SHORT).show());
        findViewById(R.id.boxSubject).setOnClickListener(v -> Toast.makeText(this, "Màn hình Môn học", Toast.LENGTH_SHORT).show());
        findViewById(R.id.boxStatistic).setOnClickListener(v -> Toast.makeText(this, "Màn hình Thống kê", Toast.LENGTH_SHORT).show());
    }
}
