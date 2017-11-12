package com.example.nikhil.product;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class main_page extends AppCompatActivity {

    TextView primary_text_view;
    ListView primary_list_view;
    Drawer result;
    ImageView slideshow_image_View;
    Timer repeatTask;
    int repeatInterval = 2000;
    int i = 0;

    String pref_name = "preferences";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_main_page);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Girish Product Catalog");
        DbHelper dbHelper;
        SharedPreferences sharedPreferences;
        sharedPreferences = getApplicationContext().getSharedPreferences(pref_name, 0);
        dbHelper = new DbHelper(this);

        int is_initialized = sharedPreferences.getInt("is_initialized", 0);
        if(is_initialized == 0) {
            dbHelper.initDatabaseGlisten();
            dbHelper.initDatabaseGlam();
            dbHelper.initDatabaseVox();
            dbHelper.initDatabaseLampHolder();
            dbHelper.initDatabaseCelingRose();
            dbHelper.initDatabaseBedSwitch();
            dbHelper.initDatabaseDPSwitch();
            dbHelper.initDatabasePlugTop();
            dbHelper.initDatabaseMultiPlug();
            dbHelper.initDatabaseDistributionBoard();
            dbHelper.initDatabaseLED();
            dbHelper.initDatabaseMusicalBell();
            dbHelper.initDatabaseConversionPlug();
            dbHelper.initDatabaseGangBox();
            dbHelper.initDatabaseIronConnector();
            dbHelper.initDatabaseLineTester();
            dbHelper.initDatabaseInsulationTape();
            dbHelper.initDatabaseWisdom();
            dbHelper.initDatabaseVijeta();
            dbHelper.initDatabaseVictor();
            dbHelper.initDatabaseGracia();
            dbHelper.initDatabaseMiniGold();
            dbHelper.initDatabaseFan();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("is_initialized", 1);
            editor.apply();
            editor.commit();
        }

        slideshow_image_View = (ImageView)findViewById(R.id.slideshow_image_view);
        repeatTask = new Timer();
        primary_list_view = (ListView)findViewById(R.id.main_page_list_view);
        setUpNavigationBar(toolbar);
        final int[] slideshow_pictures = {R.drawable.slide7, R.drawable.slide6,
                                            R.drawable.slide5, R.drawable.slide1,
                                            R.drawable.slide4, R.drawable.slide8,
                                            R.drawable.slide2, R.drawable.slide3};


        startSlideshow(slideshow_pictures);
    }

    Context getActivity(){

        return this;
    }

    void startSlideshow(final int[] slideshow_pictures){

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            slideshow_image_View.setImageResource(slideshow_pictures[i]);
                            i = (i + 1) % 8;

                        }
                    });
                    try {
                        Thread.sleep(repeatInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        th.start();

    }


    void modular(Toolbar toolbar){


        toolbar.setTitle("Modular");
        ArrayList<ListItem> arrayOfProducts = new ArrayList<ListItem>();
        arrayOfProducts.add(0, new ListItem("Glisten"));
        arrayOfProducts.add(1, new ListItem("Glam"));
        arrayOfProducts.add(2, new ListItem("Vox"));
        arrayOfProducts.add(3, new ListItem("Vox Saga"));
        arrayOfProducts.add(4, new ListItem("Vox Touch"));
        arrayOfProducts.add(5, new ListItem("Yellows Attitude Series"));

        ListItemAdapter adapter = new ListItemAdapter(this, arrayOfProducts);
        ListView listView = (ListView)findViewById(R.id.main_page_list_view);
        listView.setAdapter(adapter);


    }

    void setUpNavigationBar(final Toolbar toolbar){

        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.dotted_5_3)
                .withHeaderBackgroundScaleType(ImageView.ScaleType.CENTER_CROP)
                .build();

        new DrawerBuilder().withActivity(this).build();


        //create the drawer and remember the `Drawer` result object
        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        new SecondaryDrawerItem().withName("Modular"),
                        new SecondaryDrawerItem().withName("LED"),
                        new SecondaryDrawerItem().withName("Wires and Cables"),
                        new SecondaryDrawerItem().withName("MCBs"),
                        new SecondaryDrawerItem().withName("Switches"),
                        new SecondaryDrawerItem().withName("Accessories"),
                        new SecondaryDrawerItem().withName("Other Accessories"),
                        new SecondaryDrawerItem().withName("Ceiling Fans"),
                        new SecondaryDrawerItem().withName("Water Heaters"),
                        new SecondaryDrawerItem().withName("Life Style Living")

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D

                        Intent intent_glisten = new Intent(getActivity(), Product_choice.class);
                        Intent intent_led = new Intent(getActivity(), LED.class);
                        Intent intent_accessories = new Intent(getActivity(), Accessories_choice.class);
                        Intent intent_MCB = new Intent(getActivity(), MCB_choice.class);
                        Intent intent_other_accessories = new Intent(getActivity(), OtherAccessoriesChoice.class);
                        Intent intent_switches = new Intent(getActivity(), SwitchChoice.class);
                        Intent intent_fan = new Intent(getActivity(), Fans.class);
                        Intent intent_wire = new Intent(getActivity(), Wire.class);

                        //slideshow_image_View.setVisibility(View.GONE);

                        switch(position){

                            case 1: startActivity(intent_glisten);
                                    result.closeDrawer();
                                    break;
                            case 2: startActivity(intent_led);
                                    break;
                            case 3: startActivity(intent_wire);
                                    break;
                            case 4: startActivity(intent_MCB);
                                    break;
                            case 5: startActivity(intent_switches);
                                    break;
                            case 6: startActivity(intent_accessories);
                                    break;
                            case 7: startActivity(intent_other_accessories);
                                    break;
                            case 8: startActivity(intent_fan);
                                    break;
                        }
                        return true;
                    }
                })
                .build();
    }
}
