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
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tehyproju.db.QDao;
import com.example.tehyproju.db.Quest;
import com.example.tehyproju.db.QuestRDatabase;

import java.util.Date;

public class lomake6 extends AppCompatActivity {


    Counters page6 = Counters.getInstance();
    QDao temp=QuestRDatabase.getInstance().qDao();
    int newid=temp.size();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lomake6);
        //addListenerOnButton();
    }

    /**
     * Metodi kutsuu counters-luokasta lopullista tulosta (get.Tulos())
     * Metodia kutsutaan, kun käyttäjä painaa "Lake tulos" nappia
     * Saatu numero tulostetaan textView elementtiin "arvosana"
     * @param view Button-elementti
     */
    public void tulos(View view){
        Date d=new Date();
        Quest newq = new Quest(page6.getTulos(), newid, DateConverter.fromDate(d));
        QuestRDatabase.getInstance().qDao().insert(newq);

        TextView arvosana = findViewById(R.id.tulos_numero);
        arvosana.setText(Integer.toString(page6.getTulos()));


    }

    /**
     * Metodi palauttaa takaisin MainActivity:yn
     * Metodia kutsutaan, kun käyttäjä painaa nappia, jossa on se OnClick-metodina
     * Napin painallus nollaa tuloksen aina
     * @param view button
     */
    public void palaaEtusivulle(View view){
        page6.reset();
        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent1);
    }

    /**
     * Metodia kutsutaan, kun käyttäjä valitsee jonkin radioButton:in
     * Metodi tarkistaa, mikä badioButton on valittu ja kutsuu Counters-luokan increase-metodia sen mukaisella arvolla
     * @param view käyttäjän valitsema radiobutton
     */
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.stressi1:
                if (checked)
                    page6.increase(1);
                break;
            case R.id.stressi2:
                if (checked)
                    page6.increase(2);
                break;
            case R.id.stressi3:
                if (checked)
                    page6.increase(3);
                break;
            case R.id.stressi4:
                if (checked)
                    page6.increase(4);
                break;
            case R.id.stressi5:
                if (checked)
                    page6.increase(5);
                break;
            case R.id.stressi6:
                if (checked)
                    page6.increase(6);
                break;
            case R.id.stressi7:
                if (checked)
                    page6.increase(7);
                break;
            case R.id.stressi8:
                if (checked)
                    page6.increase(8);
                break;
            case R.id.stressi9:
                if (checked)
                    page6.increase(9);
                break;
            case R.id.stressi10:
                if (checked)
                    page6.increase(10);
                break;
        }

    }
}
