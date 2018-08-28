package com.max.sqlitecalculadoramax.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.max.sqlitecalculadoramax.Models.Operacion;

import java.util.ArrayList;

public class SqliteCalculadora extends SQLiteOpenHelper{
    private static final String DBNAME="calculadora";
    private static final Integer DBVERSION=1;
    private Context context;
    private SQLiteDatabase conexion;

    public SqliteCalculadora(Context context) {
        super(context, DBNAME, null, DBVERSION);
        this.context = context;
    }
        @Override
        public void onCreate (SQLiteDatabase db){
            String query="CREATE TABLE historial ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` TEXT NOT NULL )";
            db.execSQL(query);
        }

        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
            String query="CREATE TABLE `historial`(`Id`INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` TEXT NOT NULL)";
            db.execSQL(query);
        }

        private void conectar(){
        conexion = getWritableDatabase();
        }
        private void desconectar(){
        conexion.close();
        }
        public void guardarOperacionSinSQLite(Operacion op){
        this.conectar();
        ContentValues fila= new ContentValues();
        fila.put("operacion", op.getOperacion());
        conexion.insert("historial",null,fila);
        this.desconectar();
        }
    public ArrayList<Operacion> getOperaciones() {
        ArrayList<Operacion> operacionArrayList = new ArrayList<>();
        this.conectar();
        String query = "";
        query ="select operacion, id from historial";
        Cursor cursor= conexion.rawQuery(query, null);
        while(cursor.moveToNext()){
            Operacion unaOperacion = new Operacion(cursor.getInt(cursor.getColumnIndex("Id")),cursor.getString(cursor.getColumnIndex("operacion")));
            operacionArrayList.add(unaOperacion);
        }
        this.desconectar();
        return operacionArrayList;
    }
}

