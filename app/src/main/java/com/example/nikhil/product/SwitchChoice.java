package com.example.nikhil.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SwitchChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_switch_choice);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Switches");
    }

    public void wisdom_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "wisdom");
        startActivity(intent);
    }

    public void mini_gold_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "mini_gold");
        startActivity(intent);
    }

    public void vijeta_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "vijeta");
        startActivity(intent);
    }

    public void victor_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "victor");
        startActivity(intent);
    }

    public void line_tester_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "line_tester");
        startActivity(intent);
    }

    public void gracia_click(View v){

        Intent intent = new Intent(this, Alternate.class);
        intent.putExtra("product", "gracia");
        startActivity(intent);
    }
}
