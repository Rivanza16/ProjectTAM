package com.hello.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Beranda extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.home:
                    f = new home_fragment();
                    break;
                case R.id.basket:
                    f = new basket_fragment();
                    break;
                case R.id.menu:
                    f = new menu_fragment();
                    break;
                case R.id.voucher:
                    f = new voucher_fragment();
                    break;
                case R.id.account:
                    f = new accounnt_fragmet();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_frag,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}