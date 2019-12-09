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
         * @param numero käyttäjän valinnasta saatu pistemäärä
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
        return this.summa;
    }

<<<<<<< HEAD
    public void setZero(){
        this.summa=0;
=======
    /**
     * Metodi nollaa tuloksen takaisin nollaksi
     * Metodia kutsutaan aina kun kyselylomake avataan etusivulta
     */
    public void reset(){
        this.numero = 0;
        this.summa = 0;
>>>>>>> da64b44f82dba2f6d10ceb6bba39339db965e11d
    }
}
