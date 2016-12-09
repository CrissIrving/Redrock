package com.example.hp.fragment01;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn_01);
        btn.setOnClickListener(this);
        Button btn01 = (Button) findViewById(R.id.btn_02);
        btn01.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_01){
        fradment_xx fradment_xx = new fradment_xx();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right, fradment_xx);
        transaction.commit();
    }
        else if (v.getId()==R.id.btn_02){
            fradment01 fradment01 = new fradment01();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.right, fradment01);
            transaction.commit();
        }
        }
}
