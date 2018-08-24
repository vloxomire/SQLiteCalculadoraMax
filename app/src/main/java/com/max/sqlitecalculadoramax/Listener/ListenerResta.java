package com.max.sqlitecalculadoramax.Listener;

import android.view.View;

import com.max.sqlitecalculadoramax.Dao.SqliteCalculadora;
import com.max.sqlitecalculadoramax.Interfaz.SqlitecalculadoramaxActivity;
import com.max.sqlitecalculadoramax.Models.Operacion;

public class ListenerResta implements View.OnClickListener{
    SqlitecalculadoramaxActivity context;
    SqliteCalculadora sqliteCalculadora;

    public ListenerResta(SqlitecalculadoramaxActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        sqliteCalculadora = new SqliteCalculadora(context);
        Integer nro1=Integer.parseInt(context.getEt1().getText().toString());
        Integer nro2=Integer.parseInt(context.getEt2().getText().toString());
        Integer resResta=nro1 - nro2;
        context.getTv1().setText(String.valueOf(resResta));
        Operacion operacion= new Operacion(null,(nro1 +" - "+ nro2 +"="+resResta));
        sqliteCalculadora.guardarOperacionSinSQLite(operacion);
    }
}
