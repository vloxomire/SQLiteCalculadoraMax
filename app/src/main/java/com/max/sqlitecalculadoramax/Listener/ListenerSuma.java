package com.max.sqlitecalculadoramax.Listener;

import android.view.View;

import com.max.sqlitecalculadoramax.Interfaz.SqlitecalculadoramaxActivity;

public class ListenerSuma implements View.OnClickListener{
    SqlitecalculadoramaxActivity context;

    public ListenerSuma(SqlitecalculadoramaxActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View vSuma) {
        String valor1=context.getEt1().getText().toString();
        String valor2=context.getEt2().getText().toString();
        Integer nro1=Integer.parseInt(valor1);
        Integer nro2=Integer.parseInt(valor2);
        Integer resulSuma=nro1 + nro2;
        String resulString=String.valueOf(resulSuma);
        context.getTv1().setText(resulString);

    }
}
