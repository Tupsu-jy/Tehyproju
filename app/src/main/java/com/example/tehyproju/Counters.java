/**
 * @author Reija Parvio
 * @version 9.12.2019
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
    int[] vastaukset=new int[6];
    private int summa = 0;

    private static final Counters ourInstance = new Counters();

    public static Counters getInstance() {
        return ourInstance;
    }

    private Counters() {
    }
    /**
     * Summaa kaikki vastaustaulukossa olevat luvut lopulliseksi tulokseksi
     */
    public void setSumma(){
        if(summa==0){
            for (int i=0; i<6; i++){
                this.summa+=vastaukset[i];
            }
        }

    }

    /**
     * Metodi palauttaa lopullisen pistemäärän käyttäjän näkyville
     * Metodia kutsutaan, kun käyttäjä painaa nappia
     * @return lopullinen pistemäärä
     */
    public int getTulos(){
        return this.summa;
    }

    /**
     * Metodi nollaa tuloksen ja vastaustaulukon
     * Metodia kutsutaan aina kun kyselylomakkeesta poistutaan etusivulle
     */
    public void reset(){
        for (int i=0; i<6; i++){
            vastaukset[i]=0;
        }
        this.summa = 0;
    }
}
