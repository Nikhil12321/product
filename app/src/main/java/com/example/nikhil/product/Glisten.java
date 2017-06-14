package com.example.nikhil.product;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class Glisten extends AppCompatActivity {

    DbHelper dbHelper;
    ListView listView;
    Glisten_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glisten);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.glisten_list_view);
        dbHelper = new DbHelper(this);
        ArrayList<Glisten_product> product_list = dbHelper.getAllGlistenProducts();

        for(int i=0; i<product_list.size(); i++)
            Log.e("values", product_list.get(i).code.toString());

        adapter = new Glisten_adapter(this, product_list);
        listView.setAdapter(adapter);
    }

}
