package com.example.istorya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page1 extends AppCompatActivity {
    TextView hello;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("name");
        hello.setText(pangalan +" goes to a party");
    }
    public void MainActivity(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, com.example.istorya.MainActivity.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goTopage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}
