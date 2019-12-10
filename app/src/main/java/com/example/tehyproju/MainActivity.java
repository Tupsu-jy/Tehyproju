/**Käyttäjän valitseman nappi käynnistää intentin valittuun activity:yn
 * @author Reija Parvio & Heini Näppä & Jaakko Ylinen
 */

package com.example.tehyproju;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tehyproju.db.QuestRDatabase;

public class MainActivity extends AppCompatActivity {

    Counters page0 = Counters.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (QuestRDatabase.getInstance()==null){
            QuestRDatabase.create(getApplicationContext());
        }
    }

    /** Ohjelma avaa Graph-luokan, kun käyttäjä painaa nappia
     * Napin painallus aloittaa uuden Intent:in
     * @param view button-elementti
     */
    public void avaaKaavio(View view) {
        Intent intent = new Intent(getApplicationContext(), Graph.class);
        startActivity(intent);
    }

    /** Ohjelma nollaa kaikki käyttäjän sille syöttämät tiedot, kun käyttäjä painaa nappia
     * @param v button-elementti
     */
    public void delete(View v){
        QuestRDatabase.getInstance().qDao().deleteAll();
    }

    /** Ohjelma avaa Lomake1-luokan, kun käyttäjä painaa nappia
     * Napin painallus aloittaa uuden Intent:in
     * Kyselylomakkeen avaus aloittaa pisteidenlaskun aina alusta
     * @param view button-elementti
     */
    public void lisaaMerkinta(View view){
        Intent intent1 = new Intent(getApplicationContext(), Lomake1.class);
        startActivity(intent1);
        page0.reset();
    }

    /** Ohjelma avaa vinkit-luokan, kun käyttäjä painaa nappia
     * Napin painallus aloittaa uuden Intent:in
     * @param view button-elementti
     */
    public void vinkit(View view){
        Intent intent2 = new Intent(getApplicationContext(), vinkit.class);
        startActivity(intent2);
    }

    /** Ohjelma avaa linkkeja-luokan, kun käyttäjä painaa nappia
     * Napin painallus aloittaa uuden Intent:in
     * @param view button-elementti
     */
    public void linkkeja(View view) {
        Intent intent3 = new Intent(getApplicationContext(), linkkeja.class);
        startActivity(intent3);
    }
}