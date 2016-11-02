package com.example.nicki.galgespil;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nicki.galgespil.Galgelogik;


public class tilfoejOrdActivity extends AppCompatActivity{

    private Button bTil;
    private EditText eTil;
    private Button bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        eTil = (EditText)findViewById(R.id.tilføjOrd);
        bTil = (Button)findViewById(R.id.godkendOrd);

        final Galgelogik logik = new Galgelogik();

        bTil.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        logik.muligeOrd.add(1, eTil.getText().toString());
                    }
                }

        );
    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }


}
