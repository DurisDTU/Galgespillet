package com.example.nicki.galgespil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import static com.example.nicki.galgespil.R.id.info;

public class spilActivity extends AppCompatActivity {

    private TextView text;
    private Button gæt;
    private EditText et;

    Galgelogik logik = new Galgelogik();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spillet_aktivitet);

        text = new TextView(spilActivity.this);
        text.setText("Velkommen til Galge spilet!" +
                "\nDu skal gætte dette ord: "+logik.getSynligtOrd() +
                "\nSkriv ét bogstav herunder og tryk 'gæt'.\n");

        et = new EditText(spilActivity.this);
        et.setHint("Skriv et bogstav her.");

        gæt = new Button(spilActivity.this);
        gæt.setText("Spil");
        gæt.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.ic_media_play, 0, 0, 0);

     //   gæt.setOnClickListener(this);

        return tl;
    }
    }

    private void opdaterSkærm() {
        text.setText("Gæt ordet: " + logik.getSynligtOrd());
        text.append("\n\nDu har " + logik.getAntalForkerteBogstaver() + " forkerte:" + logik.getBrugteBogstaver());

        if (logik.erSpilletVundet()) {
            text.append("\nDu har vundet");
        }
        if (logik.erSpilletTabt()) {
            text.setText("Du har tabt, ordet var : " + logik.getOrdet());
        }
    }

}
