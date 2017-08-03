package com.example.nikhil.product;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by nikhil on 14/6/17.
 */

public class DbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "products.db";
    public static final String GLISTEN_TABLE = "glisten";
    public static final String GLAM_TABLE = "glam";
    public static final String VOX_TABLE = "vox";


    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+GLISTEN_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+GLAM_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+VOX_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean insertIntoGlisten(String code, String description, int modules, int pkg, int mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("modules", modules);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(GLISTEN_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoGlam(String code, String description, int modules, int pkg, int mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("modules", modules);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(GLAM_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoVox(String code, String description, int modules, int pkg, int mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("modules", modules);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(VOX_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }


    public ArrayList<Glisten_product> getAllGlistenProducts() {
        ArrayList<Glisten_product> array_list = new ArrayList<Glisten_product>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+GLISTEN_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int modules = res.getInt(res.getColumnIndex("modules"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            int mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Glisten_product product = new Glisten_product(code, description, modules, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }


    // Glisten product is used for glisten, glam and vox since all have
    // the same properties

    public ArrayList<Glisten_product> getAllGlamProducts() {
        ArrayList<Glisten_product> array_list = new ArrayList<Glisten_product>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+GLAM_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int modules = res.getInt(res.getColumnIndex("modules"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            int mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Glisten_product product = new Glisten_product(code, description, modules, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Glisten_product> getAllVoxProducts() {
        ArrayList<Glisten_product> array_list = new ArrayList<Glisten_product>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+VOX_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int modules = res.getInt(res.getColumnIndex("modules"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            int mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Glisten_product product = new Glisten_product(code, description, modules, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public void initDatabaseGlisten(){

        insertIntoGlisten("G 3702", "6A. Two Way Switch", 1, 10, 62, R.drawable.glisten_3758);
        insertIntoGlisten("G 3703", "6A. Two Way Switch", 1, 10, 58, R.drawable.glisten_3703);
        insertIntoGlisten("G 3717", "Light Control Dimmer 650W", 2, 10, 300, R.drawable.glisten_3717);
        insertIntoGlisten("G 3732", "16-25 Motor Starter For 2.0 TON AC.", 2, 10, 340, R.drawable.glisten_3732);
        insertIntoGlisten("G 3733", "32A D.P. Switch With Indicator", 2, 10, 245, R.drawable.glisten_3733);
        insertIntoGlisten("G 3736", "Key Tag", 0, 10, 45, R.drawable.glisten_3736);
        insertIntoGlisten("G 3772", "6A. Charger Socket With Shutter", 2, 10, 84, R.drawable.glisten_3772);

    }

    public void initDatabaseGlam(){

        insertIntoGlam("G 5763", "10 A One Way Switch", 1, 10, 60, R.drawable.glam_5763);
        insertIntoGlam("G 5702", "6 A Two Way Switch", 1, 10, 74, R.drawable.glam_5702);
        insertIntoGlam("G 5703", "6 Bell Push Switch", 1, 10, 70, R.drawable.glam_5703);
        insertIntoGlam("G 5704", "20 A One Way Switch", 1, 10, 86, R.drawable.glam_5704);
        insertIntoGlam("G 5705", "20 Two One Way Switch", 1, 10, 101, R.drawable.glam_5705);
        insertIntoGlam("G 5764", "10 A One Way Switch with indicator", 1, 10, 75, R.drawable.glam_5764);

    }

    public void initDatabaseVox(){

        insertIntoVox("8701", "6A One Way Switch", 1, 10, 60, R.drawable.vox_8701);
        insertIntoVox("8702", "6A Two Way Switch", 1, 10, 81, R.drawable.vox_8702);
        insertIntoVox("8703", "6A Bell Push Switch", 1, 10, 76, R.drawable.vox_8703);
        insertIntoVox("8704", "16A One Way Switch", 1, 10, 95, R.drawable.vox_8704);
        insertIntoVox("8705", "16A Two Way Switch", 1, 10, 110, R.drawable.vox_8705);
        insertIntoVox("8758", "6A One Way Switch with Indicator", 1, 10, 80, R.drawable.vox_8758);

    }

}
