package com.example.android.titoskitchen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class OrderAmala extends AppCompatActivity {

    int priceAmala;
    String outputAmala;
    String amalaPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_amala);
    }

    public static String EXTRA_MESSAGEam="your_message";
    public static String EXTRA_MESSAGE1am="your_message1";

    public String SubmitAmala() {
        CheckBox amala = (CheckBox) findViewById(R.id.amala_Ch);
        CheckBox ewedu = (CheckBox) findViewById(R.id.ewedu_Ch);
        CheckBox gbegiri = (CheckBox) findViewById(R.id.gbegiri);
        CheckBox fish = (CheckBox) findViewById(R.id.fish);
        CheckBox meat = (CheckBox) findViewById(R.id.meat);
        boolean amala_b = amala.isChecked();
        boolean ewedu_b = ewedu.isChecked();
        boolean meat_b = meat.isChecked();
        boolean fish_b = fish.isChecked();
        boolean gbegiri_b = gbegiri.isChecked();

        if (amala_b) {

            priceAmala += 600;
            outputAmala = "Amala:    N600";

        }
        if (ewedu_b) {

            priceAmala += 200;
            outputAmala += "\nEwedu:         N200";
        }

        if (meat_b) {

            priceAmala += 100;
            outputAmala += "\nMeat:               N100";

        }
        if (gbegiri_b) {

            priceAmala += 150;
            outputAmala += "\nGbegiri:                N600";
        }


        if (fish_b) {

            priceAmala += 150;
            outputAmala += "\nFish:                N600";
        }
        amalaPrice = Integer.toString(priceAmala);
        String amala_all = outputAmala + "\n" + amalaPrice;
        return amala_all;




    }
    public void sendMessage1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        //            intent.putExtra(EXTRA_MESSAGE, Jollof_all);
//            Intent intent = new Intent(this, MainActivity.class);
        String amala_all = SubmitAmala();
        if (priceAmala !=0) {
            intent.putExtra(EXTRA_MESSAGEam, amalaPrice);
            intent.putExtra(EXTRA_MESSAGE1am, outputAmala);
            Toast.makeText(this, amalaPrice, Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, amalaPrice, Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}

