package com.max.sqlitecalculadoramax.Listener;

import android.view.View;

import com.max.sqlitecalculadoramax.Interfaz.SqlitecalculadoramaxActivity;

public class ListenerResta implements View.OnClickListener{
    SqlitecalculadoramaxActivity context;

    public ListenerResta(SqlitecalculadoramaxActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
    Integer nro1=Integer.parseInt(context.getEt1().getText().toString());
    Integer nro2=Integer.parseInt(context.getEt2().getText().toString());
    Integer resResta=nro1 - nro2;
    context.getTv1().setText(String.valueOf(resResta));
    }
}
