package com.example.nikhil.product;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class Alternate extends AppCompatActivity {


    DbHelper dbHelper;
    ListView listView;
    Alternate_adapter adapter;
    private int mShortAnimationDuration;
    private Animator mCurrentAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glisten);


        String product = getIntent().getExtras().getString("product");
        listView = (ListView)findViewById(R.id.glisten_list_view);
        dbHelper = new DbHelper(this);

        ArrayList<Properties> product_list;

        if(product.equals("lamp_holder")){
            product_list = dbHelper.getAllLampHolder();
        }
        else if(product.equals("ceiling_rose")){
            product_list = dbHelper.getAllCeilingRose();
        }
        else if(product.equals("plug_top")){
            product_list = dbHelper.getAllPlugTop();
        }
        else if(product.equals("bed_switch")){
            product_list = dbHelper.getAllBedSwitch();
        }
        else if(product.equals("dp_switch")){
            product_list = dbHelper.getAllDPSwitch();
        }
        else if(product.equals("distribution_board")){
            product_list = dbHelper.getAllDistributionBoard();
        }
        else if(product.equals("musical_bell")){
            product_list = dbHelper.getAllMusicalBell();
        }
        else if(product.equals("conversion_plug")){
            product_list = dbHelper.getAllConversionPlug();
        }
        else if(product.equals("gang_box")){
            product_list = dbHelper.getAllGangBox();
        }
        else if(product.equals("line_tester")){
            product_list = dbHelper.getAllLineTester();
        }
        else if(product.equals("insulation_tap")){
            product_list = dbHelper.getAllInsulationTape();
        }
        else if(product.equals("wisdom")){
            product_list = dbHelper.getAllWisdom();
        }
        else if(product.equals("mini_gold")){
            product_list = dbHelper.getAllMiniGold();
        }
        else if(product.equals("vijeta")){
            product_list = dbHelper.getAllVijeta();
        }
        else if(product.equals("victor")){
            product_list = dbHelper.getAllVictor();
        }
        else if(product.equals("gracia")){
            product_list = dbHelper.getAllGracia();
        }
        else if(product.equals("line_tester")){
            product_list = dbHelper.getAllLineTester();
        }
        else if(product.equals("insulation_tape")){
            product_list = dbHelper.getAllInsulationTape();
        }
        else if(product.equals("iron_connector")){
            product_list = dbHelper.getAllIronConnector();
        }
        else{
            product_list = dbHelper.getAllMultiPlug();
        }


        mShortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);


        adapter = new Alternate_adapter(this, R.layout.alternate_layout, product_list);
        listView.setAdapter(adapter);


    }

    public void image_button_click_alternate(View v){

        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }

        final ImageButton image = (ImageButton)v;
        final ImageView expanded_image_view = (ImageView)findViewById(R.id.expanded_image);
        expanded_image_view.setImageDrawable(image.getDrawable());

        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffset = new Point();

        image.getGlobalVisibleRect(startBounds);
        findViewById(R.id.container).getGlobalVisibleRect(finalBounds, globalOffset);
        startBounds.offset(-globalOffset.x, -globalOffset.y);
        finalBounds.offset(-globalOffset.x, globalOffset.y);

        float startScale;
        if ((float) finalBounds.width() / finalBounds.height()
                > (float) startBounds.width() / startBounds.height()) {
            // Extend start bounds horizontally
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width()) / 2;
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            // Extend start bounds vertically
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale /* *finalBounds.height()*/;
            float deltaHeight = (startHeight - startBounds.height()) / 2;
/*            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;*/
        }

        // Hide the thumbnail and show the zoomed-in view. When the animation begins,
        // it will position the zoomed-in view in the place of the thumbnail.

        listView.setVisibility(View.GONE);

        expanded_image_view.setVisibility(View.VISIBLE);

        // Set the pivot point for SCALE_X and SCALE_Y transformations to the top-left corner of
        // the zoomed-in view (the default is the center of the view).
        expanded_image_view.setPivotX(0f);
        expanded_image_view.setPivotY(0f);

        // Construct and run the parallel animation of the four translation and scale properties
        // (X, Y, SCALE_X, and SCALE_Y).
        AnimatorSet set = new AnimatorSet();
        set
                .play(ObjectAnimator.ofFloat(expanded_image_view, View.X, startBounds.left,
                        finalBounds.left))
                .with(ObjectAnimator.ofFloat(expanded_image_view, View.Y, startBounds.top,
                        finalBounds.top))
                .with(ObjectAnimator.ofFloat(expanded_image_view, View.SCALE_X, startScale, 1f))
                .with(ObjectAnimator.ofFloat(expanded_image_view, View.SCALE_Y, startScale, 1f));
        set.setDuration(mShortAnimationDuration);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;

        // Upon clicking the zoomed-in image, it should zoom back down to the original bounds
        // and show the thumbnail instead of the expanded image.
        final float startScaleFinal = startScale;
        expanded_image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel, back to their
                // original values.
                AnimatorSet set = new AnimatorSet();
                set
                        .play(ObjectAnimator.ofFloat(expanded_image_view, View.X, startBounds.left))
                        .with(ObjectAnimator.ofFloat(expanded_image_view, View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expanded_image_view, View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expanded_image_view, View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        findViewById(R.id.container).setBackgroundResource(R.color.girish_crappy_gray);
                        listView.setVisibility(View.VISIBLE);
                        expanded_image_view.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        findViewById(R.id.container).setBackgroundResource(R.color.girish_crappy_gray);
                        listView.setVisibility(View.VISIBLE);
                        expanded_image_view.setVisibility(View.GONE);

                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });

        findViewById(R.id.container).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }

                // Animate the four positioning/sizing properties in parallel, back to their
                // original values.
                AnimatorSet set = new AnimatorSet();
                set
                        .play(ObjectAnimator.ofFloat(expanded_image_view, View.X, startBounds.left))
                        .with(ObjectAnimator.ofFloat(expanded_image_view, View.Y, startBounds.top))
                        .with(ObjectAnimator
                                .ofFloat(expanded_image_view, View.SCALE_X, startScaleFinal))
                        .with(ObjectAnimator
                                .ofFloat(expanded_image_view, View.SCALE_Y, startScaleFinal));
                set.setDuration(mShortAnimationDuration);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        findViewById(R.id.container).setBackgroundResource(R.color.girish_crappy_gray);
                        listView.setVisibility(View.VISIBLE);
                        expanded_image_view.setVisibility(View.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        findViewById(R.id.container).setBackgroundResource(R.color.girish_crappy_gray);
                        listView.setVisibility(View.VISIBLE);
                        expanded_image_view.setVisibility(View.GONE);

                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });

    }
}
