package com.max.sqlitecalculadoramax.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.max.sqlitecalculadoramax.Listener.ListenerHistorial;
import com.max.sqlitecalculadoramax.Listener.ListenerResta;
import com.max.sqlitecalculadoramax.Listener.ListenerSuma;
import com.max.sqlitecalculadoramax.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
public class SqlitecalculadoramaxActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private Button botonSumar, botonResta, botonHistorial;

    //Getter & Setter
    public EditText getEt1() {
        return et1;
    }
    public EditText getEt2() {
        return et2;
    }
    public TextView getTv1() {
        return tv1;
    }

    public void setTv1(TextView tv1) {
        this.tv1 = tv1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlitecalculadoramax);
        Fabric.with(this, new Crashlytics());
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        botonSumar=findViewById(R.id.botonSumar);
        botonResta=findViewById(R.id.botonResta);
        botonHistorial=findViewById(R.id.botonHistorial);
        //Escuchadores
        ListenerSuma listenerSuma= new ListenerSuma(this);
        ListenerResta listenerResta= new ListenerResta(this);
        ListenerHistorial listenerHistorial= new ListenerHistorial(this);
        //Seteo botones
        botonSumar.setOnClickListener(listenerSuma);
        botonResta.setOnClickListener(listenerResta);
        botonHistorial.setOnClickListener(listenerHistorial);
    }
}
