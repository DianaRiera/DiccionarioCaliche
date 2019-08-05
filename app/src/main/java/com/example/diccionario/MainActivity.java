package com.example.diccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DiccionarioAdapter adapter;
    private ArrayList<Diccionario> Diccionario;
    private ListView lista_dic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Diccionario = new ArrayList<>();
        Diccionario.add(new Diccionario("Hola", "quetal"));

        adapter = new DiccionarioAdapter();

        lista_dic = (ListView) findViewById(R.id.lista_dic);
        lista_dic.setAdapter(adapter);
    }

    private class DiccionarioAdapter extends ArrayAdapter<Diccionario>{
        DiccionarioAdapter() {
            super(MainActivity.this, R.layout.item_lista_diccionario, Diccionario);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View result = convertView;
            if (result == null){
                LayoutInflater inflater = getLayoutInflater();
                result = inflater.inflate(R.layout.item_lista_diccionario, parent,false);
            }
            Diccionario diccionario = getItem(position);
            TextView palabra = (TextView) result.findViewById(R.id.palabra);
            palabra.setText(diccionario.getPalabra());

            TextView significado = (TextView) result.findViewById(R.id.significado);
            significado.setText(diccionario.getSignificado());

            return result;
        }
    }
}
