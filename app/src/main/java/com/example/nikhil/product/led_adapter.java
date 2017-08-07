package com.example.nikhil.product;

import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by nikhil on 6/8/17.
 */

public class led_adapter extends ArrayAdapter<LED_properties> {

    public led_adapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public led_adapter(Context context, int resource, List<LED_properties> items){

        super(context, resource, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.new_led_layou, null);

        }

        LED_properties p = getItem(position);
        if( p!= null){

            LinearLayout linearLayout = (LinearLayout)v.findViewById(R.id.new_led_linear_layout);
            TextView text = (TextView)v.findViewById(R.id.new_led_leyout_led_name);
            ImageButton imgbtn = (ImageButton)v.findViewById(R.id.new_led_leyout_led_image);

            linearLayout.setBackgroundResource(p.color);
            text.setText(p.name);
            imgbtn.setImageResource(p.image_id);
        }
        return v;
    }

    /*@NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        if(v == null){

            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.led_spec_layout, null);

        }

        LED_properties p = getItem(position);
        if(p != null){

            LinearLayout color_layout = (LinearLayout)v.findViewById(R.id.led_color_box_id);
            TextView wattage_text_view = (TextView)v.findViewById(R.id.led_description_wattage);
            TextView size_text_view = (TextView)v.findViewById(R.id.led_description_size);
            TextView lit_text_view = (TextView)v.findViewById(R.id.led_description_lit);
            TextView light_text_view = (TextView)v.findViewById(R.id.led_description_light);
            TextView model_text_view = (TextView)v.findViewById(R.id.led_layout_model);
            TextView cri_text_view = (TextView)v.findViewById(R.id.led_layout_cri);
            TextView power_factor_text_view = (TextView)v.findViewById(R.id.led_layout_power_factor);
            TextView voltage_text_view = (TextView)v.findViewById(R.id.led_layout_voltage);
            TextView current_text_view = (TextView)v.findViewById(R.id.led_layout_current);
            TextView frequency_text_view = (TextView)v.findViewById(R.id.led_layout_frequency);
            TextView price_text_view = (TextView)v.findViewById(R.id.led_layout_price);
            TextView code1_text_view = (TextView)v.findViewById(R.id.led_layout_code_1);
            TextView code2_text_view = (TextView)v.findViewById(R.id.led_layout_code_2);
            TextView code3_text_view = (TextView)v.findViewById(R.id.led_layout_code_3);
            TextView code4_text_view = (TextView)v.findViewById(R.id.led_layout_code_4);
            TextView code5_text_view = (TextView)v.findViewById(R.id.led_layout_code_5);
            TextView code6_text_view = (TextView)v.findViewById(R.id.led_layout_code_6);
            TextView circle_dimension_text_view = (TextView)v.findViewById(R.id.led_layout_circle_dimensions);
            TextView square_dimension_text_view = (TextView)v.findViewById(R.id.led_layout_square_dimensions);
            TextView lumen1_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_1);
            TextView lumen2_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_2);
            TextView lumen3_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_3);
            TextView lumen4_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_4);
            TextView lumen5_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_5);
            TextView lumen6_text_view = (TextView)v.findViewById(R.id.led_layout_lumen_6);

            color_layout.setBackgroundColor(p.color);
            wattage_text_view.setText(p.wattage);
            size_text_view.setText(p.size);
            lit_text_view.setText(p.lit);
            light_text_view.setText(p.light);
            model_text_view.setText(p.model);
            cri_text_view.setText(p.cri);
            power_factor_text_view.setText(p.power_factor);
            voltage_text_view.setText(p.voltage);
            current_text_view.setText(p.current);
            frequency_text_view.setText(p.frequency);
            price_text_view.setText(p.price);
            code1_text_view.setText(p.code1);
            code2_text_view.setText(p.code2);
            code3_text_view.setText(p.code3);
            code4_text_view.setText(p.code4);
            code5_text_view.setText(p.code5);
            code6_text_view.setText(p.code6);
            circle_dimension_text_view.setText(p.circle_dimension);
            square_dimension_text_view.setText(p.square_dimension);
            lumen1_text_view.setText(p.lumen1);
            lumen2_text_view.setText(p.lumen2);
            lumen3_text_view.setText(p.lumen3);
            lumen4_text_view.setText(p.lumen4);
            lumen5_text_view.setText(p.lumen5);
            lumen6_text_view.setText(p.lumen6);
        }
        return v;
    }*/
}
