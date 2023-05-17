package com.easebuzz.jitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.easebuzz.demo.DemoToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txthello=findViewById(R.id.txthello);
        txthello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DemoToast.ShowToast(getApplicationContext(),"Demo");
            }
        });

    }
}