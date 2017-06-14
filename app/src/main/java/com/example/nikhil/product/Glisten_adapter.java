package com.example.nikhil.product;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nikhil on 14/6/17.
 */

public class Glisten_adapter extends BaseAdapter implements View.OnClickListener{

    ArrayList<Glisten_product> data;
    Context activity;
    Glisten_product values;
    LayoutInflater layoutInflater=null;


    public Glisten_adapter(Context a, ArrayList<Glisten_product> arrayList){

        activity = a;
        this.data = arrayList;

        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public void onClick(View v) {

    }

    public static class ViewHolder{

        ImageButton product_image_button;

        TextView code;

        TextView description;

        TextView module;

        TextView pkg;

        TextView mrp;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder viewHolder;

        if(convertView == null){

            vi = layoutInflater.inflate(R.layout.glisten_product, null);
            viewHolder = new ViewHolder();
            viewHolder.product_image_button = (ImageButton)vi.findViewById(R.id.glisten_image_button);

            viewHolder.code = (TextView)vi.findViewById(R.id.glisten_code);

            viewHolder.description = (TextView)vi.findViewById(R.id.glisten_description);

            viewHolder.module = (TextView)vi.findViewById(R.id.glisten_modules);

            viewHolder.pkg = (TextView)vi.findViewById(R.id.glisten_pkg);

            viewHolder.mrp = (TextView)vi.findViewById(R.id.glisten_mrp);
        }
        viewHolder = (ViewHolder)vi.getTag();

        values = (Glisten_product)data.get(position);
        int resId = activity.getResources().getIdentifier("com.example.nikhil.product:drawable/glisten_"+viewHolder.code.toString(), null, null);
        viewHolder.product_image_button.setImageResource(resId);
        viewHolder.code.setText(values.code);
        viewHolder.description.setText(values.description);
        viewHolder.module.setText(values.modules);
        viewHolder.pkg.setText(values.pkg);
        viewHolder.mrp.setText(values.mrp);

        vi.setOnClickListener(new OnItemClickListener(position));
        return vi;

    }

    private class OnItemClickListener  implements View.OnClickListener {
        private int mPosition;

        OnItemClickListener(int position){
            mPosition = position;
        }

        @Override
        public void onClick(View arg0) {


            /*CustomListViewAndroidExample sct = (CustomListViewAndroidExample)activity;

            *//****  Call  onItemClick Method inside CustomListViewAndroidExample Class ( See Below )****//*

            sct.onItemClick(mPosition);*/
        }
    }
}
