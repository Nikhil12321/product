package com.example.nikhil.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MCB_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcb_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_mcb_choice);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Choose Product");


    }

    public void mcb_click(View v){


    }
    public void distribution_board_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "distribution_board");
        startActivity(intent);
    }
    public void neonbrite_click(View v){


    }

}
