package com.max.sqlitecalculadoramax.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.max.sqlitecalculadoramax.Adapter.AdapterOperacion;
import com.max.sqlitecalculadoramax.Dao.SqliteCalculadora;
import com.max.sqlitecalculadoramax.Models.Operacion;
import com.max.sqlitecalculadoramax.R;

import java.util.ArrayList;

public class SqlitebaseActivity extends AppCompatActivity {
private SqliteCalculadora sqliteCalculadora;
private ArrayList<Operacion> operacionArrayList;
private AdapterOperacion adapterOperacion;
private ListView listViewOperacion;

    public ArrayList<Operacion> getOperacionArrayList() {
        return operacionArrayList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoralista);
        
        SqliteCalculadora sqliteCalculadora= new SqliteCalculadora(this);
        operacionArrayList=sqliteCalculadora.getOperaciones();
        adapterOperacion = new AdapterOperacion(operacionArrayList, this);

        listViewOperacion=findViewById(R.id.Lista);
        listViewOperacion.setAdapter(adapterOperacion);

    }
}
