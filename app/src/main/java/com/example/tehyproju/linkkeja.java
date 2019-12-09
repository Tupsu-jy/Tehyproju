/**
 * linkkeja-luokka pitää sisällään TextView:en liittämisen haluttuun web-URL:iin
 * @author Reija Parvio
 * @version 4.12.2019
 */

package com.example.tehyproju;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class linkkeja extends AppCompatActivity {

    /**
     * Linkkien activity:stä otetaan TextView:t talteen muuttujiin
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkkeja);

        Button eka_linkki = (Button) findViewById(R.id.linkki1);
        Button toka_linkki = (Button) findViewById(R.id.linkki2);
        Button kolmas_linkki = (Button) findViewById(R.id.linkki3);
        Button neljas_linkki = (Button) findViewById(R.id.linkki4);

        /**
         * Linkki button:iin asetetaan OnClickListener
         * napin painamiseen lisätään intent, jonka taakse asetetaan linkki, jonka halutaan avautuvan
         * Uusi aktivity aloitetaan linkin painalluksella
         * @param arg0
         */
        eka_linkki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.kaikkisyovasta.fi/elama-syovan-kanssa/syopaan-sairastuneelle/potilaan-polku/"));
                startActivity(openLinkIntent);
            }
        });

        toka_linkki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.etela-suomensyopayhdistys.fi/neuvonta-ja-tuki/vertaistuki/"));
                startActivity(openLinkIntent);
            }
        });

        kolmas_linkki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://syopajatyo.fi/"));
                startActivity(openLinkIntent);
            }
        });

        neljas_linkki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.syopajarjestot.fi/toiminta/vapaaehtoistoiminta/"));
                startActivity(openLinkIntent);
            }
        });


    }
}