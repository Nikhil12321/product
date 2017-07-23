package com.example.nikhil.product;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikhil on 14/6/17.
 */

public class Glisten_adapter extends ArrayAdapter<Glisten_product>{
    public Glisten_adapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
    public Glisten_adapter(Context context, int resource, List<Glisten_product> items){
        super(context, resource, items);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View v = convertView;
        if(v == null){

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.glisten_layout_vertical, null);

        }

        Glisten_product p = getItem(position);
        if(p != null){

            /*****Uncomment for horizaontal*********
            ImageButton glisten_image_button = (ImageButton)v.findViewById(R.id.glisten_image_button);
            TextView code_tv = (TextView)v.findViewById(R.id.glisten_code);
            TextView description_tv = (TextView)v.findViewById(R.id.glisten_description);
            TextView modules_tv = (TextView)v.findViewById(R.id.glisten_modules);
            TextView pkg_tv = (TextView)v.findViewById(R.id.glisten_pkg);
            TextView mrp_tv = (TextView)v.findViewById(R.id.glisten_mrp);
            if(code_tv != null)
                code_tv.setText(p.code);
            if(description_tv != null)
                description_tv.setText(p.description);
            /*if(modules_tv != null)
                modules_tv.setText("Asdasd");*/
            /*if(pkg_tv != null)
                pkg_tv.setText(p.pkg);
            if(mrp_tv != null)
                mrp_tv.setText(p.mrp);*/

            /*******************************************/

            ImageButton glisten_image_button = (ImageButton)v.findViewById(R.id.glisten_image_button_vertical);
            TextView code_tv = (TextView)v.findViewById(R.id.glisten_code_vertical);
            TextView description_tv = (TextView)v.findViewById(R.id.glisten_description_vertical);
            TextView modules_tv = (TextView)v.findViewById(R.id.glisten_modules_vertical);
            TextView pkg_tv = (TextView)v.findViewById(R.id.glisten_pkg_vertical);
            TextView mrp_tv = (TextView)v.findViewById(R.id.glisten_mrp_vertical);

            if(glisten_image_button != null)
                glisten_image_button.setImageResource(p.image);
            if(code_tv != null)
                code_tv.setText(p.code);
            if(description_tv != null)
                description_tv.setText(p.description);
            if(modules_tv != null)
                modules_tv.setText(Integer.toString( p.modules) );
            if(pkg_tv != null)
                pkg_tv.setText(Integer.toString( p.pkg) );
            if(mrp_tv != null)
                mrp_tv.setText(Integer.toString( p.mrp) );

            /****** HARDCODED *****
            if(p.code.contains("3720"))
                glisten_image_button.setImageResource(R.drawable.glisten_3720);
            if(p.code.contains("3702"))
                glisten_image_button.setImageResource(R.drawable.glisten_3702);
            else
                glisten_image_button.setImageResource(R.drawable.glisten_3703);
            /**********************/

        }
        return v;
    }
}
