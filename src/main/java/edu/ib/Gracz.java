package edu.ib;

import java.util.ArrayList;

public class Gracz {
    /*
    gracz ma:
    karty
    mozliwosc gry
     */
    private ArrayList<Karta> karty;
    public Gracz() {

    }
    public Gracz(ArrayList<Karta> karty) {
        this.karty = karty;
    }

    public ArrayList<Karta> getKarty() {
        return karty;
    }

    public void setKarty(ArrayList<Karta> karty) {
        this.karty = karty;
    }


}
