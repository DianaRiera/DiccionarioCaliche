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

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Diccionario = new ArrayList<>();
        //A
        Diccionario.add(new Diccionario("A huevo:", "Es cierto."));
        Diccionario.add(new Diccionario("Anantes:", "Por suerte."));
        Diccionario.add(new Diccionario("Apapo:", "Acción de Sorpresa, es decir, estar sorprendido."));
        Diccionario.add(new Diccionario("Atucún:", "Beber un liquido de prisa."));
        Diccionario.add(new Diccionario("Agarrado:", "Avaro, tacaño."));

        //B
        Diccionario.add(new Diccionario("Babosada:", "Tontería. Cosa, objeto."));
        Diccionario.add(new Diccionario("Baleada:", "Tortilla de harina con frijoles."));
        Diccionario.add(new Diccionario("Ballunco:", "Tonto."));
        Diccionario.add(new Diccionario("Birria:", "Cerveza."));
        Diccionario.add(new Diccionario("Brisa:", "Vientecillo impregnado de agua."));

        //C
        Diccionario.add(new Diccionario("Cachimbazo:", "Golpe fuerte."));
        Diccionario.add(new Diccionario("Calache:", "Cachivache. Cosa de escaso valor."));
        Diccionario.add(new Diccionario("Catrín:", "Bien Vestido."));
        Diccionario.add(new Diccionario("Chabacán:", "Alguien muy bromista."));
        Diccionario.add(new Diccionario("Cheque:", "Todo bien ."));

        //D
        Diccionario.add(new Diccionario("De choto:", "De gratis."));
        Diccionario.add(new Diccionario("Desboronar:", "Deshacer."));
        Diccionario.add(new Diccionario("Desburrungar:", "Tumbar, hacer caer."));
        Diccionario.add(new Diccionario("Daime:", "Moneda."));
        Diccionario.add(new Diccionario("Dron:", "Barril."));

        //E
        Diccionario.add(new Diccionario("Echar Cuento:", "Enamorar, Seducir."));
        Diccionario.add(new Diccionario("Encachimbarse:", "Enojarse."));
        Diccionario.add(new Diccionario("Encaramar:", "Subir."));
        Diccionario.add(new Diccionario("Enchibolarse:", "Confundirse."));
        Diccionario.add(new Diccionario("Estanco:", "Cantina."));

        //F
        Diccionario.add(new Diccionario("Ficha:", "Un centavo. Persona de mala reputación."));
        Diccionario.add(new Diccionario("Flución:", "Malestar corporal después de hacer ejercicio."));
        Diccionario.add(new Diccionario("Fondeado:", "Persona que está profundamente dormida."));
        Diccionario.add(new Diccionario("Fresco:", "Refresco."));
        Diccionario.add(new Diccionario("Fulear:", "Llenar."));

        //G
        Diccionario.add(new Diccionario("Galera:", "Cobertizo."));
        Diccionario.add(new Diccionario("Guamazo:", "Golpe."));
        Diccionario.add(new Diccionario("Guaro:", "Agua ardiente."));
        Diccionario.add(new Diccionario("Guineo:", "Banano."));
        Diccionario.add(new Diccionario("GÜirro:", "Niño."));

        //H
        Diccionario.add(new Diccionario("Hacerse el de apeso:", "Disimular."));
        Diccionario.add(new Diccionario("Hacer Clavo:", "Denunciar."));
        Diccionario.add(new Diccionario("Hasta los queques:", "Ir lleno(Un Autobús), estar hastiado de algo."));
        Diccionario.add(new Diccionario("Hueva:", "Pereza."));
        Diccionario.add(new Diccionario("Hueviar:", "Hurtar."));

        //I
        Diccionario.add(new Diccionario("Iguna:", "Trabajo ocasional a destajo."));

        //J
        Diccionario.add(new Diccionario("Jalado:", "Rapido."));
        Diccionario.add(new Diccionario("Jalón:", "Aventón."));
        Diccionario.add(new Diccionario("Jarana:", "Deuda."));
        Diccionario.add(new Diccionario("Jeta:", "Boca."));
        Diccionario.add(new Diccionario("Juco:", "Sucio, desaseado."));

        //L
        Diccionario.add(new Diccionario("Lamber:", "Lamer."));
        Diccionario.add(new Diccionario("Lambiscón:", "Adulador."));
        Diccionario.add(new Diccionario("Largo:", "Pícaro."));
        Diccionario.add(new Diccionario("Llorón:", "Persona que al vender o comprar regatea mucho."));
        Diccionario.add(new Diccionario("Lumbo:", "Tonto o mareado."));

        //M
        Diccionario.add(new Diccionario("Mable:", "Canica."));
        Diccionario.add(new Diccionario("Macaneo:", "Relajo."));
        Diccionario.add(new Diccionario("Macizo:", "Bonito, Excelente."));
        Diccionario.add(new Diccionario("Malearse:", "Enojarse."));
        Diccionario.add(new Diccionario("Mamey:", "Se dice de la ropa ajustada al cuerpo."));

        //N
        Diccionario.add(new Diccionario("Nacha:", "Trabajadora doméstica."));
        Diccionario.add(new Diccionario("Neneque:", "Persona que depende mucho de otra persona(Mamá)."));
        Diccionario.add(new Diccionario("No es Cacha:", "No vale la pena."));

        //Ñ
        Diccionario.add(new Diccionario("Ñata:", "Nariz. Persona de nariz chata"));
        Diccionario.add(new Diccionario("Ñangara:", "Persona de orientación política de izquierda."));
        Diccionario.add(new Diccionario("Ñajo:", "Persona que tiene labio leporino."));

        //O
        Diccionario.add(new Diccionario("Ocho con yo:", "Metido."));
        Diccionario.add(new Diccionario("Ocote:", "Pino."));
        Diccionario.add(new Diccionario("Olimpiadas:", "Examenes de recuperación."));
        Diccionario.add(new Diccionario("Oscurana:", "Oscuridad."));
        Diccionario.add(new Diccionario("Osmil:", "Avena para el desayuno."));

        //P
        Diccionario.add(new Diccionario("Paila:", "Recipiente para el agua."));
        Diccionario.add(new Diccionario("Paja:", "Mentira."));
        Diccionario.add(new Diccionario("Palancón:", "Alto y delgado."));
        Diccionario.add(new Diccionario("Panteón:", "Cementerio."));
        Diccionario.add(new Diccionario("Palmar:", "Morir."));

        //Q
        Diccionario.add(new Diccionario("Qué pedos:", "Qué ondas."));
        Diccionario.add(new Diccionario("Qué pinta:", "Qué bonito."));
        Diccionario.add(new Diccionario("Quemar la pata:", "Ser infiel."));

        //R
        Diccionario.add(new Diccionario("Rapidito:", "Transporte urbano de microbuses."));
        Diccionario.add(new Diccionario("Ronrón:", "Escarabajo mediano."));
        Diccionario.add(new Diccionario("Rezongar:", "Regañar."));
        Diccionario.add(new Diccionario("Rolear:", "Ir de paseo."));
        Diccionario.add(new Diccionario("Ruco:", "Viejo."));

        //S
        Diccionario.add(new Diccionario("Semita:", "Pan de yema."));
        Diccionario.add(new Diccionario("Ser la riata", "Ser Haragán."));
        Diccionario.add(new Diccionario("Sobaleva:", "Adulador."));
        Diccionario.add(new Diccionario("Sompopo:", "Hormiga amarilla."));
        Diccionario.add(new Diccionario("Socar:", "Apretar. Esperar con angustia los resultados de algo."));

        //T
        Diccionario.add(new Diccionario("Talludo:", "Duro."));
        Diccionario.add(new Diccionario("Tambo:", "Barril."));
        Diccionario.add(new Diccionario("Tapis:", "Un octavo de guaro."));
        Diccionario.add(new Diccionario("Tegus:", "Tegucigalpa."));
        Diccionario.add(new Diccionario("Tostón:", "Moneda de cincuenta centavos."));

        //U
        Diccionario.add(new Diccionario("Ufa:", "Interjección, mal olor."));
        Diccionario.add(new Diccionario("Uñudo:", "Ladrón."));

        //V
        Diccionario.add(new Diccionario("Vaina:", "Objeto, asunto."));
        Diccionario.add(new Diccionario("Valer charra:", "No darle importancia."));
        Diccionario.add(new Diccionario("Varas:", "Lempiras, dinero."));
        Diccionario.add(new Diccionario("Vaya pues:", "Okey, está bien. Despedida."));
        Diccionario.add(new Diccionario("Vivo:", "Astuto, aprovechado."));

        //Y
        Diccionario.add(new Diccionario("Yagual:", "Rodete para llevar pesos sobre la cabeza."));
        Diccionario.add(new Diccionario("Yilet:", "Andar con mucho cuidado."));
        Diccionario.add(new Diccionario("Yuca:", "Difícil."));

        //Z
        Diccionario.add(new Diccionario("Zampado:", "Metido."));
        Diccionario.add(new Diccionario("Zumbado:", "Andar rápido. Estar levemente ebrio."));


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
