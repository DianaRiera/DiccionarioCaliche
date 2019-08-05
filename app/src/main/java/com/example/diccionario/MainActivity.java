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
        //A
        Diccionario.add(new Diccionario("A huevo", "Es cierto."));
        Diccionario.add(new Diccionario("Anantes", "Por suerte."));
        Diccionario.add(new Diccionario("Apapo", "Acción de Sorpresa, es decir, estar sorprendido."));
        Diccionario.add(new Diccionario("Atucún", "Beber un liquido de prisa."));
        Diccionario.add(new Diccionario("Agarrado", "Avaro, tacaño."));

        //B
        Diccionario.add(new Diccionario("Babosada", "Tontería. Cosa, objeto."));
        Diccionario.add(new Diccionario("Baleada", "Tortilla de harina con frijoles."));
        Diccionario.add(new Diccionario("Ballunco", "Tonto."));
        Diccionario.add(new Diccionario("Birria", "Cerveza."));
        Diccionario.add(new Diccionario("Brisa", "Vientecillo impregnado de agua."));

        //C
        Diccionario.add(new Diccionario("Cachimbazo", "Golpe fuerte."));
        Diccionario.add(new Diccionario("Calache", "Cachivache. Cosa de escaso valor."));
        Diccionario.add(new Diccionario("Catrín", "Bien Vestido."));
        Diccionario.add(new Diccionario("Chabacán", "Alguien muy bromista."));
        Diccionario.add(new Diccionario("Cheque", "Todo bien ."));

        //D
        Diccionario.add(new Diccionario("De choto", "De gratis."));
        Diccionario.add(new Diccionario("Desboronar", "Deshacer."));
        Diccionario.add(new Diccionario("Desburrungar", "Tumbar, hacer caer."));
        Diccionario.add(new Diccionario("Daime", "Moneda."));
        Diccionario.add(new Diccionario("Dron", "Barril."));

        //E
        Diccionario.add(new Diccionario("Echar Cuento", "Enamorar, Seducir."));
        Diccionario.add(new Diccionario("Encachimbarse", "Enojarse."));
        Diccionario.add(new Diccionario("Encaramar", "Subir."));
        Diccionario.add(new Diccionario("Enchibolarse", "Confundirse."));
        Diccionario.add(new Diccionario("Estanco", "Cantina."));

        //F
        Diccionario.add(new Diccionario("Galera", "Cobertizo."));
        Diccionario.add(new Diccionario("Guamazo", "Golpe."));
        Diccionario.add(new Diccionario("Guaro", "Agua ardiente."));
        Diccionario.add(new Diccionario("Guineo", "Banano."));
        Diccionario.add(new Diccionario("GÜirro", "Niño."));

        //G
        Diccionario.add(new Diccionario("Hacerse el de apeso", "Disimular."));
        Diccionario.add(new Diccionario("Hacer Clavo", "Denunciar."));
        Diccionario.add(new Diccionario("Hasta los queques", "Ir lleno(Un Autobús), estar hastiado de algo."));
        Diccionario.add(new Diccionario("Hueva", "Pereza."));
        Diccionario.add(new Diccionario("Hueviar", "Hurtar."));

        //H
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //I
        Diccionario.add(new Diccionario("", "."));

        //J
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //L
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //M
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //N
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //Ñ
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //O
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //P
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //Q
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //R
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //S
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //T
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //U
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //V
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //Y
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));

        //Z
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));
        Diccionario.add(new Diccionario("", "."));


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
