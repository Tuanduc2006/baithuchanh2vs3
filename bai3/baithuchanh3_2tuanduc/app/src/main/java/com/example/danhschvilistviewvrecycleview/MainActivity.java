package com.example.danhschvilistviewvrecycleview;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private EditText inputSubject;
    private Button addButton;
    private Button clearButton;
    private ListView subjectListView;

    private ArrayList<String> subjectList;
    private SubjectAdapter subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputSubject = findViewById(R.id.inputSubject);
        addButton = findViewById(R.id.addButton);
        clearButton = findViewById(R.id.clearButton);
        subjectListView = findViewById(R.id.subjectListView);


        subjectList = new ArrayList<>();
        subjectAdapter = new SubjectAdapter();


        subjectListView.setAdapter(subjectAdapter);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addSubject();
            }
        });


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearAllSubjects();
            }
        });


        subjectListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedSubject = subjectList.get(position);

            Toast.makeText(
                    MainActivity.this,
                    "Môn học được chọn: " + selectedSubject,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }

    private void addSubject() {
        String subjectName = inputSubject.getText().toString().trim();

        if (subjectName.length() == 0) {
            Toast.makeText(
                    MainActivity.this,
                    "Bạn chưa nhập tên môn học",
                    Toast.LENGTH_SHORT
            ).show();
            return;
        }

        subjectList.add(subjectName);
        subjectAdapter.notifyDataSetChanged();

        inputSubject.setText("");
        inputSubject.requestFocus();

        Toast.makeText(
                MainActivity.this,
                "Thêm thành công",
                Toast.LENGTH_SHORT
        ).show();
    }

    private void clearAllSubjects() {
        if (subjectList.size() == 0) {
            Toast.makeText(
                    MainActivity.this,
                    "Danh sách đang trống",
                    Toast.LENGTH_SHORT
            ).show();
            return;
        }

        subjectList.clear();
        subjectAdapter.notifyDataSetChanged();

        Toast.makeText(
                MainActivity.this,
                "Đã xóa toàn bộ danh sách",
                Toast.LENGTH_SHORT
        ).show();
    }


    private class SubjectAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return subjectList.size();
        }

        @Override
        public Object getItem(int position) {
            return subjectList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView;

            if (convertView == null) {
                textView = new TextView(MainActivity.this);
                textView.setPadding(24, 20, 24, 20);
                textView.setTextSize(18);
                textView.setTextColor(0xFF000000);
                textView.setBackgroundColor(0xFFFFFFFF);
            } else {
                textView = (TextView) convertView;
            }

            String subjectName = subjectList.get(position);
            textView.setText((position + 1) + ". " + subjectName);

            return textView;
        }
    }
}