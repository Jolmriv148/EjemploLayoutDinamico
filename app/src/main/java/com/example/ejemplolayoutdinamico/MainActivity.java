package com.example.ejemplolayoutdinamico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout=findViewById(R.id.tl);

        crearTabla(4);
    }

    public void crearTabla(int num){
        for(int i=0;i<num;i++){
            //Creamos fila
            TableRow fila=new TableRow(getApplicationContext());

            // Creamos parámetros
            TableLayout.LayoutParams lpFila=new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,TableLayout.LayoutParams.MATCH_PARENT);
            lpFila.weight=1;

            //Asignamos parámetros
            fila.setLayoutParams(lpFila);

            for(int j=0;j<num;j++){
                // Creamos botón
                Button boton=new Button(getApplicationContext());
                boton.setId(View.generateViewId());

                //Creamos params
                TableRow.LayoutParams lpBoton=new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.MATCH_PARENT);
                lpBoton.weight=1;

                //Asignamos parámetros
                boton.setLayoutParams(lpBoton);

                //Añadir botón a fila
                fila.addView(boton);
            }

            tableLayout.addView(fila);

        }
    }
}