package com.example.nikhil.product;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by nikhil on 12/11/17.
 */

public class Wire extends AppCompatActivity{

    TableLayout wire_table;
    GridView wire_grid;

    Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wire_grid);

        toolbar = (Toolbar)findViewById(R.id.toolbar_wire);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Wires and Cables");


    }

}
