package com.example.diccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Diccionario> Diccionario;
    private ListView lista_dic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Diccionario = new ArrayList<>();


        lista_dic = (ListView) findViewById(R.id.lista_dic);
        lista_dic.setAdapter(new ArrayAdapter<Diccionario>(
                this,
                android.R.layout.simple_list_item_1,
                Diccionario
        ));
    }
}
