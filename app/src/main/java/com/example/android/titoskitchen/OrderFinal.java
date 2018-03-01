package com.example.android.titoskitchen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class OrderFinal extends AppCompatActivity {

    int totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_final);

        Intent intentx = getIntent();
        String output_Jollof = intentx.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView12 = findViewById(R.id.textView12);
        textView12.setVisibility(View.VISIBLE);
        textView12.setText(output_Jollof);
    }
}
