package com.max.sqlitecalculadoramax.Interfaz;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.max.sqlitecalculadoramax.Adapter.AdapterOperacion;
import com.max.sqlitecalculadoramax.Dao.SqliteCalculadora;
import com.max.sqlitecalculadoramax.Models.Operacion;
import com.max.sqlitecalculadoramax.R;

import java.util.ArrayList;

public class SqlitebaseActivity extends AppCompatActivity {
SqliteCalculadora sqliteCalculadora;
private ArrayList<Operacion> operacionArrayList;
private AdapterOperacion adapterOperacion;
protected final String TAG = SqlitebaseActivity.class.getSimpleName();
public static SqlitebaseActivity interfaz;
private Re

    public ArrayList<Operacion> getOperacionArrayList() {
        return operacionArrayList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoralista);
        SqliteCalculadora sqliteCalculadora= new SqliteCalculadora(this);
    }
}
