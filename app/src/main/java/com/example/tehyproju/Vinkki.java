package com.example.tehyproju;

//luokka vinkkilistalle
public class Vinkki {
    private String otsikko, vinkki;

//mitä vinkkiin sisältyy -> otsikko ja teksti
    public Vinkki(String otsikko, String vinkki){
        this.otsikko = otsikko;
        this.vinkki = vinkki;
    }

//metodit, joilla voidaan palauttaa luokasta haluttu sisältö
    public String getOtsikko(){
        return otsikko;
    }

    public String getVinkki() {
        return vinkki;
    }

    public String toString(){
        return this.otsikko;
    }
}
