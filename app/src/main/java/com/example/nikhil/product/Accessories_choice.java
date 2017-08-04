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
        setContentView(R.layout.accessories_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_accessories_choice);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Choose Product");




    }

    public void lamp_holder_click(View v){


    }

    public void ceiling_rose_click(View v){


    }

    public void plug_top_click(View v){


    }

    public void bed_switch_click(View v){


    }

    public void dp_switch_click(View v){


    }

    public void multi_plug_click(View v){


    }



}
