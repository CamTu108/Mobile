package com.example.ex3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btnTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTime=findViewById(R.id.btnTime);
        AlertDialog dialog=new AlertDialog.Builder(this).create();
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date=new Date();
                String mess="Thoi gian hien hanh "+date.toLocaleString();
                dialog.setMessage(mess);
                dialog.show();
            }
        });
    }
}