package com.example.nikhil.product;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class LED extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.led_layout);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        ListView listView = (ListView)findViewById(R.id.led_list_view);
        DbHelper dbHelper = new DbHelper(this);
        ArrayList<LED_properties> product_list = dbHelper.getAllLED();

        led_adapter adapter = new led_adapter(this, R.layout.new_led_layou, product_list);
        listView.setAdapter(adapter);



    }

}
