package com.example.baitapui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Bai5AddStudentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5_add_student);

        findViewById(R.id.btnSave).setOnClickListener(v ->
                Toast.makeText(this, "Đã bấm Lưu sinh viên", Toast.LENGTH_SHORT).show()
        );

        findViewById(R.id.btnCancel).setOnClickListener(v -> finish());
    }
}
