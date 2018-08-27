package com.max.sqlitecalculadoramax.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.max.sqlitecalculadoramax.Interfaz.SqlitebaseActivity;
import com.max.sqlitecalculadoramax.Models.Operacion;
import com.max.sqlitecalculadoramax.R;

import java.util.ArrayList;

public class AdapterOperacion extends BaseAdapter {
    private ArrayList<Operacion> operacionArrayList;
    SqlitebaseActivity context;
    private OperacionListener operacionListener;



    public AdapterOperacion(ArrayList<Operacion> operacionArrayList, SqlitebaseActivity context) {
        this.operacionArrayList = operacionArrayList;
        this.context = context;
        this.operacionListener= new OperacionListener();
    }

    @Override
    public int getCount() {
        return operacionArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return operacionArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater miLayoutInflater;
        miLayoutInflater=(LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = miLayoutInflater.inflate(R.layout.calculadoralista, parent, false);
        TextView id, operacion;
        id= itemView.findViewById(R.id.cel)
    }
}
