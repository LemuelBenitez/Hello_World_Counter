package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
TextView show_count;
Button button_count,button_toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_count =(TextView) findViewById(R.id.show_count);
        button_count=(Button) findViewById(R.id.button_count);
        button_toast = (Button) findViewById(R.id.button_toast);

        button_count.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View i){

             show_count.setText(convert(show_count.toString()));
            }
        });

        button_toast.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View p){
             show_count.setText(reset(show_count.toString()));
             String msg = "Hello Toast!";
             Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
             toast.show();
            }
        });
    }

public String convert(String s){
        s = show_count.getText().toString();
        int b = Integer.parseInt(s);
        b++;
        s = Integer.toString(b);
        return s;
}

public String reset(String k){
        k = show_count.getText().toString();
        int f = Integer.parseInt(k);
        f = 1;
        k = Integer.toString(f);
        return k;
}
}