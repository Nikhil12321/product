package com.example.nikhil.product;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by nikhil on 2/5/17.
 */

public class ListItemAdapter extends ArrayAdapter<ListItem>{
    public ListItemAdapter(Context context, ArrayList<ListItem> list) {
        super(context, 0, list);
    }
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position

        ListItem listItem = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        // Lookup view for data population

        TextView tvName = (TextView) convertView.findViewById(R.id.list_item_text_view);

        // Populate the data into the template view using the data object

        tvName.setText(listItem.text);
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Glisten.class);
                v.getContext().startActivity(intent);
            }
        });
        // Return the completed view to render on screen
        return convertView;

    }
}
