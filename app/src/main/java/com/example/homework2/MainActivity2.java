package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button=findViewById(R.id.button2);//описали переменную и связали с кнопкой
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle=getIntent().getExtras();
        EditText editText=findViewById(R.id.result);
        String v1 = getIntent().getExtras().get("v1").toString();
        String v2 = getIntent().getExtras().get("v2").toString();
        String s = getIntent().getExtras().get("s").toString();
        String t = getIntent().getExtras().get("t").toString();
        float iv1 = new Float(v1);
        float iv2 = new Float(v2);
        float is = new Float(s);
        float it = new Float(t);
        float result = is - (iv1+iv2)*it;
        if (result<0) result = 0;
        editText.setText(String.valueOf(result)+" км");
        Log.i("Sveta", String.valueOf(result));

    }
}