package com.example.nikhil.product;

/**
 * Created by nikhil on 11/11/17.
 */

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Fan_adapter extends ArrayAdapter<Fan_properties> {

    public Fan_adapter(@NonNull Context context, @LayoutRes int resource){

        super(context, resource);
    }

    public Fan_adapter(Context context, int resource, List<Fan_properties> items){
        super(context, resource, items);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View v = convertView;
        if(v == null){

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.fan_layout, null);

        }

        Fan_properties p = getItem(position);
        if(p != null){

            ImageButton fan_image_button = (ImageButton)v.findViewById(R.id.fan_image_button);
            TextView fan_code = (TextView)v.findViewById(R.id.fan_code);
            ImageView color_fan = (ImageView)v.findViewById(R.id.fan_color);
            TextView fan_mrp = (TextView)v.findViewById(R.id.fan_mrp);

            if(fan_image_button != null)
                fan_image_button.setImageResource(p.image);
            if(fan_code != null)
                fan_code.setText(p.code);
            if(fan_mrp != null)
                fan_mrp.setText(p.mrp);
            if(color_fan != null)
                color_fan.setBackgroundColor(Color.parseColor(p.color));

        }
        return v;
    }

}

