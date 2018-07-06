package com.ufg2018.climaorganizacional;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.ufg2018.climaorganizacional.Fragments.FiltroFragment;
import com.ufg2018.climaorganizacional.Fragments.PesquisaFragment;
import com.ufg2018.climaorganizacional.Fragments.RelatorioFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle("Clima Organizacional");
                    PesquisaFragment fragment = new PesquisaFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.fram, fragment, "Fragment Pesquisa");
                    fragmentTransaction1.commit();
                    return true;
                case R.id.navigation_filter:
                    setTitle("Filtros");
                    FiltroFragment fragment2 = new FiltroFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.fram, fragment2, "Fragment Filtro");
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_files:
                    setTitle("Relatórios");
                    RelatorioFragment fragment3 = new RelatorioFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.fram, fragment3, "Fragment Relatorios");
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setTitle("Fragment Pesquisa");
        PesquisaFragment fragment = new PesquisaFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.fram, fragment, "Fragment Pesquisa");
        fragmentTransaction1.commit();

    }

}
