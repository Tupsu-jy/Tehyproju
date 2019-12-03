/**
 *
 * @author Reija Parvio
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

    /**public void tulos(View view){
        TextView arvosana = findViewById(R.id.tulos_numero);
        arvosana.setText(Integer.toString(page3.getTulos()));
    }*/

    /**
     * Seuraavalle sivulle siirtävä metodi
     * Button-elementtiin "seuraava sivu" asetetaan OnClickListener
     * Button:ia painaessa luodaan ja käynnistetään uusi intent, joka siirtää halutulle sivulle
     * Koodi lainattu sivulta https://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/
     */
    public void addListenerOnButton() {
        final Context context = this;
        Button button = (Button) findViewById(R.id.seuraava_sivu);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Lomake4.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Metodia kutsutaan, kun käyttäjä valitsee jonkin radioButton:in
     * Metodi tarkistaa, mikä badioButton on valittu ja kutsuu Counters-luokan increase-metodia sen mukaisella arvolla
     * @param view käyttäjän valitsema radiobutton
     */
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.liikunta1:
                if (checked)
                    page3.increase(1);
                break;
            case R.id.liikunta2:
                if (checked)
                    page3.increase(2);
                break;
            case R.id.liikunta3:
                if (checked)
                    page3.increase(3);
                break;
            case R.id.liikunta4:
                if (checked)
                    page3.increase(4);
                break;
            case R.id.liikunta5:
                if (checked)
                    page3.increase(5);
                break;
            case R.id.liikunta6:
                if (checked)
                    page3.increase(6);
                break;
            case R.id.liikunta7:
                if (checked)
                    page3.increase(7);
                break;
            case R.id.liikunta8:
                if (checked)
                    page3.increase(8);
                break;
            case R.id.liikunta9:
                if (checked)
                    page3.increase(9);
                break;
            case R.id.liikunta10:
                if (checked)
                    page3.increase(10);
                break;
        }

    }
}