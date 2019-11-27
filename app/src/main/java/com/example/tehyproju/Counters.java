package com.example.tehyproju;

public class Counters {
    private int numero = 0;
    private int summa = 0;

    private static final Counters ourInstance = new Counters();

    public static Counters getInstance() {
        return ourInstance;
    }

    private Counters() {

    }
    public void increase(int numero){
        this.numero = numero;
        this.summa = summa + this.numero;
    }

    public int getTulos(){
        return this.summa;
    }


}
