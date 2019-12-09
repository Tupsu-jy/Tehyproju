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
     * Muuttujille asetetaan halutut linkit setText:llä
     * Mallia otettu blogista https://www.locked.de/how-to-make-html-links-in-android-text-view-work/
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
        //eka_linkki.setText(Html.fromHtml("Tietoa: <a href=\"https://www.kaikkisyovasta.fi/elama-syovan-kanssa/syopaan-sairastuneelle/potilaan-polku/\">Kaikki Syövästä</a>"));

        //toka_linkki.setText(Html.fromHtml("Vertaistukea: <a href=\"https://www.etela-suomensyopayhdistys.fi/neuvonta-ja-tuki/vertaistuki/\">Etelä-Suomen Syöpäyhdistys</a>"));

        //kolmas_linkki.setText(Html.fromHtml("Elämää syövän kanssa: <a href=\"https://syopajatyo.fi/\">Minä, Syöpä ja Työ</a>"));

        //neljas_linkki.setText(Html.fromHtml("Tukihenkilötoiminta: <a href=\"https://www.syopajarjestot.fi/toiminta/vapaaehtoistoiminta/\">Syöpäjärjestöt</a>"));

    }
}