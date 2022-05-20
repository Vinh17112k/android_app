package com.example.food_app.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.food_app.model.User;

import java.util.ArrayList;
import java.util.List;

public class SQLite extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "tbl.db";
    private static int DATABASE_VERSION = 1;

    public SQLite(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCreateDB = "CREATE TABLE items("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "name TEXT,"+
                "email TEXT,"+
                "mobile TEXT,"+
                "password TEXT)";
        sqLiteDatabase.execSQL(sqlCreateDB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
    public void register(User i){
        String sql = "INSERT INTO items(name,email,mobile,password)"+
                "VALUES(?,?,?,?)";
        String[] args = {i.getName(),i.getEmail(), i.getMobile(), i.getPassword()};
        SQLiteDatabase st = getWritableDatabase();
        st.execSQL(sql,args);
    }
    public void updateUser(User i) {
        String sql = "UPDATE items SET name = ?,email=?, mobile=? ,passwod=? WHERE id = ?";
        String[] args = {i.getName(),i.getEmail(), i.getMobile(), i.getPassword(),String.valueOf(i.getId())};
        SQLiteDatabase st = getWritableDatabase();
        st.execSQL(sql,args);
    }
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor rs = sqLiteDatabase.query("items",
                null, null, null,
                null, null, null);
        while ((rs != null) && (rs.moveToNext())) {
            int id= rs.getInt(0);
            String title = rs.getString(1);
            String author = rs.getString(2);
            String category = rs.getString(3);
            String price = rs.getString(4);
            list.add(new User(id,title,author,category,price));
        }
        return list;
    }
//    public void deleteItem(int id){
//        String sql = "DELETE FROM items WHERE id = ?";
//        String[] args = {Integer.toString(id)};
//        SQLiteDatabase st = getWritableDatabase();
//        st.execSQL(sql, args);
//    }
//    //for search
//    public List<Item> searchByTitle(String key) {
//        List<Item> list= new ArrayList<>();
//        String whereClause = "title like ?";
//        String[] whereArgs = {"%"+key+"%"};
//        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
//        Cursor rs = sqLiteDatabase.query("items",
//                null, whereClause, whereArgs,
//                null, null, null);
//        while ((rs != null) && (rs.moveToNext())) {
//            int id= rs.getInt(0);
//            String title = rs.getString(1);
//            String author = rs.getString(2);
//            String category = rs.getString(3);
//            String price = rs.getString(4);
//            String date = rs.getString(5);
//            list.add(new Item(id,title,author,category,price,date));
//        }
//        return list;
//    }
//    public List<Item> getByDateFromTo(String from,String to) {
//        List<Item> list = new ArrayList<>();
//        String whereClause = "date BETWEEN ? AND ?";
//        String[] whereArgs = { from.trim(),to.trim()};
//        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
//        Cursor rs = sqLiteDatabase.query("items",
//                null, whereClause, whereArgs,
//                null, null, null);
//        while ((rs != null) && (rs.moveToNext())) {
//            int id= rs.getInt(0);
//            String title = rs.getString(1);
//            String author = rs.getString(2);
//            String category = rs.getString(3);
//            String price = rs.getString(4);
//            String date = rs.getString(5);
//            list.add(new Item(id,author,title,category,price,date));
//        }
//        return list;
//    }
//    public List<Item> getByPriceToPrice(String from,String to) {
//        List<Item> list = new ArrayList<>();
//        String whereClause = "price BETWEEN ? AND ?";
//        String[] whereArgs = { from.trim(),to.trim()};
//        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
//        Cursor rs = sqLiteDatabase.query("items",
//                null, whereClause, whereArgs,
//                null, null, null);
//        System.out.println(rs);
//        while ((rs != null) && (rs.moveToNext())) {
//            int id= rs.getInt(0);
//            String title = rs.getString(1);
//            String author = rs.getString(2);
//            String category = rs.getString(3);
//            String price = rs.getString(4);
//            String date = rs.getString(5);
//            list.add(new Item(id,author,title,category,price,date));
//        }
//        return list;
//    }
}
