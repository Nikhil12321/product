package com.example.nikhil.product;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
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
    int repeatInterval = 5000;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_main_page);
        setSupportActionBar(toolbar);

        slideshow_image_View = (ImageView)findViewById(R.id.slideshow_image_view);
        repeatTask = new Timer();
        primary_list_view = (ListView)findViewById(R.id.main_page_list_view);
        setUpNavigationBar(toolbar);
        final int[] slideshow_pictures = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};


        /*repeatTask.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                slideshow_image_View.setImageResource(slideshow_pictures[i]);
                i = (i+1)%3;
            }
        }, 0, repeatInterval);*/

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
                            i = (i + 1) % 3;

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
                .withHeaderBackground(R.drawable.dotted_background)

                .addProfiles(
                        new ProfileDrawerItem().withName("Girish Switches").withIcon(getResources().getDrawable(R.drawable.girish))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        new DrawerBuilder().withActivity(this).build();


        //create the drawer and remember the `Drawer` result object
        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        new SecondaryDrawerItem().withName("Modular"),
                        new SecondaryDrawerItem().withName("Cables"),
                        new SecondaryDrawerItem().withName("Wires & LED"),
                        new SecondaryDrawerItem().withName("MCBs"),
                        new SecondaryDrawerItem().withName("Switches"),
                        new SecondaryDrawerItem().withName("Accessories"),
                        new SecondaryDrawerItem().withName("Ceiling Fans"),
                        new SecondaryDrawerItem().withName("Water Heaters"),
                        new SecondaryDrawerItem().withName("Life Style Living")

                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D

                        switch(position){

                            case 1: modular(toolbar);
                                    result.closeDrawer();
                                    break;
                        }
                        return true;
                    }
                })
                .build();
    }
}
