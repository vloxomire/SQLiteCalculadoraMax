package com.max.sqlitecalculadoramax.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.max.sqlitecalculadoramax.Dao.SqliteCalculadora;
import com.max.sqlitecalculadoramax.Models.Operacion;
import com.max.sqlitecalculadoramax.R;

import java.util.ArrayList;

public class SqlitebaseActivity extends AppCompatActivity {
SqliteCalculadora sqliteCalculadora;
ArrayList<Operacion> operacionArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoralista);
        SqliteCalculadora sqliteCalculadora= new SqliteCalculadora(this);
        Operacion operacion= new Operacion(null, null);
        sqliteCalculadora.guardarOperacionSinSQLite(operacion);
        operacionArrayList= sqliteCalculadora.getOperaciones();
    }
}
