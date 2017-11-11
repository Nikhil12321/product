package com.example.nikhil.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Accessories_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_accessories_choice);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Accessories");


    }

    public void lamp_holder_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "lamp_holder");
        startActivity(intent);
    }

    public void ceiling_rose_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "ceiling_rose");
        startActivity(intent);
    }

    public void plug_top_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "plug_top");
        startActivity(intent);
    }

    public void bed_switch_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "bed_switch");
        startActivity(intent);
    }


    public void line_tester_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "line_tester");
        startActivity(intent);
    }

    public void dp_switch_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "dp_switch");
        startActivity(intent);
    }

    public void multi_plug_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "multi_plug");
        startActivity(intent);
    }



}
