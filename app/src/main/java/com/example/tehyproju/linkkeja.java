/**
 * linkkeja-luokka pitää sisällään TextView:en liittämisen haluttuun web-URL:iin
 * @author Reija Parvio
 * @version 4.12.2019
 */

package com.example.tehyproju;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
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

        TextView eka_linkki = (TextView)findViewById(R.id.linkki1);
        TextView toka_linkki = (TextView)findViewById(R.id.linkki2);
        TextView kolmas_linkki = (TextView)findViewById(R.id.linkki3);
        TextView neljas_linkki = (TextView)findViewById(R.id.linkki4);

        eka_linkki.setText(Html.fromHtml("Tietoa: <a href=\"https://www.kaikkisyovasta.fi/elama-syovan-kanssa/syopaan-sairastuneelle/potilaan-polku/\">Kaikki Syövästä</a>"));

        toka_linkki.setText(Html.fromHtml("Vertaistukea: <a href=\"https://www.etela-suomensyopayhdistys.fi/neuvonta-ja-tuki/vertaistuki/\">Etelä-Suomen Syöpäyhdistys</a>"));

        kolmas_linkki.setText(Html.fromHtml("Elämää syövän kanssa: <a href=\"https://syopajatyo.fi/\">Minä, Syöpä ja Työ</a>"));

        neljas_linkki.setText(Html.fromHtml("Tukihenkilötoiminta: <a href=\"https://www.syopajarjestot.fi/toiminta/vapaaehtoistoiminta/\">Syöpäjärjestöt</a>"));

    }
}