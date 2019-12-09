/**Käyttäjän valitseman nappi käynnistää intentin valittuun activity:yn
 * Edellinen kyselytulos nollataan aina, kun lomake avataan uudestaan
 * @author Reija Parvio & Heini Näppä
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
    public void lisaaMerkinta(View view){
        Intent intent1 = new Intent(getApplicationContext(), Lomake1.class);
        startActivity(intent1);
        page0.reset();
    }

    public void vinkit(View view){
        Intent intent2 = new Intent(getApplicationContext(), vinkit.class);
        startActivity(intent2);
    }
    public void linkkeja(View view) {
        Intent intent3 = new Intent(getApplicationContext(), linkkeja.class);
        startActivity(intent3);
    }
}