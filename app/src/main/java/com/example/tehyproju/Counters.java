/**
 * @author Reija Parvio
 * @version
 *
 */
package com.example.tehyproju;

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
        return this.summa;
    }


}
