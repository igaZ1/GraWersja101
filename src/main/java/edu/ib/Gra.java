package edu.ib;

public class Gra {
    /*
    okresla jakie ruchy sa dostepne
    gracza maja karty stol tez ma karty

        metoda ruchu



        metoda która okresla co moze gracz wykonac
            reguly gry czyli zgodnosc, osemki, kolory, liczba
            co ten ruch robi czyli usuwanie i dodawanie do miejsc stosownych

        metoda zwyciestwa


    okresla kto teraz rozgrywa
     */

    public static Karta [] zagranie(Karta aktywna, Karta kartaGracza, boolean  czyZagranoKarta){
//        Karta kartaGracza = gamer.getKarty().get(0);
//        ImageView k = kartaGracza.getObrazek();
//        k.setFitHeight(90);
//        k.setFitWidth(90);
        Karta [] Kar = new Karta[2];
        boolean czyMozna=false;
        if (czyZagranoKarta==false) {
            if (kartaGracza.getKolor().equals(aktywna.getKolor())) {
                Kar[0] = kartaGracza;
                Kar[1] = aktywna;

                return Kar;
            } else if (kartaGracza.getRanga().equals(aktywna.getRanga())) {
                Kar[0] = kartaGracza;
                Kar[1] = aktywna;

                return Kar;

            } else if (kartaGracza.getRanga().equals("eight")) {   //8 można zawsze dać
                Kar[0] = kartaGracza;
                Kar[1] = aktywna;

                return Kar;

            } else {
                Kar[0] = aktywna;
                Kar[1] = null;
                System.out.println("Zła karta.");
                //To do usuniecia:

                return Kar;
            }
        }else {
            System.out.println("Druga karta");
            String rangaAktywnej = aktywna.getRanga();
            String rangaKartyGracza = kartaGracza.getRanga();
            String kolorAktywnej = aktywna.getKolor();
            String kolorKartyGracza = kartaGracza.getKolor();
            String[] Rangi = {
                    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
            String[] Kolory =  {"clubs", "hearts", "spades", "diamonds"};

            int indexRangiKartyGracza =-1;
            int indexRangiAktywnej = -1;
            int indexKoloruKartyGracza =-1;
            int indexKoloruAktywnej = -1;

            if (kartaGracza.getRanga().equals("eight")) {   //8 można zawsze dać
                Kar[0] = kartaGracza;
                Kar[1] = aktywna;

                czyMozna = true;

            } else if (kartaGracza.getKolor().equals(aktywna.getKolor())) {
                for (int i=0; i<Rangi.length; i++){
                    if (rangaKartyGracza == Rangi[i]){
                        indexRangiKartyGracza = i;
                    }
                    if (rangaAktywnej == Rangi[i]){
                        indexRangiAktywnej = i;
                    }
                }

                //zgadza się klorami więc teraz sprawdzam czy zgadza się rangą
                if (Math.abs(indexRangiAktywnej-indexRangiKartyGracza)<=1) {
                    czyMozna = true;
                }



            } else if (kartaGracza.getRanga().equals(aktywna.getRanga())) {
                for (int i=0; i<Rangi.length; i++){
                    if (kolorKartyGracza == Kolory[i]){
                        indexKoloruKartyGracza = i;
                    }
                    if (kolorAktywnej == Kolory[i]){
                        indexKoloruAktywnej = i;
                    }
                }

                //zgadza się rangą więc teraz sprawdzam czy zgadza się kolorem
                if (Math.abs(indexKoloruKartyGracza-indexKoloruAktywnej)<=1) {
                    czyMozna = true;
                }

            } else {
                czyMozna=false;
            }


            if (czyMozna==false){
                Kar[0] = aktywna;
                Kar[1] = null;
                System.out.println("Zła karta.");
                //To do usuniecia:

                return Kar;
            } else {
                Kar[0] = kartaGracza;
                Kar[1] = aktywna;

                return Kar;
            }


        }

    }


//    public static Gracz zagrajKarta(Gracz g1, Karta karta, Stol stol){   //usuwa karte z reki i dodaje jako aktywna.
//        ArrayList<Karta> r1 = g1.getKarty();
//        int id =-1;
//        for (int i=0; i<r1.size(); i++) {
//            if (karta.sameKarta(r1.get(i)))     //sprawdza czy w rece jest taka karta jak podana
//                id = i;   //id karty w rece;
//        }
//
//        String kKolor = karta.getKolor();
//        String kRanga = karta.getRanga();
//
//        String aktRanga = stol.getAktywna().getRanga();
//        String aktKolor = stol.getAktywna().getKolor();
//
//        boolean w = false;
//        if (kKolor.equals(aktKolor)) w=true;
//        else if(kRanga.equals(aktRanga)) w = true;
//
//
//        if (id!=-1 && w==true) {
//            ArrayList<Karta> wylozone = stol.getWylozone();
//            wylozone.add(karta);
//            stol.setWylozone(wylozone);
//            stol.setAktywna(karta);
//            r1.remove(id);
//            g1.setKarty(r1);
//            return g1;
//        } else if (w==false){
//            System.out.println("Wbrew zasadom.");
//            return g1;
//        } else {
//            System.out.println("Brak takiej karty w rece");
//            return g1;
//        }
//
//    }
//
//    public static Gracz dobierzKarte(Gracz g1, Karta k, Stol stol){
//        ArrayList<Karta> r1 = g1.getKarty();
//        ArrayList<Karta> oczekujace = stol.getOczekujace();
//        int ile = oczekujace.size();
//        r1.add(oczekujace.get(ile-1));
//        oczekujace.remove(ile-1);
//        g1.setKarty(r1);
//        stol.setOczekujace(oczekujace);
//        return g1;
//    }
//
//    public static Stol uzupelnij(Stol stol){
//        ArrayList<Karta> wyl = stol.getWylozone();
//        Karta akt = stol.getAktywna();
//        ArrayList<Karta> oczekujace = stol.getOczekujace();
//
//        for (int i =0; i<wyl.size(); i++){
//            oczekujace.add(wyl.get(i));
//        }
//
//
//        ArrayList<Karta> noweWyl = new ArrayList<>();
//        noweWyl.add(akt);
//
//        DystrybucjaKart.tasowansko(oczekujace);
//
//        stol.setOczekujace(oczekujace);
//        stol.setAktywna(akt);
//        stol.setWylozone(noweWyl);
//
//        return stol;
//
//    }


}
