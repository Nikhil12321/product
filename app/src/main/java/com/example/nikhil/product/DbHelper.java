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

    public void initDatabaseDistributionBoard(){

        insertIntoDistributionBoard("2823", "4 Ways Db's Single Door", 1, 286f, R.drawable.distribution_board_2823);
        insertIntoDistributionBoard("2824", "6 Ways Db's Single Door", 1, 335f, R.drawable.distribution_board_2824);
        insertIntoDistributionBoard("2825", "8 Ways Db's Single Door", 1, 388f, R.drawable.distribution_board_2825);
        insertIntoDistributionBoard("2826", "10 Ways Db's Single Door", 1, 455f, R.drawable.distribution_board_2826);
        insertIntoDistributionBoard("2827", "12 Ways Db's Single Door", 1, 515f, R.drawable.distribution_board_2827);
        insertIntoDistributionBoard("2828", "16 Ways Db's Single Door", 1, 634f, R.drawable.distribution_board_2828);

    }

    public void initDatabaseWisdom(){

        insertIntoWisdom("501", "One Way Switch", 20, 25.15f, R.drawable.wisdom_501);
        insertIntoWisdom("502", "Two Way Switch", 20, 29.20f, R.drawable.wisdom_502);
        insertIntoWisdom("503", "Bell Push Switch", 20, 28.00f, R.drawable.wisdom_503);
        insertIntoWisdom("504", "Two Pin Socket", 20, 25.60f, R.drawable.wisdom_504);

    }

    public void initDatabaseMiniGold(){

        insertIntoMiniGold("070", "One Way Switch", 20, 15.40f, R.drawable.minigold_070);
        insertIntoMiniGold("071", "Two Way Switch", 20, 18.00f, R.drawable.minigold_071);
        insertIntoMiniGold("072", "Bell Push Switch", 20, 16.00f, R.drawable.minigold_072);
        insertIntoMiniGold("075", "One Way Switch", 20, 15.40f, R.drawable.minigold_075);

    }

    public void initDatabaseVijeta(){

        insertIntoVijeta("034", "One Way Switch", 20, 24.40f, R.drawable.vijeta_034);
        insertIntoVijeta("035", "Two Way Switch", 20, 28.10f, R.drawable.vijeta_035);
        insertIntoVijeta("036", "Bell Push Switch", 20, 24.80f, R.drawable.vijeta_036);
        insertIntoVijeta("039", "One Way Switch", 20, 16.60f, R.drawable.vijeta_039);
        insertIntoVijeta("041", "Two Way Switch", 20, 19.30f, R.drawable.vijeta_040);

    }

    public void initDatabaseVictor(){

        insertIntoVictor("046", "One way switch", 20, 17.00f, R.drawable.victor_046);
        insertIntoVictor("047", "Two way switch", 20, 20.10f, R.drawable.victor_047);
        insertIntoVictor("048", "Bell Push switch", 20, 18.00f, R.drawable.victor_048);

    }

    public void initDatabaseGracia(){

        insertIntoGracia("401", "One way switch", 20, 19.10f, R.drawable.gracia_401);
        insertIntoGracia("402", "Two way switch", 20, 22.50f, R.drawable.gracia_402);
        insertIntoGracia("403", "Bell push switch", 20, 20.90f, R.drawable.gracia_403);

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

    public void initDatabaseLED(){

        insertIntoLED("SLIM SIDE-LIT PANEL LIGHT", R.color.side_lit_color, R.drawable.slim_side_lit);
        insertIntoLED("SURFACE LIT PANEL LIGHT", R.color.surface_lit_color, R.drawable.surface_lit);
        insertIntoLED("24x24 SLIM SIDE-LIT PANEL LIGHT", R.color.side_lit_color, R.drawable.side_lit);

    }





}
