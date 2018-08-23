package com.max.sqlitecalculadoramax.Controllers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ControladorOperacion {
    private Context context;
    private SQLiteDatabase sqLiteDatabase;

    public ControladorOperacion(Context context){
        this.context  = context;
        sqLiteDatabase = new SQLiteDatabase(this.context);
    }
    public void RegistrarOperacion(String op){
        sqLiteDatabase.guardarOperacion(op);
    }
}
