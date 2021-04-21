package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chocolate;
    private CheckBox sprinkles;
    private CheckBox crushed;
    private CheckBox cherries;
    private CheckBox orio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate = findViewById(R.id.checkBox1_chocolate);
        sprinkles = findViewById(R.id.checkBox2_sprinkles);
        crushed = findViewById(R.id.checkBox3_crushed_nuts);
        cherries = findViewById(R.id.checkBox4_cherries);
        orio = findViewById(R.id.checkBox5_orio);

    }

    public void showToast(View view) {

        StringBuffer toppings = new StringBuffer();
        toppings.append("Toppings:");

        if  (((CheckBox) findViewById(R.id.checkBox1_chocolate)).isChecked()) {
            toppings.append(" " + getString(R.string.chocolate_syrup));
        }
        if  (((CheckBox) findViewById(R.id.checkBox2_sprinkles)).isChecked()) {
            toppings.append(" " + getString(R.string.sprinkles));
        }
        if  (((CheckBox) findViewById(R.id.checkBox3_crushed_nuts)).isChecked()) {
            toppings.append(" " + getString(R.string.crushed_nuts));
        }
        if  (((CheckBox) findViewById(R.id.checkBox4_cherries)).isChecked()) {
            toppings.append(" " + getString(R.string.cherries));
        }
        if  (((CheckBox) findViewById(R.id.checkBox5_orio)).isChecked()) {
            toppings.append(" " + getString(R.string.orio_cookie_crumbles));
        }
        displayToast(toppings);

    }

    public void displayToast(StringBuffer message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}