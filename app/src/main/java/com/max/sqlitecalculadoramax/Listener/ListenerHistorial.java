package com.max.sqlitecalculadoramax.Listener;

import android.content.Intent;
import android.view.View;

import com.max.sqlitecalculadoramax.Interfaz.SqlitebaseActivity;
import com.max.sqlitecalculadoramax.Interfaz.SqlitecalculadoramaxActivity;

public class ListenerHistorial implements View.OnClickListener {
    SqlitecalculadoramaxActivity context;

    public ListenerHistorial(SqlitecalculadoramaxActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent sqlitebaseActivity= new Intent(context, SqlitebaseActivity.class);
        context.startActivity(sqlitebaseActivity);
    }
}
