package com.example.nikhil.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Product_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Choose Product");

    }

    public void glisten_click(View v){

        Intent intent = new Intent(this, Glisten.class);
        startActivity(intent);
    }

    public void glam_click(View v){

        Intent intent = new Intent(this, Glisten.class);
        startActivity(intent);
    }

    public void vox_click(View v){

        Intent intent = new Intent(this, Glisten.class);
        startActivity(intent);
    }

    public void vox_saga_click(View v){

        Intent intent = new Intent(this, Glisten.class);
        startActivity(intent);
    }

}
