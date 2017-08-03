package com.example.nikhil.product;

/**
 * Created by nikhil on 14/6/17.
 */

/*
db.execSQL("create table "+GLISTEN_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer");
        db.execSQL("create table "+GLAM_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer");
        db.execSQL("create table "+VOX_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer");

 */

// Also for vox, vox touch, glam

public class Glisten_product{


    public String code;
    public String description;
    public int modules;
    public int pkg;
    public int mrp;
    public int image;


    public Glisten_product(String code_r, String description_r, int modules_r, int pkg_r, int mrp_r, int image_r){

        code = code_r;
        description = description_r;
        modules = modules_r;
        pkg = pkg_r;
        mrp = mrp_r;
        image = image_r;

    }
}


