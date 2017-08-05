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
    public static final String VOX_TOUCH_TABLE = "vox_touch";
    public static final String LAMP_HOLDER_TABLE = "lamp_holder";
    public static final String CEILING_ROSE_TABLE = "ceiling_rose";
    public static final String PLUG_TOP_TABLE = "plug_top";
    public static final String BED_SWITCH_TABLE = "bed_switch";
    public static final String DP_SWITCH_TABLE = "dp_switch";
    public static final String MULTI_PLUG_TABLE = "multi_plug";



    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "+GLISTEN_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+GLAM_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+VOX_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+VOX_TOUCH_TABLE+" (code text, description text, modules integer, pkg integer, mrp integer, image integer);");
        db.execSQL("create table "+LAMP_HOLDER_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+CEILING_ROSE_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+PLUG_TOP_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+BED_SWITCH_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+DP_SWITCH_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+MULTI_PLUG_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");

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

    public boolean insertIntoVOXTouch(String code, String description, int modules, int pkg, int mrp, int image){

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
            db.insert(VOX_TOUCH_TABLE, null, contentValues);
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

    public boolean insertIntoLampHolder(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(LAMP_HOLDER_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoCeilingRose(String code, String description, float pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(CEILING_ROSE_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoPlugTop(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(PLUG_TOP_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }
    public boolean insertIntoBedSwitch(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(BED_SWITCH_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoDPSwitch(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(DP_SWITCH_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }
    public boolean insertIntoMultiPlug(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(MULTI_PLUG_TABLE, null, contentValues);
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

    public ArrayList<Glisten_product> getAllVoxTouchProducts() {
        ArrayList<Glisten_product> array_list = new ArrayList<Glisten_product>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+VOX_TOUCH_TABLE, null );
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

    public ArrayList<Properties> getAllLampHolder() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+LAMP_HOLDER_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Properties> getAllCeilingRose() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+CEILING_ROSE_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Properties> getAllPlugTop() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+PLUG_TOP_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Properties> getAllBedSwitch() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+BED_SWITCH_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Properties> getAllDPSwitch() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+DP_SWITCH_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public ArrayList<Properties> getAllMultiPlug() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+MULTI_PLUG_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String code = res.getString(res.getColumnIndex("code"));
            String description = res.getString(res.getColumnIndex("description"));
            int pkg = res.getInt(res.getColumnIndex("pkg"));
            float mrp = res.getInt(res.getColumnIndex("mrp"));
            int image = res.getInt(res.getColumnIndex("image"));

            Properties product = new Properties(code, description, pkg, mrp, image);

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

    public void initDatabaseVoxTouch(){

        insertIntoVOXTouch("VOX Touch 1", "---", 0, 0, 0, R.drawable.vox_touch1);
        insertIntoVOXTouch("VOX Touch 2", "---", 0, 0, 0, R.drawable.vox_touch2);
        insertIntoVOXTouch("VOX Touch 3", "---", 0, 0, 0, R.drawable.vox_touch3);
        insertIntoVOXTouch("VOX Touch 4", "---", 0, 0, 0, R.drawable.vox_touch4);
    }

    public void initDatabaseLampHolder(){

        insertIntoLampHolder("147", "Batten Holder", 20, 18.5f, R.drawable.lamp_holder_147);
        insertIntoLampHolder("148", "Angle Holder", 20, 18.5f, R.drawable.lamp_holder_148);
        insertIntoLampHolder("149", "Batten Holder", 20, 18.5f, R.drawable.lamp_holder_149);
        insertIntoLampHolder("150", "Batten Holder", 20, 18.5f, R.drawable.lamp_holder_150);
        insertIntoLampHolder("759", "Glam Grand Batten Holder", 10, 59.40f, R.drawable.lamp_holder_476);
        insertIntoLampHolder("475", "Batten Holder", 10, 45.70f, R.drawable.lamp_holder_476);
        insertIntoLampHolder("701", "Batten Holder", 20, 24.50f, R.drawable.lamp_holder_701);

    }

    public void initDatabaseCelingRose(){

        insertIntoCeilingRose("163", "Ceiling Rose", 20, 18.50f, R.drawable.ceiling_rose_163);
        insertIntoCeilingRose("167", "Ceiling Rose Jumbo", 20, 18.50f, R.drawable.ceiling_rose_167);
        insertIntoCeilingRose("168", "Ceiling Rose Jumbo", 20, 18.50f, R.drawable.ceiling_rose_168);
    }

    public void initDatabasePlugTop(){

        insertIntoPlugTop("170", "16A. Three Pin Top", 10, 46.70f, R.drawable.plug_top_170);
        insertIntoPlugTop("366", "6A. Three Pin Top", 20, 26.60f, R.drawable.plug_top_366);
        insertIntoPlugTop("367", "16A. Three Pin Top", 10, 46.70f, R.drawable.plug_top_367);
        insertIntoPlugTop("477", "6A. Three Pin Top", 20, 29.90f, R.drawable.plug_top_477);
        insertIntoPlugTop("478", "16A. 3 Pin Top with indicator", 10, 50.90f, R.drawable.plug_top_478);
        insertIntoPlugTop("173", "6A. Three Pin Top", 20, 27.75f, R.drawable.plug_top_173);
        insertIntoPlugTop("174", "16A. Three Pin Top", 10, 48.95f, R.drawable.plug_top_174);
    }

    public void initDatabaseBedSwitch(){

        insertIntoBedSwitch("201", "Bed Switch", 20, 10.85f, R.drawable.bed_switch_201);
        insertIntoBedSwitch("202", "Bed Bell Switch", 20, 11.40f, R.drawable.bed_switch_202);
        insertIntoBedSwitch("203", "Bed Switch", 20, 10.85f, R.drawable.bed_switch_203);
        insertIntoBedSwitch("204", "Bed Bell Switch", 20, 11.40f, R.drawable.bed_switch_204);
        insertIntoBedSwitch("205", "Bed Switch", 20, 10.85f, R.drawable.bed_switch_205);
        insertIntoBedSwitch("206", "Bed Bell Switch", 20, 11.40f, R.drawable.bed_switch_206);
    }

    public void initDatabaseDPSwitch(){

        insertIntoDPSwitch("223", "D.P Switch", 5, 121.75f, R.drawable.dp_switch_223);
        insertIntoDPSwitch("225", "D.P Switch", 5, 207.00f, R.drawable.dp_switch_225);
    }

    public void initDatabaseMultiPlug(){

        insertIntoMultiPlug("227", "6A. Multi Plug With Indicator", 10, 75.07f, R.drawable.multi_plug_227);
        insertIntoMultiPlug("228", "16A. Multi Plug With Indicator", 10, 108.70f, R.drawable.multi_plug_228);
        insertIntoMultiPlug("385", "16A. Multi Plug", 10, 77.40f, R.drawable.multi_plug_385);
        insertIntoMultiPlug("441", "2 Pin multi plug", 20, 13.70f, R.drawable.multi_plug_441);
        insertIntoMultiPlug("474", "2 To 5 Multi Plug", 10, 18.30f, R.drawable.multi_plug_474);
        insertIntoMultiPlug("439", "5 Pin multi plug", 20, 27.15f, R.drawable.multi_plug_439);
        insertIntoMultiPlug("440", "5 Pin multi plug", 20, 23.90f, R.drawable.multi_plug_440);
    }

}
