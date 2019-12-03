/**
 * @author Reija Parvio
 * @version
 *
 */
package com.example.tehyproju;

import com.example.tehyproju.db.Quest;
import com.example.tehyproju.db.QuestRDatabase;

import java.util.Date;

/**
 * Singleton-luokka, jota käytetään pistemäärän laskemiseen käyttäjän valinnoista
 * Esitellään numero ja summa muuttujat ja annetaan molemmille alkuarvoksi nolla
 */
public class Counters {
    private int numero = 0;
    private int summa = 0;

    private static final Counters ourInstance = new Counters();

    public static Counters getInstance() {
        return ourInstance;
    }

    private Counters() {

        /**lisää valitun vaihtoehdon pistemäärät lopulliseen pistesaldoon
         * Metodia kutsutaan aina, kun käyttäjä valitsee radiobutton:in
         *
         * @param numero vastauksesta saatu pistemäärä
         */
    }
    public void increase(int numero){
        this.numero = numero;
        this.summa = summa + this.numero;
    }

    /**
     * Metodi palauttaa lopullisen pistemäärän käyttäjän näkyville
     * Metodia kutsutaan, kun käyttäjä painaa nappia
     * @return lopullinen pistemäärä
     */
    public int getTulos(){

        int temp=1;
        if(QuestRDatabase.qDao().latest()!=0){
            temp=QuestRDatabase.qDao().latest()+1;
        }

        Date d=new Date();
        Quest newq = new Quest(this.summa, temp, ""+d);
        QuestRDatabase.qDao().insert(newq);
        return this.summa;
    }
}
