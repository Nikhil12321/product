package com.example.nikhil.product;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

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

public class main_page extends AppCompatActivity {

    TextView primary_text_view;
    ListView primary_list_view;
    Drawer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_main_page);
        setSupportActionBar(toolbar);

        primary_list_view = (ListView)findViewById(R.id.main_page_list_view);
        setUpNavigationBar(toolbar);

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
