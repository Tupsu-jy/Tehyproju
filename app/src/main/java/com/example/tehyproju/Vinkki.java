/**
 * @author Heini Näppä
 * @version 9.12.2019
 */

package com.example.tehyproju;

/**luokka vinkkilistalle
 *
 */
public class Vinkki {
    private String otsikko, vinkki;

    /**mitä vinkkiin sisältyy -> otsikko ja teksti
     *
     * @param otsikko vinkin aihealue
     * @param vinkki itse vinkki
     * Molempiin haetaan sisältö vinkkisingle-luokasta
     */
    public Vinkki(String otsikko, String vinkki){
        this.otsikko = otsikko;
        this.vinkki = vinkki;
    }

    /**
     * Kutsutaan, kun halutaan UI:hin vinkin otsikko
     * @return vinkin otsikko
     */
    public String getOtsikko(){
        return otsikko;
    }

    /**
     * Kutsutaan, kun halutaan UI:hin vinkin sisältö
     * @return vinkki
     */
    public String getVinkki() {
        return vinkki;
    }

    /**
     * Vinkki-luokan toString-metodi
     * @return vinkin otsikko
     */
    public String toString(){
        return this.otsikko;
    }
}
