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

public class Lomake3 extends AppCompatActivity {

    Counters page3 = Counters.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake3);
        addListenerOnButton();
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
                if(page3.vastaukset[2]!=0) {
                    Intent intent = new Intent(context, Lomake4.class);
                    startActivity(intent);
                }
                //page3.setSumma();
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
            case R.id.liikunta1:
                if (checked)
                    page3.vastaukset[2]=(1);
                break;
            case R.id.liikunta2:
                if (checked)
                    page3.vastaukset[2]=(2);
                break;
            case R.id.liikunta3:
                if (checked)
                    page3.vastaukset[2]=(3);
                break;
            case R.id.liikunta4:
                if (checked)
                    page3.vastaukset[2]=(4);
                break;
            case R.id.liikunta5:
                if (checked)
                    page3.vastaukset[2]=(5);
                break;
            case R.id.liikunta6:
                if (checked)
                    page3.vastaukset[2]=(6);
                break;
            case R.id.liikunta7:
                if (checked)
                    page3.vastaukset[2]=(7);
                break;
            case R.id.liikunta8:
                if (checked)
                    page3.vastaukset[2]=(8);
                break;
            case R.id.liikunta9:
                if (checked)
                    page3.vastaukset[2]=(9);
                break;
            case R.id.liikunta10:
                if (checked)
                    page3.vastaukset[2]=(10);
                break;
        }

    }
}