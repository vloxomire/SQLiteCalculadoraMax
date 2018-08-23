package com.max.sqlitecalculadoramax.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

        }

        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
        String query="CREATE TABLE `calculadora` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `operacion` TEXT NOT NULL )";
        db.execSQL(query);
        }
        private void conectar(){
        conexion=getWritableDatabase();
        }
        private void desconectar(){
        conexion.close();
        }
        public void guardarOperaciones(){
        this.conectar();
        ContentValues row= new ContentValues();
        row.put("operacion", op);
        conexion.insert("operacion",null,row);
        this.desconectar();
        }
    }
