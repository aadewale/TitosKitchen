package com.example.android.titoskitchen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


/**
 * Created by aadewale on 2/24/2018.
 */


public class OrderJollofrice extends AppCompatActivity {

    int pricejollof;
    String outputjollof;
    String jollofprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderjollofrice);
        // Get the Intent that started this activity and extract the string
        /*Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);*/
        // Capture the layout's TextView and set the string as its text
    }
    public static String EXTRA_MESSAGE="your_message";
    public static String EXTRA_MESSAGE1="your_message1";




    public String SubmitJollof() {
        CheckBox jlf = (CheckBox) findViewById(R.id.jollof);
        CheckBox plt = (CheckBox) findViewById(R.id.plantain);
        CheckBox meat = (CheckBox) findViewById(R.id.meat);
        CheckBox fish = (CheckBox) findViewById(R.id.fish);
        boolean jlf_b = jlf.isChecked();
        boolean plt_b = plt.isChecked();
        boolean meat_b = meat.isChecked();
        boolean fish_b = fish.isChecked();

        if (jlf_b) {

            pricejollof += 600;
            outputjollof = "Jollof_Rice:    N600";

        }
        if (plt_b) {

            pricejollof += 200;
            outputjollof += "\nPlantain:         N200";
        }

        if (meat_b) {

            pricejollof += 100;
            outputjollof += "\nMeat:               N100";

        }

        if (fish_b) {

            pricejollof += 150;
            outputjollof += "\nFish:                N600";
        }

         jollofprice = Integer.toString(pricejollof);
         String jollof_all = outputjollof + "\n" + jollofprice;
        return jollof_all;




    }
        public void sendMessage(View view) {
           Intent intent = new Intent(this, MainActivity.class);
            //            intent.putExtra(EXTRA_MESSAGE, Jollof_all);
//            Intent intent = new Intent(this, MainActivity.class);
            String Jollof_all = SubmitJollof();
           if (pricejollof !=0) {
               intent.putExtra(EXTRA_MESSAGE, jollofprice);
               intent.putExtra(EXTRA_MESSAGE1, outputjollof);
               Toast.makeText(this, jollofprice, Toast.LENGTH_SHORT).show();
           }
            Toast.makeText(this, jollofprice, Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
}

