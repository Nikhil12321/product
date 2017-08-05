package com.example.nikhil.product;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikhil on 5/8/17.
 */

public class Alternate_adapter extends ArrayAdapter<Properties> {

    public Alternate_adapter(@NonNull Context context, @LayoutRes int resource){

        super(context, resource);
    }

    public Alternate_adapter(Context context, int resource, List<Properties> items){
        super(context, resource, items);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View v = convertView;
        if(v == null){

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.alternate_layout, null);

        }

        Properties p = getItem(position);
        if(p != null){

            ImageButton glisten_image_button = (ImageButton)v.findViewById(R.id.alternate_image_button_vertical);
            TextView code_tv = (TextView)v.findViewById(R.id.alternate_code_vertical);
            TextView description_tv = (TextView)v.findViewById(R.id.alternate_description_vertical);
            TextView pkg_tv = (TextView)v.findViewById(R.id.alternate_pkg_vertical);
            TextView mrp_tv = (TextView)v.findViewById(R.id.alternate_mrp_vertical);

            if(glisten_image_button != null)
                glisten_image_button.setImageResource(p.image);
            if(code_tv != null)
                code_tv.setText(p.code);
            if(description_tv != null)
                description_tv.setText(p.description);
            if(pkg_tv != null)
                pkg_tv.setText(Integer.toString( p.pkg) );
            if(mrp_tv != null)
                mrp_tv.setText(Float.toString( p.mrp) );


        }
        return v;
    }

}
