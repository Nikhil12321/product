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
    public static final String MCB_TABLE = "mcb";
    public static final String LED_TABLE = "led";
    public static final String WISDOM_TABLE = "wisdom";
    public static final String VIJETA_TABLE = "vijeta";
    public static final String MINI_GOLD_TABLE = "minigold";
    public static final String VICTOR_TABLE = "victor";
    public static final String GRACIA_TABLE = "gracia";
    public static final String MUSICAL_BELL_TABLE = "musicalbell";
    public static final String CONVERSION_PLUG_TABLE = "conversionplug";
    public static final String GANG_BOX_TABLE = "gangbox";
    public static final String PORCELAIN_FUSE_TABLE = "porcelainfuse";
    public static final String IRON_CONNECTOR_TABLE = "ironconnector";
    public static final String LINE_TESTER_TABLE = "linetester";
    public static final String INSULATION_TAPE_TABLE = "insulationtape";
    public static final String FLEX_BOARD_POWER_STRIP = "flex_board_power_strip";
    public static final String HEATING_AND_PRESS_ELEMENT = "heating_and_press_element";



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
        db.execSQL("create table "+MCB_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+WISDOM_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+VIJETA_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+MINI_GOLD_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+VICTOR_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+GRACIA_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+MUSICAL_BELL_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+CONVERSION_PLUG_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+GANG_BOX_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+PORCELAIN_FUSE_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+IRON_CONNECTOR_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+LINE_TESTER_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+INSULATION_TAPE_TABLE+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+FLEX_BOARD_POWER_STRIP+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+HEATING_AND_PRESS_ELEMENT+" (code text, description text, pkg integer, mrp float, image integer);");
        db.execSQL("create table "+LED_TABLE+" (description text, color integer, image integer);");

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


    public boolean insertIntoFlexBoardPowerStrip(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(FLEX_BOARD_POWER_STRIP, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoHeatingAndPressElement(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(HEATING_AND_PRESS_ELEMENT, null, contentValues);
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


    public boolean insertIntoMusicalBell(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(MUSICAL_BELL_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoConversionPlug(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(CONVERSION_PLUG_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoGangBox(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(GANG_BOX_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }


    public boolean insertIntoPorcelainFuse(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(PORCELAIN_FUSE_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }


    public boolean insertIntoIronConnector(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(IRON_CONNECTOR_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }


    public boolean insertIntoLineTester(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(LINE_TESTER_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoInsulationTape(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(INSULATION_TAPE_TABLE, null, contentValues);
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

    public boolean insertIntoDistributionBoard(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(MCB_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoWisdom(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(WISDOM_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoVictor(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(VICTOR_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoVijeta(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(VIJETA_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoGracia(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(GRACIA_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoMiniGold(String code, String description, int pkg, float mrp, int image){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code", code);
        contentValues.put("description", description);
        contentValues.put("pkg", pkg);
        contentValues.put("mrp", mrp);
        contentValues.put("image", image);
        try {
            Log.e("inside catch", "inserted values");
            db.insert(MINI_GOLD_TABLE, null, contentValues);
            return true;
        }
        catch (Exception e){
            Log.e("inside catch", "did not commit");
            return false;
        }
    }

    public boolean insertIntoLED(String desc, int color, int img){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("description", desc);
        contentValues.put("color", color);
        contentValues.put("image", img);


        try {
            Log.e("inside catch", "inserted values");
            db.insert(LED_TABLE, null, contentValues);
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


    public ArrayList<Properties> getAllWisdom() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+WISDOM_TABLE, null );
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


    public ArrayList<Properties> getAllMusicalBell() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+MUSICAL_BELL_TABLE, null );
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



    public ArrayList<Properties> getAllConversionPlug() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+CONVERSION_PLUG_TABLE, null );
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


    public ArrayList<Properties> getAllGangBox() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+GANG_BOX_TABLE, null );
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

    public ArrayList<Properties> getAllPorcelainTable() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+PORCELAIN_FUSE_TABLE, null );
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


    public ArrayList<Properties> getAllFlexBoardPowerStrip() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+FLEX_BOARD_POWER_STRIP, null );
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


    public ArrayList<Properties> getAllHeatingAndPressElement() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+HEATING_AND_PRESS_ELEMENT, null );
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


    public ArrayList<Properties> getAllIronConnector() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+IRON_CONNECTOR_TABLE, null );
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


    public ArrayList<Properties> getAllLineTester() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+LINE_TESTER_TABLE, null );
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


    public ArrayList<Properties> getAllInsulationTape() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+INSULATION_TAPE_TABLE, null );
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

    public ArrayList<Properties> getAllDistributionBoard() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+MCB_TABLE, null );
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

    public ArrayList<Properties> getAllMiniGold() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+MINI_GOLD_TABLE, null );
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


    public ArrayList<Properties> getAllVijeta() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+VIJETA_TABLE, null );
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

    public ArrayList<Properties> getAllVictor() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+VICTOR_TABLE, null );
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

    public ArrayList<Properties> getAllGracia() {
        ArrayList<Properties> array_list = new ArrayList<Properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+GRACIA_TABLE, null );
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

    public ArrayList<LED_properties> getAllLED() {
        ArrayList<LED_properties> array_list = new ArrayList<LED_properties>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+LED_TABLE, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            String desc = res.getString(res.getColumnIndex("description"));
            int color = res.getInt(res.getColumnIndex("color"));
            int image = res.getInt(res.getColumnIndex("image"));

            LED_properties product = new LED_properties(desc, color, image);

            array_list.add(product);
            res.moveToNext();
        }
        res.close();
        return array_list;
    }

    public void initDatabaseGlisten(){

        insertIntoGlisten("G 3701", "6A. Two Way Switch", 1, 10, 46, R.drawable.glisten_3701);
        insertIntoGlisten("G 3703", "6A. Two Way Switch", 1, 10, 62, R.drawable.glisten_3702);
        insertIntoGlisten("G 3703", "6A Bell Push Switch", 1, 10, 58, R.drawable.glisten_3703);
        insertIntoGlisten("G 3704", "16A One Way Switch.", 1, 10, 72, R.drawable.glisten_3704);
        insertIntoGlisten("G 3705", "16A Two Way Switch", 1, 10, 84, R.drawable.glisten_3705);
        insertIntoGlisten("G 3758", "6A Switch With Indicator", 1, 10, 61, R.drawable.glisten_3758);
        insertIntoGlisten("G 3759", "6A Bell Push Switch With Indicator", 1, 10, 72, R.drawable.glisten_3759);
        insertIntoGlisten("G 3760", "16A One Way Switch With Indicator", 1, 10, 87, R.drawable.glisten_3760);
        insertIntoGlisten("G 3706", "16A One Way Switch With Indicator", 2, 10, 105, R.drawable.glisten_3706);
        insertIntoGlisten("G 3707", "16A Two Way Switch", 2, 10, 115, R.drawable.glisten_3707);
        insertIntoGlisten("G 3708", "6A Bell Push Switch With Indicator", 2, 10, 90, R.drawable.glisten_3708);
        insertIntoGlisten("G 3733", "32A DP Switch with Indicator", 2, 10, 245, R.drawable.glisten_3733);
        insertIntoGlisten("G 3710", "6A Multi Socket with Shutter", 2, 10, 84, R.drawable.glisten_3710);
        insertIntoGlisten("G 3711", "6A & 16A Multi Socket with Shutter", 2, 10, 124, R.drawable.glisten_3711);
        insertIntoGlisten("G 3767", "6A - 13A Universal Socket", 2, 10, 147, R.drawable.glisten_3767);
        insertIntoGlisten("G 3772", "6A Charger Socket with Shutter", 2, 10, 84, R.drawable.glisten_3772);
        insertIntoGlisten("G 3716", "Light Control Dimmer 450W", 1, 10, 205, R.drawable.glisten_3716);
        insertIntoGlisten("G 3717", "Light Control Dimmer 650W", 2, 10, 300, R.drawable.glisten_3717);
        insertIntoGlisten("G 3718", "Fan Regulator Hum Free", 1, 10, 310, R.drawable.glisten_3718);
        insertIntoGlisten("G 3719", "Fan Regulator Hum Free", 2, 10, 360, R.drawable.glisten_3719);
        insertIntoGlisten("G 3720", "RJ-45 Modern Jack for Computers", 2, 10, 135, R.drawable.glisten_3720);
        insertIntoGlisten("G 3721", "RJ 45 Jack Avaya Lucents(AT&T) Cat 5", 2, 10, 550, R.drawable.glisten_3721);
        insertIntoGlisten("G 3722/3723", "9/15 Pins Female Computer Connection", 2, 10, 95, R.drawable.glisten_3722_3723);
        insertIntoGlisten("G 3724", "25 Pins Female Computer Connection", 2, 10, 140, R.drawable.glisten_3724);
        insertIntoGlisten("G 3709", "6A Two Pin Socket", 1, 10, 50, R.drawable.glisten_3709);
        insertIntoGlisten("G 3713", "TV Co-Axial Socket", 1, 10, 60, R.drawable.glisten_3713);
        insertIntoGlisten("G 3714", "RJ 11 T.P Jack 2 Line With Shutter", 1, 10, 70, R.drawable.glisten_3714);
        insertIntoGlisten("G 3756", "6A Combined 3 in 1", 1, 10, 116, R.drawable.glisten_3756);
        insertIntoGlisten("G 3712", "Indicator Lamp", 1, 10, 45, R.drawable.glisten_3712);
        insertIntoGlisten("G 3757", "Night lamp", 1, 10, 195, R.drawable.glisten_3757);
        insertIntoGlisten("G 3728", "Dummy Plate", 1, 20, 16, R.drawable.glisten_3728);
        insertIntoGlisten("G 3729", "Dummy Plate", 2, 20, 25, R.drawable.glisten_3729);
        insertIntoGlisten("G 3737", "Shaver Socket 110/220V Only", 2, 10, 250, R.drawable.glisten_3737);
        insertIntoGlisten("G 3715", "RJ 11 TP Jack 4 Line", 1, 10, 80, R.drawable.glisten_3715);
        insertIntoGlisten("G 3725", "Mosquito Repellant", 1, 10, 120, R.drawable.glisten_3725);
        insertIntoGlisten("G 3768", "Night Lamp Blue", 2, 10, 177, R.drawable.glisten_3768);
        insertIntoGlisten("G 3791", "Electronic Parrot Bell", 2, 10, 209, R.drawable.glisten_3791);
        insertIntoGlisten("G 3769", "Foot Light", 4, 1, 397, R.drawable.glisten_3769);
        insertIntoGlisten("G 3768", "16-25 Motor Starter for 2 Ton AC", 2, 10, 340, R.drawable.glisten_3732);
        insertIntoGlisten("G 3735", "32A DP Energy Saver key tag", 2, 10, 340, R.drawable.glisten_3734_3735);
        insertIntoGlisten("G 3736", "Key Tag", 1, 10, 45, R.drawable.glisten_3736);
        insertIntoGlisten("G 3738", "One Switch Do not Disturb\nOne Switch Make My Room\nOne DND/MMR Indicator", 1, 1, 350, R.drawable.glisten_3738a);
        insertIntoGlisten("G 3738", "One Switch Do not Disturb\nOne Switch Make My Room\nOne DND/MMR Indicator", 1, 1, 350, R.drawable.glisten_3738b);
        insertIntoGlisten("G 3770", "6A One Way Switch Costa", 1, 10, 35, R.drawable.glisten_3770);
        insertIntoGlisten("G 3771", "6A. 5 Pin Socket Costa", 2, 10, 58, R.drawable.glisten_3771);
    }

    public void initDatabaseGlam(){

        insertIntoGlam("G 5763", "10 A One Way Switch", 1, 10, 60, R.drawable.glam_5763);
        insertIntoGlam("G 5702", "6 A Two Way Switch", 1, 10, 74, R.drawable.glam_5702);
        insertIntoGlam("G 5703", "6 Bell Push Switch", 1, 10, 70, R.drawable.glam_5703);
        insertIntoGlam("G 5704", "20 A One Way Switch", 1, 10, 86, R.drawable.glam_5704);
        insertIntoGlam("G 5705", "20 Two One Way Switch", 1, 10, 101, R.drawable.glam_5705);
        insertIntoGlam("G 5764", "10 A One Way Switch with indicator", 1, 10, 75, R.drawable.glam_5764);
        insertIntoGlam("G 5759", "6A Bell push switch with indicator", 1, 10, 86, R.drawable.glam_5759);
        insertIntoGlam("G 5760", "20A One way switch with indicator", 1, 10, 104, R.drawable.glam_5760);
        insertIntoGlam("G 5706", "20A switch with indicator", 2, 10, 126, R.drawable.glam_5706);
        insertIntoGlam("G 5707", "20A. Two Way Switch", 2, 10, 138, R.drawable.glam_5707);
        insertIntoGlam("G 5708", "6A. Bell Push With Indicator", 2, 10, 108, R.drawable.glam_5708);
        insertIntoGlam("G 5709", "6A. Two Pin Socket", 1, 10, 60, R.drawable.glam_5709);
        insertIntoGlam("G 5710", "6A. Multi Socket With Shutter", 2, 10, 98, R.drawable.glam_5710);
        insertIntoGlam("G 5711", "6A. Combined 3 in 1", 2, 10, 139, R.drawable.glam_5711);
        insertIntoGlam("G 5713", "T.V. Co-Axial Socket", 1, 10, 72, R.drawable.glam_5713);
        insertIntoGlam("G 5714", "RJ-11 T.P. Jack 2 Line", 1, 10, 84, R.drawable.glam_5714);
        insertIntoGlam("G 5715", "RJ-11 T.P. Jack 4 Line", 1, 10, 96, R.drawable.glam_5715);
        insertIntoGlam("G 5720", "RJ-45 Modem Jack For Computers", 2, 10, 162, R.drawable.glam_5720);
        insertIntoGlam("G 5721", "RJ-45 Jack Avaya Lucents (AT&T) Cat 5", 1, 10, 660, R.drawable.glam_5721);
        insertIntoGlam("G 5717", "Light Control Dimmer 650W", 2, 10, 315, R.drawable.glam_5717);
        insertIntoGlam("G 5716", "Light Control Dimmer 450W", 1, 10, 215, R.drawable.glam_5716);
        insertIntoGlam("G 5718", "Fan Regulator Hum Free Switch. Type", 1, 10, 315, R.drawable.glam_5718);
        insertIntoGlam("G 5719", "Fan Regulator Hum Free Socket. Type", 2, 10, 375, R.drawable.glam_5719);
        //insertIntoGlam("G 5713", "Light Control Dimmer 650W", 2, 10, 114, R.drawable.glam_5722);
        insertIntoGlam("G 5722", "9 Pin/15 Pin Female Computer Connection", 2, 10, 114, R.drawable.glam_5722);
        insertIntoGlam("G 5723", "9 Pin/15 Pin Female Computer Connection", 2, 10, 132, R.drawable.glam_5722);
        insertIntoGlam("G 5724", "25 Pin Female Computer Connection", 2, 10, 168, R.drawable.glam_5724);
        insertIntoGlam("G 5725", "Mosquito Repellant (use with mat)", 1, 10, 144, R.drawable.glam_5725);
        insertIntoGlam("G 5726", "Electronic Buzzer", 2, 10, 114, R.drawable.glam_5726);
        insertIntoGlam("G 5727", "Night Lamp - 2 MOD", 2, 10, 270, R.drawable.glam_5727);
        insertIntoGlam("G 5757", "Night Lamp - 1 MOD", 1, 10, 234, R.drawable.glam_5757);
        insertIntoGlam("G 5728", "Dummy Plate (One Module)", 1, 20, 19, R.drawable.glam_5728);
        insertIntoGlam("G 5729", "Dummy Plate (Two Module)", 2, 20, 30, R.drawable.glam_5729);
        insertIntoGlam("G 5732", "16-25A. Motor Starter", 2, 10, 408, R.drawable.glam_5732);
        insertIntoGlam("G 5733", "32A. D.P. Switch With Indicator", 2, 10, 174, R.drawable.glam_5733);
        insertIntoGlam("G 5735", "32A. D.P. Energy Saver Key Tag", 2, 10, 408, R.drawable.glam_5735);
        insertIntoGlam("G 5736", "Key Tag", 0, 10, 54, R.drawable.glam_5736);
        insertIntoGlam("G 5737", "Shaver Socket 110V/220V AC.", 2, 10, 300, R.drawable.glam_5737);
        insertIntoGlam("G 5738", "Set of Three Switches (Do Not Disturb)", 1, 1, 420, R.drawable.glam_5738);
        insertIntoGlam("G 5712", "Indicator lamp", 1, 10, 54, R.drawable.glam_5712);
        insertIntoGlam("G 5738", "Make My Room and Indication", 1, 1, 420, R.drawable.glam_5738);

    }

    public void initDatabaseVox(){

        insertIntoVox("8701", "6A One Way Switch", 1, 10, 60, R.drawable.vox_8701);
        insertIntoVox("8702", "6A Two Way Switch", 1, 10, 81, R.drawable.vox_8702);
        insertIntoVox("8703", "6A Bell Push Switch", 1, 10, 76, R.drawable.vox_8703);
        insertIntoVox("8704", "16A One Way Switch", 1, 10, 95, R.drawable.vox_8704);
        insertIntoVox("8705", "16A Two Way Switch", 1, 10, 110, R.drawable.vox_8705);
        insertIntoVox("8758", "6A One Way Switch with Indicator", 1, 10, 80, R.drawable.vox_8758);

        insertIntoVox("8759", "6A. Bell Push Switch With Indicator", 1, 10, 80, R.drawable.vox_8759);
        insertIntoVox("8760", "16A. One Way Switch With Indicator", 1, 10, 80, R.drawable.vox_8760);
        insertIntoVox("8706", "16A. Switch With Indicator", 2, 10, 80, R.drawable.vox_8706);
        insertIntoVox("8707", "16A. Two Way Switch", 2, 10, 80, R.drawable.vox_8707);

        insertIntoVox("8708", "6A. Bell Push Switch With Indicator", 2, 10, 80, R.drawable.vox_8708);
        insertIntoVox("8733", "32A. D.P. Switch With Indicator", 2, 10, 80, R.drawable.vox_8733);
        insertIntoVox("8710", "6A. Multi Socket With Shutter", 2, 10, 80, R.drawable.vox_8710);
        insertIntoVox("8711", "6A. & 16A. Multi Socket With Shutter", 2, 10, 80, R.drawable.vox_8711);

        insertIntoVox("8771", "5 Pin Socket C2C5 Pin Socket C2C", 2, 10, 80, R.drawable.vox_8771);
        insertIntoVox("8709", "6A. Two Pin Socket", 1, 10, 80, R.drawable.vox_8709);
        insertIntoVox("8716", "Light Control Dimmer 450W", 2, 10, 80, R.drawable.vox_8716);
        insertIntoVox("8717", "Light Control Dimmer 650W", 2, 10, 80, R.drawable.vox_8717);

        insertIntoVox("8718", "Fan Regulator Hum Free", 1, 10, 80, R.drawable.vox_8718);
        insertIntoVox("8719", "Fan Regulator Hum Free", 2, 10, 80, R.drawable.vox_8719);
        insertIntoVox("8787", "USB Charger 1 Amp. 5 Volt", 1, 10, 80, R.drawable.vox_8787);
        insertIntoVox("8788", "USB Charger 2 Amp. 5 Volt", 2, 10, 80, R.drawable.vox_8788);


        insertIntoVox("6A to 32A", "Tiny Trip MCB Single Pole", 1, 10, 80, R.drawable.vox_6a_32a_1);
        insertIntoVox("6A to 32A", "Tiny Trip MCB Single Pole", 2, 10, 80, R.drawable.vox_6a_32a);
        insertIntoVox("8712", "Indicator Lamp", 1, 10, 80, R.drawable.vox_8712);
        insertIntoVox("8713", " T.V. Co-Axial Socket", 1, 10, 80, R.drawable.vox_8713);
        insertIntoVox("8714", "RJ-11 T.P. Jack 2 \nLine With Shutter", 1, 10, 80, R.drawable.vox_8714);
        insertIntoVox("8728", "Dummy Plate", 1, 20, 80, R.drawable.vox_8728);

        insertIntoVox("8726", "Electronic buzzer", 1, 10, 80, R.drawable.vox_8726);
        insertIntoVox("8727", "LED Night Lamp 3 Watt.", 2, 10, 80, R.drawable.vox_8727);
        insertIntoVox("8732", "25A. Motor Starter \nFor 2.0 TON A.C", 2, 10, 80, R.drawable.vox_8732);
        insertIntoVox("8791", "Electronic Parrot Bell", 2, 10, 80, R.drawable.vox_8791);
        insertIntoVox("8735", "32A. D.P. Energy Saver Key Tag", 2, 10, 80, R.drawable.vox_8735);

        insertIntoVox("8737", "Shaver Socket 110/220V AC. Only", 2, 10, 80, R.drawable.vox_8737);
        insertIntoVox("8785", "32A. Electronic Key Tag", 2, 10, 80, R.drawable.vox_8785);
        insertIntoVox("8789", " Triple RCA Socket (Audio & Video)", 1, 10, 80, R.drawable.vox_8789);
        insertIntoVox("8769", "LED Foot Light", 3, 1, 80, R.drawable.vox_8769);
        insertIntoVox("8738", "Set of Three Switch (DND) (MMR)", 2, 3, 80, R.drawable.vox_8738);

        insertIntoVox("8786", "Indoor Call Bell Switch", 1, 10, 80, R.drawable.vox_8786);
        insertIntoVox("8790", "Indoor Bell Push Switch (Push Type)", 3, 1, 80, R.drawable.vox_8790);

    }

    public void initDatabaseVoxTouch(){

        insertIntoVOXTouch("VOX Touch 1", "---", 0, 0, 0, R.drawable.vox_touch1);
        insertIntoVOXTouch("VOX Touch 2", "---", 0, 0, 0, R.drawable.vox_touch2);
        insertIntoVOXTouch("VOX Touch 3", "---", 0, 0, 0, R.drawable.vox_touch3);
        insertIntoVOXTouch("VOX Touch 4", "---", 0, 0, 0, R.drawable.vox_touch4);
    }

    public void initDatabaseLampHolder(){

        insertIntoLampHolder("147", "Batten Holder", 20,   18.50f , R.drawable.lamp_holder_147);
        insertIntoLampHolder("148", "Angle Holder", 20,   18.50f , R.drawable.lamp_holder_148);
        insertIntoLampHolder("149", "Batten Holder", 20,   18.50f , R.drawable.lamp_holder_149);
        insertIntoLampHolder("150", "Angle Holder", 20,   18.50f , R.drawable.lamp_holder_150);
        insertIntoLampHolder("759", "Glam Grand Batten Holder", 10,59.40f , R.drawable.lamp_holder_759);
        insertIntoLampHolder("475", "Batten Holder", 10,   45.70f , R.drawable.lamp_holder_475);
        insertIntoLampHolder("476", "Angle Holder Glam", 10,   45.70f , R.drawable.lamp_holder_476);
        insertIntoLampHolder("701", "Batten Holder", 20,   24.50f , R.drawable.lamp_holder_701);
        insertIntoLampHolder("703", "Batten Holder Jumbo", 20,   28.50f , R.drawable.lamp_holder_703);
        insertIntoLampHolder("151", "Batten Holder Jumbo", 20,   21.55f , R.drawable.lamp_holder_151);
        insertIntoLampHolder("152", "Batten Holder Jumbo", 20,   21.55f , R.drawable.lamp_holder_152);
        insertIntoLampHolder("153", "Mini Batten Holder", 20,   18.50f , R.drawable.lamp_holder_153);
        insertIntoLampHolder("448", "Mini Batten Holder", 20,   18.50f , R.drawable.lamp_holder_448);
        insertIntoLampHolder("154", "Pendent Holder", 15,   15.80f , R.drawable.lamp_holder_154);
        insertIntoLampHolder("156", "Pendent Holder SPL.", 15,15.80f , R.drawable.lamp_holder_156);
        insertIntoLampHolder("158", "Pendent Adaptor", 15, 16.30f , R.drawable.lamp_holder_158);
        insertIntoLampHolder("159", "Pendent Adaptor", 15, 16.30f , R.drawable.lamp_holder_159);
        insertIntoLampHolder("160", "Parallel Adaptor", 15,16.30f , R.drawable.lamp_holder_160);
        insertIntoLampHolder("161", "Two Pin Adaptor", 15, 17.40f , R.drawable.lamp_holder_161);
        insertIntoLampHolder("162", "Single Adaptor", 15, 11.95f , R.drawable.lamp_holder_162);

    }

    public void initDatabaseCelingRose(){

        insertIntoCeilingRose("163", "Ceiling Rose", 20, 18.50f, R.drawable.ceiling_rose_163);
        insertIntoCeilingRose("167", "Ceiling Rose Jumbo", 20, 18.50f, R.drawable.ceiling_rose_167);
        insertIntoCeilingRose("168", "Ceiling Rose Jumbo", 20, 18.50f, R.drawable.ceiling_rose_168);
    }

    public void initDatabasePlugTop(){

        insertIntoPlugTop("761", "6A. Three Pin Top", 20,32.50f , R.drawable.plug_top_761);
        insertIntoPlugTop("762", "16A. Three Pin Top", 10,55.50f , R.drawable.plug_top_762);
        insertIntoPlugTop("169", "6A. Three Pin Top", 20,   26.60f , R.drawable.plug_top_169);
        insertIntoPlugTop("170", "16A. Three Pin Top", 10,   46.70f , R.drawable.plug_top_170);
        insertIntoPlugTop("366", "6A. Three Pin Top", 20,   26.60f , R.drawable.plug_top_366);
        insertIntoPlugTop("367", "16A. Three Pin Top", 10,   46.70f , R.drawable.plug_top_367);
        insertIntoPlugTop("477", "6A. 3Pin Top with Indicator", 20,   29.90f , R.drawable.plug_top_477);
        insertIntoPlugTop("478", "16A. 3Pin Top with Indicator", 10,   50.90f , R.drawable.plug_top_478);
        insertIntoPlugTop("173", "6A Three Pin Top", 20,   27.75f , R.drawable.plug_top_173);
        insertIntoPlugTop("174", "16A. Three Pin Top", 10,   48.95f , R.drawable.plug_top_174);
        insertIntoPlugTop("175", "6A. Three Pin Top Unbreakable", 20,   23.90f , R.drawable.plug_top_175);
        insertIntoPlugTop("176", "16A. Three Pin Top Unbreakable", 10,   41.30f , R.drawable.plug_top_176);
        insertIntoPlugTop("465", "6A. Three Pin Top Poly Car Bonate", 20,   38.50f , R.drawable.plug_top_465);
        insertIntoPlugTop("466", "16A. Three Pin Top Poly Carbonate", 10,   59.10f , R.drawable.plug_top_466);
        insertIntoPlugTop("485", "6A. Three Pin Top PC", 20,   31.30f , R.drawable.plug_top_485);
        insertIntoPlugTop("486", "16A. Three Pin Top PC", 10,52.50f , R.drawable.plug_top_486);
        insertIntoPlugTop("179", "Two Pin Top", 30,   08.20f , R.drawable.plug_top_179);
        insertIntoPlugTop("180", "Two Pin Top", 30,   08.20f , R.drawable.plug_top_180);
        insertIntoPlugTop("181", "Two Pin Top", 30,   08.20f , R.drawable.plug_top_181);
        insertIntoPlugTop("189", "Two Pin Top 3 Parts Unbreakable", 20,   11.95f , R.drawable.plug_top_189);
        insertIntoPlugTop("469", "Two Pin Top 3 Parts Unbreakable", 20,   11.95f , R.drawable.plug_top_469);
        insertIntoPlugTop("190", "Male Female", 30,   16.30f , R.drawable.plug_top_190);
        insertIntoPlugTop("191", "Male Female", 30,   16.30f , R.drawable.plug_top_191);
        insertIntoPlugTop("192", "Male Female", 30,   16.30f , R.drawable.plug_top_192);
        insertIntoPlugTop("200", "Male Female 3 Parts Unbreakable", 20,   21.75f , R.drawable.plug_top_200);
        insertIntoPlugTop("470", "Male Female 3 Parts Unbreakable", 20,   21.75f , R.drawable.plug_top_470);
    }

    public void initDatabaseBedSwitch(){

        insertIntoBedSwitch("201", "Bed Switch", 20,10.85f , R.drawable.bed_switch_201);
        insertIntoBedSwitch("202", "Bed Bell Switch", 20,11.40f , R.drawable.bed_switch_202);
        insertIntoBedSwitch("203", "Bed Switch", 20,10.85f , R.drawable.bed_switch_203);
        insertIntoBedSwitch("204", "Bed Bell Switch", 20,11.40f , R.drawable.bed_switch_204);
        insertIntoBedSwitch("205", "Bed Switch", 20,10.85f , R.drawable.bed_switch_205);
        insertIntoBedSwitch("206", "Bed Bell Switch", 20,11.40f , R.drawable.bed_switch_206);
        insertIntoBedSwitch("207", "Bed Switch Round/Cord Through", 20,13.10f , R.drawable.bed_switch_207);
        insertIntoBedSwitch("208", "Bed Bell Switch Round", 20,13.60f , R.drawable.bed_switch_208);
        insertIntoBedSwitch("281", "Two Way Bed Switch Round", 20,15.20f , R.drawable.bed_switch_281);
        insertIntoBedSwitch("209", "Bed Switch", 10,15.20f , R.drawable.bed_switch_209);
        insertIntoBedSwitch("213", "Surface On-Off Switch", 15,15.20f , R.drawable.bed_switch_213);
        insertIntoBedSwitch("214", "Surface Bell Push Switch", 15,15.20f , R.drawable.bed_switch_214);
        insertIntoBedSwitch("215", "Surface On-Off Switch", 15,15.20f , R.drawable.bed_switch_215);
        insertIntoBedSwitch("216", "Surface Bell Push Switch", 15,15.20f , R.drawable.bed_switch_216);
        insertIntoBedSwitch("218", "Surface Bell Switch With Indicator", 10,28.30f , R.drawable.bed_switch_218);
        insertIntoBedSwitch("220", "Surface Bell Switch With Indicator", 10,28.30f , R.drawable.bed_switch_220);
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

    public void initDatabaseDistributionBoard(){

        insertIntoDistributionBoard("2823", "4 Ways Db's Single Door", 1,  286.00f , R.drawable.distribution_board_2823);
        insertIntoDistributionBoard("2824", "6 Ways Db's Single Door", 1,  335.00f , R.drawable.distribution_board_2824);
        insertIntoDistributionBoard("2825", "8 Ways Db's Single Door", 1,  388.00f , R.drawable.distribution_board_2825);
        insertIntoDistributionBoard("2826", "10 Ways Db's Single Door", 1,  455.00f , R.drawable.distribution_board_2826);
        insertIntoDistributionBoard("2827", "12 Ways Db's Single Door", 1,  515.00f , R.drawable.distribution_board_2827);
        insertIntoDistributionBoard("2828", "16 Ways Db's Single Door", 1,  634.00f , R.drawable.distribution_board_2828);
        insertIntoDistributionBoard("2829", "4 Ways TPN Db's Single Door", 1,  1113.00f , R.drawable.distribution_board_2829);
        insertIntoDistributionBoard("2830", "6 Ways TPN Db's Single Door", 1,  1364.00f , R.drawable.distribution_board_2830);
        insertIntoDistributionBoard("2831", "8 Ways TPN Db's Single Door", 1,  1616.00f , R.drawable.distribution_board_2831);
        insertIntoDistributionBoard("2845", "4 Ways Db's Double Door", 1,  543.00f , R.drawable.distribution_board_2845);
        insertIntoDistributionBoard("2846", "6 Ways Db's Double Door", 1,  632.00f , R.drawable.distribution_board_2846);
        insertIntoDistributionBoard("2847", "8 Ways Db's Double Door", 1,  731.00f , R.drawable.distribution_board_2847);
        insertIntoDistributionBoard("2848", "10 Ways Db's Double Door", 1,  829.00f , R.drawable.distribution_board_2848);
        insertIntoDistributionBoard("2849", "12 Ways Db's Double Door", 1,  933.00f , R.drawable.distribution_board_2849);
        insertIntoDistributionBoard("2850", "16 Ways Db's Double Door", 1,  1113.00f , R.drawable.distribution_board_2850);
        insertIntoDistributionBoard("2851", "4 Ways TPN Db's Double Door", 1,  1507.00f , R.drawable.distribution_board_2851);
        insertIntoDistributionBoard("2852", "6 Ways TPN Db's Double Door", 1,  1759.00f , R.drawable.distribution_board_2852);
        insertIntoDistributionBoard("2853", "8 Ways TPN Db's Double Door", 1,  2118.00f , R.drawable.distribution_board_2853);
        insertIntoDistributionBoard("2841", "AC Box ", 1,  539.00f , R.drawable.distribution_board_2841);
        insertIntoDistributionBoard("240", "16 AMP. D.P. Main Switch", 1,  287.00f , R.drawable.distribution_board_240);
        insertIntoDistributionBoard("2842", "16 AMP. D.P. Change Over", 1,  527.00f , R.drawable.distribution_board_2842);
        insertIntoDistributionBoard("241", "32 AMP. D.P. Main Switch", 1,  683.00f , R.drawable.distribution_board_241);
        insertIntoDistributionBoard("2843", "32 AMP. D.P. Change Over", 1,  814.00f , R.drawable.distribution_board_2843);
        insertIntoDistributionBoard("2820", "PVC Single Pole/Double Pole Db's Unbreakable ", 10,   35.00f , R.drawable.distribution_board_2820);
        insertIntoDistributionBoard("2844", "PVC Three Pole/Four Pole Db's Unbreakable ", 06,  77.00f , R.drawable.distribution_board_2844);

    }

    public void initDatabaseWisdom(){

        insertIntoWisdom("501", "One Way Switch", 20, 25.15f , R.drawable.wisdom_501);
        insertIntoWisdom("502", "Two Way Switch", 20, 29.20f , R.drawable.wisdom_502);
        insertIntoWisdom("503", "Bell Push Switch", 20, 28.00f , R.drawable.wisdom_503);
        insertIntoWisdom("504", "Two Pin Socket", 20, 25.60f , R.drawable.wisdom_504);
        insertIntoWisdom("505", "Indicator", 20, 30.45f , R.drawable.wisdom_505);
        insertIntoWisdom("506", "Five Pin Socket", 10, 38.60f , R.drawable.wisdom_506);
        insertIntoWisdom("507", "10A. Fuse", 10, 40.20f , R.drawable.wisdom_507);
        insertIntoWisdom("508", "T.V. Socket", 20, 41.40f , R.drawable.wisdom_508);
        insertIntoWisdom("509", "Telephone Socket", 10, 54.80f , R.drawable.wisdom_509);
        insertIntoWisdom("510", "Telephone Jack Socket Switch Type", 20, 60.90f , R.drawable.wisdom_510);
        insertIntoWisdom("511", "Light Control Dimmer 400W. Switch Type", 10,  69.60f , R.drawable.wisdom_511);
        insertIntoWisdom("512", "Light Control Dimmer 400W. Socket Type", 10,  81.30f , R.drawable.wisdom_512);
        insertIntoWisdom("514", "Hum Free Step Fan Regulator Switch Type", 10,  26.90f , R.drawable.wisdom_514);
        insertIntoWisdom("513", "Hum Free Step Fan Regulator Socket Type", 10,  62.10f , R.drawable.wisdom_513);
        insertIntoWisdom("515", "16A. Switch", 10, 84.40f , R.drawable.wisdom_515);
        insertIntoWisdom("516", "6A. ", 10, 84.40f , R.drawable.wisdom_516);
        insertIntoWisdom("517", "16A. Combined With Safety Shutter", 5,  62.50f , R.drawable.wisdom_517);
        insertIntoWisdom("520", "16A. Combined With Box", 5,  92.40f , R.drawable.wisdom_520);
        insertIntoWisdom("518", "16A. Two Way Switch", 10, 92.55f , R.drawable.wisdom_518);
        insertIntoWisdom("548", "16A Switch Decorative Frames Trendy White", 50, 16.40f , R.drawable.wisdom_548);
        insertIntoWisdom("549", "Switch Decorative Frames Sweet Grey", 50, 16.40f , R.drawable.wisdom_549);
        insertIntoWisdom("550", "Switch Decorative Frames Dream Ivory", 50, 16.40f , R.drawable.wisdom_550);
        insertIntoWisdom("551", "Switch Decorative Frames Silver Ice", 50, 18.80f , R.drawable.wisdom_551);
        insertIntoWisdom("552", "16A Switch Decorative Frames Dual Chocolate", 50, 18.80f , R.drawable.wisdom_552);
        insertIntoWisdom("553", "Switch Decorative Frames Green Moss", 50, 18.80f , R.drawable.wisdom_553);
        insertIntoWisdom("554", "Switch Decorative Frames Sunny Copper", 50, 18.80f , R.drawable.wisdom_554);
        insertIntoWisdom("555", "Switch Decorative Frames Purple Silk", 50, 18.80f , R.drawable.wisdom_555);
        insertIntoWisdom("556", "Switch Decorative Frames Royal Blue", 50, 18.80f , R.drawable.wisdom_556);
        insertIntoWisdom("557", "Switch Decorative Frames Fine Marble", 50, 22.30f , R.drawable.wisdom_557);
        insertIntoWisdom("558", "Switch Decorative Frames Check Mate", 50, 22.30f , R.drawable.wisdom_558);
        insertIntoWisdom("559", "Switch Decorative Frames Teak Wood", 50, 22.30f , R.drawable.wisdom_559);
        insertIntoWisdom("560", "Switch Decorative Frames Deep Wood", 50, 22.30f , R.drawable.wisdom_560);
        insertIntoWisdom("561", "Combined Decorative Frames Trendy White", 25, 25.90f , R.drawable.wisdom_561);
        insertIntoWisdom("562", "Combined Decorative Frames Sweet Grey", 25, 25.90f , R.drawable.wisdom_562);
        insertIntoWisdom("563", "Combined Decorative Frames Dream Ivory", 25, 25.90f , R.drawable.wisdom_563);
        insertIntoWisdom("564", "Combined Decorative Frames Silver Ice", 25, 29.30f , R.drawable.wisdom_564);
        insertIntoWisdom("565", "Combined Decorative Frames Dual Chocolate", 25, 29.30f , R.drawable.wisdom_565);
        insertIntoWisdom("566", "Combined Decorative Frames Green Moss", 25, 29.30f , R.drawable.wisdom_566);
        insertIntoWisdom("567", "Combined Decorative Frames Sunny Chopper", 25, 29.30f , R.drawable.wisdom_567);
        insertIntoWisdom("568", "Combined Decorative Frames Purple Silk", 25, 29.30f , R.drawable.wisdom_568);
        insertIntoWisdom("569", "Combined Decorative Frames Royal Blue", 25, 29.30f , R.drawable.wisdom_569);
        insertIntoWisdom("570", "Combined Decorative Frames Fine Marble", 25, 32.90f , R.drawable.wisdom_570);
        insertIntoWisdom("571", "Combined Decorative Frames Check Mate", 25, 32.90f , R.drawable.wisdom_571);
        insertIntoWisdom("572", "Combined Decorative Frames Teak Wood", 25, 32.90f , R.drawable.wisdom_572);
        insertIntoWisdom("573", "Combined Decorative Frames Deep Wood", 25, 32.90f , R.drawable.wisdom_573);

        insertIntoWisdom("522", "Switch Decorative Frames Trendy White", 150, 4.7f , R.drawable.wisdom_522);
        insertIntoWisdom("523", "Switch Decorative Frames Sweet Grey", 150, 4.7f , R.drawable.wisdom_523);
        insertIntoWisdom("524", "Switch Decorative Frames Dream Ivory", 150, 4.7f , R.drawable.wisdom_524);
        insertIntoWisdom("525", "Switch Decorative Frames Silver Ice.", 150, 4.7f , R.drawable.wisdom_525);
        insertIntoWisdom("526", "Switch Decorative Frames Dual Chocolate", 150, 5.9f , R.drawable.wisdom_526);
        insertIntoWisdom("527", "Switch Decorative Frames Green Moss", 150, 5.9f , R.drawable.wisdom_527);
        insertIntoWisdom("528", "Switch Decorative Frames Sunny Copper", 150, 5.9f , R.drawable.wisdom_528);
        insertIntoWisdom("529", "Switch Decorative Frames Purple Silk", 150, 5.9f , R.drawable.wisdom_529);
        insertIntoWisdom("530", "Switch Decorative Frames Royal Blue", 150, 5.9f , R.drawable.wisdom_530);
        insertIntoWisdom("531", "Switch Decorative Frames Fine Marble", 150, 7.0f , R.drawable.wisdom_531);
        insertIntoWisdom("532", "Switch Decorative Frames Check Mate", 150, 7.0f , R.drawable.wisdom_532);
        insertIntoWisdom("533", "Switch Decorative Frames Teak Wood", 150, 7.0f , R.drawable.wisdom_533);
        insertIntoWisdom("534", "Switch Decorative Frames Deep Wood", 150, 7.0f , R.drawable.wisdom_534);
        insertIntoWisdom("535", "Socket Decorative Frames Trendy White", 100, 7.0f , R.drawable.wisdom_535);
        insertIntoWisdom("536", "Socket Decorative Frames Sweet Grey", 100, 7.0f , R.drawable.wisdom_536);
        insertIntoWisdom("537", "Socket Decorative Frames Dream Ivory", 100, 7.0f , R.drawable.wisdom_537);
        insertIntoWisdom("538", "Socket Decorative Frames Silver Ice", 100, 8.2f , R.drawable.wisdom_538);
        insertIntoWisdom("539", "Socket Decorative Frames Dual Chocolate", 100, 8.2f , R.drawable.wisdom_539);
        insertIntoWisdom("540", "Socket Decorative Frames Green Moss", 100, 8.2f , R.drawable.wisdom_540);
        insertIntoWisdom("541", "Socket Decorative Frames Sunny Copper", 100, 8.2f , R.drawable.wisdom_541);
        insertIntoWisdom("542", "Socket Decorative Frames Purple Silk", 100, 8.2f , R.drawable.wisdom_542);
        insertIntoWisdom("543", "Socket Decorative Frames Royal Blue", 100, 8.2f , R.drawable.wisdom_543);
        insertIntoWisdom("544", "Socket Decorative Frames Fine Marble", 100, 9.4f , R.drawable.wisdom_544);
        insertIntoWisdom("545", "Socket Decorative Frames Check Mate", 100, 9.4f , R.drawable.wisdom_545);
        insertIntoWisdom("546", "Socket Decorative Frames Teak Wood", 100, 9.4f , R.drawable.wisdom_546);
        insertIntoWisdom("547", "Socket Decorative Frames Deep Wood", 100, 9.4f , R.drawable.wisdom_547);


    }

    public void initDatabaseMiniGold(){

        insertIntoMiniGold("070", "One Way Switch", 20, 15.40f , R.drawable.minigold_070);
        insertIntoMiniGold("071", "Two Way Switch", 20, 18.00f , R.drawable.minigold_071);
        insertIntoMiniGold("072", "Bell Push Switch", 20, 16.00f , R.drawable.minigold_072);
        insertIntoMiniGold("075", "One Way Switch", 20, 15.40f , R.drawable.minigold_075);
        insertIntoMiniGold("076", "Two Way Switch", 20, 18.00f , R.drawable.minigold_076);
        insertIntoMiniGold("077", "Bell Push Switch", 20, 16.00f , R.drawable.minigold_077);
        insertIntoMiniGold("079", "One Way Switch", 20, 15.40f , R.drawable.minigold_079);
        insertIntoMiniGold("080", "Two Way Switch", 20, 18.00f , R.drawable.minigold_080);
        insertIntoMiniGold("081", "Bell Push Switch", 20, 16.00f , R.drawable.minigold_081);
        insertIntoMiniGold("082", "One Way Switch", 20, 16.60f , R.drawable.minigold_082);
        insertIntoMiniGold("083", "Two Way Switch", 20, 19.30f , R.drawable.minigold_083);
        insertIntoMiniGold("084", "Bell Push Switch", 20, 17.50f , R.drawable.minigold_084);
        insertIntoMiniGold("073", "Two Pin Socket", 20, 13.80f , R.drawable.minigold_073);
        insertIntoMiniGold("074", "Indicator", 20, 17.95f , R.drawable.minigold_074);
        insertIntoMiniGold("078", "Indicator", 20, 17.95f , R.drawable.minigold_078);
        insertIntoMiniGold("091", "Five Pin Socket", 10, 27.55f , R.drawable.minigold_091);
        insertIntoMiniGold("096", "10A. Fuse", 10, 27.55f , R.drawable.minigold_096);
        insertIntoMiniGold("100", "T.V. Socket", 20, 19.30f , R.drawable.minigold_100);
        insertIntoMiniGold("106", "T.P. Jack Socket Switch Type", 20, 49.50f , R.drawable.minigold_106);
        insertIntoMiniGold("113", "Dimmer 400W. Switch Type", 10,  13.10f , R.drawable.minigold_113);
        insertIntoMiniGold("117", "Dimmer Socket Type 400W. ", 10,  32.30f , R.drawable.minigold_117);
        insertIntoMiniGold("282", "Switch Step Type Regulator", 10,  79.10f , R.drawable.minigold_282);
        insertIntoMiniGold("120", "Socket Step Type Regulator", 10,  33.00f , R.drawable.minigold_120);
        insertIntoMiniGold("138", "16 AMP. Socket", 10, 55.10f , R.drawable.minigold_138);
        insertIntoMiniGold("121", "16 AMP. Switch Mini", 10, 52.20f , R.drawable.minigold_121);
        insertIntoMiniGold("125", "16 AMP. Two Way Switch Mini", 10, 64.35f , R.drawable.minigold_125);
        insertIntoMiniGold("141", "16 AMP. Combined", 5,  10.00f , R.drawable.minigold_141);
        insertIntoMiniGold("142", "16 AMP. Combined With Box", 5,  42.20f , R.drawable.minigold_142);
        insertIntoMiniGold("145", "16 AMP. Five In One", 05,   167.45f , R.drawable.minigold_145);
        insertIntoMiniGold("146", "16 AMP. Five In One With Box", 5,  02.30f , R.drawable.minigold_146);
        insertIntoMiniGold("114", "Dimmer 600W.", 10,  62.90f , R.drawable.minigold_114);
        insertIntoMiniGold("374", "Dimmer 1000W.", 6,  52.60f , R.drawable.minigold_374);
        insertIntoMiniGold("377", "6A. Combined", 5, 37.50f , R.drawable.minigold_377);
        insertIntoMiniGold("377 A", "6A. Combined With Box", 5, 56.50f , R.drawable.minigold_377);

    }

    public void initDatabaseVijeta(){

        insertIntoVijeta("034", "One Way Switch", 20, 24.40f , R.drawable.vijeta_034);
        insertIntoVijeta("035", "Two Way Switch", 20, 28.10f , R.drawable.vijeta_035);
        insertIntoVijeta("036", "Bell Push Switch", 20, 24.80f , R.drawable.vijeta_036);
        insertIntoVijeta("039", "One Way Switch", 20, 16.60f , R.drawable.vijeta_039);
        insertIntoVijeta("040", "Two Way Switch", 20, 19.30f , R.drawable.vijeta_040);
        insertIntoVijeta("041", "Bell Push Switch", 20, 17.50f , R.drawable.vijeta_041);
        insertIntoVijeta("043", "One Way Switch", 20, 17.75f , R.drawable.vijeta_043);
        insertIntoVijeta("044", "Two Way Switch", 20, 20.10f , R.drawable.vijeta_044);
        insertIntoVijeta("045", "Bell Push Switch", 20, 18.80f , R.drawable.vijeta_045);
        insertIntoVijeta("042", "Indicator Select", 20, 18.80f , R.drawable.vijeta_042);
        insertIntoVijeta("037", "Two Pin Socket", 20, 13.80f , R.drawable.vijeta_037);
        insertIntoVijeta("093", "Five Pin Socket", 10, 28.70f , R.drawable.vijeta_093);
        insertIntoVijeta("095", "10 AMP FUSE", 10, 27.55f , R.drawable.vijeta_095);
        insertIntoVijeta("097", "16 AMP FUSE", 10, 38.75f , R.drawable.vijeta_097);
        insertIntoVijeta("099", "T.V.SOCKET", 20, 19.30f , R.drawable.vijeta_099);
        insertIntoVijeta("105", "T.P. Jack Socket Switch Type", 20, 49.50f , R.drawable.vijeta_105);
        insertIntoVijeta("112", "Light Control Dimmer 400W. Switch Type", 10,  13.10f , R.drawable.vijeta_112);
        insertIntoVijeta("116", "Light Control Dimmer 400W. Socket Type", 10,  32.30f , R.drawable.vijeta_116);
        insertIntoVijeta("283", "Hum Free Step Fan Regulator Switch Type", 10,  79.10f , R.drawable.vijeta_283);
        insertIntoVijeta("119", "Hum Free Step Fan Regulator Socket Type", 10,  33.00f , R.drawable.vijeta_119);
        insertIntoVijeta("129", "16 AMP. Switch With Indicator", 10, 66.95f , R.drawable.vijeta_129);
        insertIntoVijeta("131", "16 AMP. Two way Switch", 10, 66.95f , R.drawable.vijeta_131);

    }

    public void initDatabaseVictor(){

        insertIntoVictor("046", "One Way Switch", 20, 17.00f , R.drawable.victor_046);
        insertIntoVictor("047", "Two Way Switch", 20, 20.10f , R.drawable.victor_047);
        insertIntoVictor("048", "Bell Push Switch", 20, 18.00f , R.drawable.victor_048);
        insertIntoVictor("051", "One Way Switch", 20,17.00f , R.drawable.victor_051);
        insertIntoVictor("052", "Two Way Switch", 20, 20.10f , R.drawable.victor_052);
        insertIntoVictor("053", "Bell Push Switch", 20, 18.00f , R.drawable.victor_053);
        insertIntoVictor("057", "One Way Switch", 20, 16.60f , R.drawable.victor_057);
        insertIntoVictor("058", "Two Way Switch", 20,19.20f , R.drawable.victor_058);
        insertIntoVictor("059", "Bell Push Switch", 20, 17.00f , R.drawable.victor_059);
        insertIntoVictor("060", "One Way Switch", 20,16.60f , R.drawable.victor_060);
        insertIntoVictor("061", "Two Way Switch", 20, 19.20f , R.drawable.victor_061);
        insertIntoVictor("062", "Bell Push Switch", 20, 17.00f , R.drawable.victor_062);
        insertIntoVictor("063", "One Way Switch", 20, 16.60f , R.drawable.victor_063);
        insertIntoVictor("064", "Two Way Switch", 20, 19.20f , R.drawable.victor_064);
        insertIntoVictor("065", "Bell Push Switch", 20,17.00f , R.drawable.victor_065);
        insertIntoVictor("067", "One Way Switch.", 20, 16.60f , R.drawable.victor_067);
        insertIntoVictor("068", "Two Way Switch", 20, 19.20f , R.drawable.victor_068);
        insertIntoVictor("069", "Bell Push Switch", 20, 17.00f , R.drawable.victor_069);
        insertIntoVictor("049", "Two Pin Socket", 20, 13.80f , R.drawable.victor_049);
        insertIntoVictor("050", "Indicator Victor", 20, 18.15f , R.drawable.victor_050);
        insertIntoVictor("066", "Indicator Surbhi", 20, 18.15f , R.drawable.victor_066);
        insertIntoVictor("087", "Three Pin Socket", 10, 27.55f , R.drawable.victor_087);
        insertIntoVictor("089", "5 Pin Socket Victor", 10, 28.70f , R.drawable.victor_089);
        insertIntoVictor("090", "5 Pin Socket Surbhi", 10, 28.70f , R.drawable.victor_090);
        insertIntoVictor("094", "10A. Fuse", 10, 28.70f , R.drawable.victor_094);
        insertIntoVictor("098", "T.V Socket", 20, 20.10f , R.drawable.victor_098);
        insertIntoVictor("104", "T.P Jack Socket Switch Type ", 20, 49.50f , R.drawable.victor_104);
        insertIntoVictor("111", "Light Control Dimmer 400W Switch Type", 10,  113.10f , R.drawable.victor_111);
        insertIntoVictor("115", "Light Control Dimmer 400W Switch Socket Type", 10, 132.30f , R.drawable.victor_115);
        insertIntoVictor("284", "Hum Free Step Fan Regulator Switch Type", 10, 179.10f , R.drawable.victor_284);
        insertIntoVictor("118", "Hum Free Step Fan Regulator Socket Type", 10,  233.00f , R.drawable.victor_118);
        insertIntoVictor("132", "16 A. Switch Victor", 10, 57.70f , R.drawable.victor_132);
        insertIntoVictor("133", "16A.Switch Surbhi", 10, 57.70f , R.drawable.victor_133);
        insertIntoVictor("134", "16 AMP. Two Way Switch Victor", 10, 69.60f , R.drawable.victor_134);
        insertIntoVictor("135", "16 AMP. Two Way Switch Surbhi", 10, 69.60f , R.drawable.victor_135);
        insertIntoVictor("136", "6 ", 10, 57.70f , R.drawable.victor_136);
        insertIntoVictor("139", "16 AMP. Combined", 5,  115.25f , R.drawable.victor_139);
        insertIntoVictor("140", "16 AMP. Combined With Box", 5, 147.50f , R.drawable.victor_140);
        insertIntoVictor("143", "16AMP. Five In One", 5, 174.00f , R.drawable.victor_143);
        insertIntoVictor("144", "16 AMP. Five In One With Box", 5, 207.50f , R.drawable.victor_144);

    }

    public void initDatabaseGracia(){

        insertIntoGracia("401", "One Way Switch", 20, 19.10f , R.drawable.gracia_401);
        insertIntoGracia("402", "Two Way Switch", 20, 22.25f , R.drawable.gracia_402);
        insertIntoGracia("403", "Bell Push Switch", 20, 20.90f , R.drawable.gracia_403);
        insertIntoGracia("404", "One Way Swicth", 20, 19.10f , R.drawable.gracia_404);
        insertIntoGracia("405", "Two Way Switch", 20, 22.25f , R.drawable.gracia_405);
        insertIntoGracia("406", "Bell Push Switch", 20, 20.90f , R.drawable.gracia_406);
        insertIntoGracia("407", "One Way Swicth", 20, 17.75f , R.drawable.gracia_407);
        insertIntoGracia("408", "Two Way Swicth", 20, 20.95f , R.drawable.gracia_408);
        insertIntoGracia("409", "Bell Push Swicth", 20, 19.45f , R.drawable.gracia_409);
        insertIntoGracia("410", "One Way Swicth", 20, 17.75f , R.drawable.gracia_410);
        insertIntoGracia("411", "Two Way Swicth", 20, 20.95f , R.drawable.gracia_411);
        insertIntoGracia("412", "Bell Push Swicth", 20, 19.45f , R.drawable.gracia_412);
        insertIntoGracia("413", "One Way Swicth", 20, 17.75f , R.drawable.gracia_413);
        insertIntoGracia("414", "Two Way Swicth", 20, 20.95f , R.drawable.gracia_414);
        insertIntoGracia("415", "Bell Push Switch", 20, 19.45f , R.drawable.gracia_415);
        insertIntoGracia("416", "Two Pin Socket", 20, 17.75f , R.drawable.gracia_416);
        insertIntoGracia("417", "Indicator G-47", 20, 22.25f , R.drawable.gracia_417);
        insertIntoGracia("418", "Indicator G-50", 20, 22.25f , R.drawable.gracia_418);
        insertIntoGracia("420", "Five Pin Socket G-47", 10, 30.40f , R.drawable.gracia_420);
        insertIntoGracia("422", "10A. Fuse", 10, 30.40f , R.drawable.gracia_422);
        insertIntoGracia("423", "T.V. Socket", 20, 26.60f , R.drawable.gracia_423);
        insertIntoGracia("425", "T.P. Jack Socket Switch Type", 20, 49.35f , R.drawable.gracia_425);
        insertIntoGracia("426", "Light Control Dimmer 400W Swicth Type", 10, 116.70f , R.drawable.gracia_426);
        insertIntoGracia("427", "Light Control Dimmer 400W Socket Type", 10, 136.50f , R.drawable.gracia_427);
        insertIntoGracia("429", "Hum Free Step Fan Regulator Swicth Type", 10, 179.10f , R.drawable.gracia_429);
        insertIntoGracia("428", "Hum Free Step Fan Regulator Socket Type", 10, 233.00f , R.drawable.gracia_428);
        insertIntoGracia("430", "16A. Switch ", 10, 58.35f , R.drawable.gracia_430);
        insertIntoGracia("431", "6 ", 10, 58.35f , R.drawable.gracia_431);
        insertIntoGracia("433", "16A. Combined", 5, 116.55f , R.drawable.gracia_433);
        insertIntoGracia("435", "16A. Combined With Box", 5, 147.10f , R.drawable.gracia_435);

    }

    public void initDatabaseMusicalBell(){

        insertIntoMusicalBell("262", "Parrot Bell", 12, 130.30f, R.drawable.musical_bell_262);
        insertIntoMusicalBell("722", "Ding Dong", 10, 109.60f, R.drawable.musical_bell_263);
        insertIntoMusicalBell("264", "Fish Bell", 20, 57.20f, R.drawable.musical_bell_264);
        insertIntoMusicalBell("708", "Please open the door", 12, 182.65f, R.drawable.musical_bell_708);
        insertIntoMusicalBell("709", "30 Hindi Songs, Aarti, Aum Namah Shivay, Radhey Radhey, \nSatnam Shri Wahe Guru, Church", 10, 182.65f, R.drawable.musical_bell_709);


    }

    public void initDatabaseConversionPlug(){

        insertIntoConversionPlug("237", "Three Pin Conversion Plug", 10, 49.60f, R.drawable.conversion_plug_237);
        insertIntoConversionPlug("239", "Two Pin Conversion Plug", 10, 16.00f, R.drawable.conversion_plug_239);
    }

    public void initDatabaseGangBox(){

        insertIntoGangBox("393", "One Way Gang Box", 10, 12.00f, R.drawable.gang_box_393);
        insertIntoGangBox("394", "Two Way Gang Box", 10, 18.70f, R.drawable.gang_box_394);
        insertIntoGangBox("395", "Three Way Gang Box", 10, 20.35f, R.drawable.gang_box_394);
        insertIntoGangBox("396", "Four Way Gang Box", 10, 22.35f, R.drawable.gang_box_396);
        insertIntoGangBox("397", "Five Way Gang Box", 10, 23.40f, R.drawable.gang_box_397);
        insertIntoGangBox("398", "Six Way Gang Box", 10, 25.40f, R.drawable.gang_box_398);
        insertIntoGangBox("437", "One Way Power Gang Box", 10, 20.35f, R.drawable.gang_box_437);
        insertIntoGangBox("400", "Two Way Power Gang Box", 10, 29.50f, R.drawable.gang_box_400);
    }

    public void initDatabaseIronConnector(){

        insertIntoIronConnector("234", "Iron Connector", 10, 29.00f, R.drawable.iron_connector_234);
        insertIntoIronConnector("235", "Iron Connector", 10, 33.55f, R.drawable.iron_connector_235);
        insertIntoIronConnector("236", "Iron Connector with indicator", 10, 45.00f, R.drawable.iron_connector_236);

    }

    public void initDatabaseLineTester(){

        insertIntoLineTester("226", "Line Tester", 10, 19.20f, R.drawable.line_tester_226);
        insertIntoLineTester("378", "Line Tester", 10, 18.00f, R.drawable.line_tester_378);
        insertIntoLineTester("456", "Line Tester", 10, 27.40f, R.drawable.line_tester_456);
        insertIntoLineTester("457", "Line Tester", 10, 35.55f, R.drawable.line_tester_457);
    }

    public void initDatabaseInsulationTape(){

        insertIntoInsulationTape("438", "Solid Grip Insulation Tape", 30, 13.40f, R.drawable.insulation_tape_438);
    }

    public void initDatabaseFlexBoardPowerStrip(){

    }

    public void initDatabaseHeatingAndPressElement(){


    }

    public void initDatabaseLED(){

        insertIntoLED("SLIM SIDE-LIT PANEL LIGHT", R.color.side_lit_color, R.drawable.slim_side_lit);
        insertIntoLED("SURFACE LIT PANEL LIGHT", R.color.surface_lit_color, R.drawable.surface_lit);
        insertIntoLED("24x24 SLIM SIDE-LIT PANEL LIGHT", R.color.side_lit_color, R.drawable.side_lit);

    }





}
