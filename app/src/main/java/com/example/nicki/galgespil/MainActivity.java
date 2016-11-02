package com.example.nicki.galgespil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void startSpil(View v){
        Intent myIntent = new Intent(this, spilActivity.class);

        startActivity(myIntent);
    }

    public void tilfoejOrd(View v){
        Intent myIntent = new Intent(this, tilfoejOrdActivity.class);

        startActivity(myIntent);
    }

    public void hjaelp(View v){
        Intent myIntent = new Intent(this, hjaelpActivity.class);

        startActivity(myIntent);

    }

}
