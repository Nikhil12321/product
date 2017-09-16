package com.example.nikhil.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class OtherAccessoriesChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_accessories_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarOtherAccessories);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Other Accessories");
    }

    public void musical_bell_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "musical_bell");
        startActivity(intent);
    }

    public void conversion_plug_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "conversion_plug");
        startActivity(intent);
    }

    public void gang_box_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "gang_box");
        startActivity(intent);
    }

    public void iron_connector_click(View v){


        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "iron_connector");
        startActivity(intent);
    }

    public void line_tester_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "line_tester");
        startActivity(intent);
    }

    public void insulation_tape_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "insulation_tape");
        startActivity(intent);
    }

}
