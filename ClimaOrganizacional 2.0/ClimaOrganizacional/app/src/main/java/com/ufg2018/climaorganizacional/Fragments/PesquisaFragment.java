package com.ufg2018.climaorganizacional.Fragments;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ufg2018.climaorganizacional.R;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

/**
 * A simple {@link Fragment} subclass.
 */
public class PesquisaFragment extends Fragment {

    private ListView listaPesquisas;
    private String[] pesquisas = {
            "Pesquisa - UFG",
            "Pesquisa - Recursos Humanos",
            "Pesquisa - Carga de Trabalho",
            "Pesquisa - Escola Superior",
            "Pesquisa - Tribunal de Justiça",
            "Pesquisa - Promotores",
            "Pesquisa - Tribunal de Contas",
            "Pesquisa - Juízes",
            "Pesquisa - Sociedade",
            "Pesquisa - Desembargadores",
            "Pesquisa - Servidores Públicos"
    };
    private String[] processo = {
            "UFG está em desenvolvimento!",
            "Recursos Humanos está em desenvolvimento!",
            "Carga de Trabalho está em desenvolvimento!",
            "Escola Superior está em desenvolvimento!",
            "Tribunal de Justiça está em desenvolvimento!",
            "Promotores está em desenvolvimento!",
            "Tribunal de Contas está em desenvolvimento!",
            "Juízes está em desenvolvimento!",
            "Sociedade está em desenvolvimento!",
            "Desembargadores está em desenvolvimento!",
            "Servidores Públicos está em desenvolvimento!",
    };
    private SQLiteDatabase bancoDados;

    public PesquisaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pesquisa, container, false);

        listaPesquisas = view.findViewById(R.id.lista_pesquisa);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                pesquisas
        );

        listaPesquisas.setAdapter(adaptador);
        listaPesquisas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                Toast.makeText(getActivity().getApplicationContext(), processo[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });
//
//        //Banco de Dados
//        bancoDados = openOrCreateDatabase("pesquisas", null, null);
//
//        //Tabela Pesquisas
//        bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pesquisas(id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, q1 INTEGER, q2 INTEGER, q3 INTEGER, q4 INTEGER, q5 INTEGER)");
//        bancoDados.execSQL("INSERT INTO pesquisas (nome, q1, q2, q3, q4, q5) VALUES ('Pesquisa Recursos Humanos', 2, 5, 6, 10, 12)");
//
//        Cursor cursor = bancoDados.rawQuery("SELECT * FROM pesquisas", null);
//
//        //Recuperar os ids das colunas
//        int indiceColunaId = cursor.getColumnIndex("id");
//        int indiceColunaNome = cursor.getColumnIndex("nome");
//
//        while (cursor != null){
//
//            cursor.moveToNext();
//        }

        return view;
    }

}
