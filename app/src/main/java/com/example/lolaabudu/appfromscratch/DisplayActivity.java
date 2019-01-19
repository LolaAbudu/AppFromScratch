package com.example.lolaabudu.appfromscratch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private TextView verTextView;
    private TextView nameTextView;
    private TextView apiTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        verTextView = findViewById(R.id.ver_textView_displayActivity);
        nameTextView = findViewById(R.id.name_textView_displayActivity);
        apiTextView = findViewById(R.id.api_textView_displayActivity);

        Intent intent = getIntent();
        verTextView.setText(intent.getStringExtra("ver"));
        nameTextView.setText(intent.getStringExtra("name"));
        apiTextView.setText(intent.getStringExtra("api"));

    }
}

