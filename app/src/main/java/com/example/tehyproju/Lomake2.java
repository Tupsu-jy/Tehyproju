/**
 * Luokka näyttää käyttäjälle RadioButton vaihtoehdot ja
 * laskee pistemäärän käyttäjän valitsemasta RadioButton vaihtoehdosta
 * @author Reija Parvio
 * @version 9.12.2019
 */

package com.example.tehyproju;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lomake2 extends AppCompatActivity {

    Counters page2 = Counters.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake2);
        addListenerOnButton();
        //page2.setSumma();
    }

    /**
     * Seuraavalle sivulle siirtävä metodi
     * Button-elementtiin "seuraava sivu" asetetaan OnClickListener
     * If lause varmistaa että käyttäjä ei pääse seuraavaan kysymyskeen jos ei ole vastannut mitään
     * Button:ia painaessa luodaan ja käynnistetään uusi intent, joka siirtää halutulle sivulle
     * Koodi lainattu sivulta https://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/
     */
    public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.seuraava_sivu);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if(page2.vastaukset[1]!=0) {
                    Intent intent = new Intent(context, Lomake3.class);
                    startActivity(intent);
                }
            }
        });
    }

    /**
     * Metodia kutsutaan, kun käyttäjä valitsee jonkin radioButton:in
     * Metodi tarkistaa, mikä badioButton on valittu ja muokkaa Counters-luokan vaustaukset taulukkoa
     * sille kuuluvalla kohdalla valitun vastauksen mukaisella arvolla
     * @param view käyttäjän valitsema radiobutton
     */
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.sosiaali1:
                if (checked)
                    page2.vastaukset[1]=(1);
                break;

            case R.id.sosiaali2:
                if (checked)
                    page2.vastaukset[1]=(2);
                break;
            case R.id.sosiaali3:
                if (checked)
                    page2.vastaukset[1]=(3);
                break;
            case R.id.sosiaali4:
                if (checked)
                    page2.vastaukset[1]=(4);
                break;
            case R.id.sosiaali5:
                if (checked)
                    page2.vastaukset[1]=(5);
                break;
            case R.id.sosiaali6:
                if (checked)
                    page2.vastaukset[1]=(6);
                break;
            case R.id.sosiaali7:
                if (checked)
                    page2.vastaukset[1]=(7);
                break;
            case R.id.sosiaali8:
                if (checked)
                    page2.vastaukset[1]=(8);
                break;
            case R.id.sosiaali9:
                if (checked)
                    page2.vastaukset[1]=(9);
                break;
            case R.id.sosiaali10:
                if (checked)
                    page2.vastaukset[1]=(10);
                break;
        }

    }
}