package com.example.android.titoskitchen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String output_Jollof;
    String output_Amala;
    String price_Jollof;
    String price_Amala;
    int priceJollof;
    int priceAmala;
    int totalPrice = priceJollof + priceAmala;
    public static String EXTRA_MESSAGE="your_messagex";
    public static String EXTRA_MESSAGE1="your_messagey1";

    // Get the Intent that started this activity and extract the string
   /* Intent intent = getIntent();
    String messagejollof = intent.getStringExtra(OrderJollofrice.EXTRA_MESSAGE);
*/
    // Capture the layout's TextView and set the string as its text

    /** Called when the user taps the Send button */
    public void OrderB(View view) {
        Intent intent = new Intent(this, OrderJollofrice.class);
       /* EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/
        startActivity(intent);
    }

    public void OrderAmala(View view) {
        Intent intent = new Intent(this, OrderAmala.class);
       /* EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/
        startActivity(intent);

    }
    public void OrderButton(View view) {

        Intent intent = getIntent();
        price_Jollof = intent.getStringExtra(OrderJollofrice.EXTRA_MESSAGE);
        output_Jollof = intent.getStringExtra(OrderJollofrice.EXTRA_MESSAGE1);
        output_Jollof += "\n" + "Jollof Dish Subtotal: " + price_Jollof;
        price_Amala=intent.getStringExtra(OrderAmala.EXTRA_MESSAGEam);

       if (price_Jollof == null) {
            Toast.makeText(this, "Please make your selection", Toast.LENGTH_SHORT).show();
            return;
        }

        priceJollof = Integer.parseInt(price_Jollof);// this statement must be after the if statement; if not it can cause errors when price_jollof=null

        Toast.makeText(this, price_Amala, Toast.LENGTH_SHORT).show();
        intent = new Intent(this, OrderFinal.class);
        intent.putExtra(EXTRA_MESSAGE, output_Jollof);
        startActivity(intent);

    }

}
