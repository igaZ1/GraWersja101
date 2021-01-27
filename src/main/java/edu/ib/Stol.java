package edu.ib;

import java.util.ArrayList;

public class Stol  {
    /*
    na stole
    talia do pobrania
    wylozone karty, w szczegolnosci ostatnia wylozona
     */
    private ArrayList<Karta> oczekujace;
    private ArrayList<Karta> wylozone;
    private Karta aktywna;
    public Stol(){


    }
    public Stol(ArrayList<Karta> oczekujace, ArrayList<Karta> wylozone, Karta aktywna) {
        this.oczekujace = oczekujace;
        this.wylozone = wylozone;
        this.aktywna = aktywna;
    }

    public ArrayList<Karta> getOczekujace() {
        return oczekujace;
    }

    public void setOczekujace(ArrayList<Karta> oczekujace) {

        this.oczekujace = oczekujace;
    }

    public ArrayList<Karta> getWylozone() {
        return wylozone;
    }

    public void setWylozone(ArrayList<Karta> wylozone) {
        this.wylozone = wylozone;
    }
    public void dodaj(Karta karta){
        wylozone.add(karta);
    }

    public Karta getAktywna() {
        return aktywna;
    }

    public void setAktywna(Karta aktywna) {
        this.aktywna = aktywna;
    }

//    public ArrayList<Karta>[] wyciagniecieZOczekujacych(){
//        ArrayList<Karta>[] stosy = new ArrayList[2];
//        Karta wyciagnietaKarta =  oczekujace.get(0);
//        stosy[0] = wyciagnietaKarta;
//        stosy[1] = oczekujace.remove(wyciagnietaKarta);
//
//        return stosy;
//    }

}
