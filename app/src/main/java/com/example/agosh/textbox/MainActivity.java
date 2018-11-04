package com.example.agosh.textbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ok;
    private TextView txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.name);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener().OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, " USEAR NAME ", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
