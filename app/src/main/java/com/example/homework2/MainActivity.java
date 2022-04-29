package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button1);//описали переменную и связали с кнопкой
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                EditText editv1=findViewById(R.id.editv1);
                EditText editv2=findViewById(R.id.editv2);
                EditText edits=findViewById(R.id.edits);
                EditText editt=findViewById(R.id.editt);
                intent.putExtra("v1",editv1.getText());
                intent.putExtra("v2",editv2.getText());
                intent.putExtra("s",edits.getText());
                intent.putExtra("t",editt.getText());
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        Log.i("Sveta","Pause");
        super.onPause();
    }

}