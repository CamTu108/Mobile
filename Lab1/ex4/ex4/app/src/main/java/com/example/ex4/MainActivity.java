package com.example.ex4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edNd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNd=findViewById(R.id.edNoiDung);
        AlertDialog dialog=new AlertDialog.Builder(this).create();
        edNd.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(i==keyEvent.KEYCODE_DPAD_DOWN){
                    String mess=edNd.getText().toString();
                    dialog.setMessage(mess);
                    dialog.show();
                    return true;
                }
                return false;
            }
        });
    }
}