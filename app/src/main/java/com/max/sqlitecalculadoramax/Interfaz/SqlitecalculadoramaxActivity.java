package com.max.sqlitecalculadoramax.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.max.sqlitecalculadoramax.R;

public class SqlitecalculadoramaxActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private Button botonSumar, botonResta, botonHistorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlitecalculadoramax);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        botonSumar=findViewById(R.id.botonSumar);
        botonResta=findViewById(R.id.botonResta);
        botonHistorial=findViewById(R.id.botonHistorial);
    }
}
