package edu.ib;

import javafx.scene.image.ImageView;

public class Karta {
    /*
    okresla wlasciwosci karty - kolor i range
     */
    private String kolor;
    private String ranga;
    private ImageView obrazek;

    public Karta() {

    }

    public ImageView getObrazek() {
        return obrazek;
    }

    public Karta(String kolor, String ranga, ImageView obrazek) {
        this.kolor = kolor;
        this.ranga = ranga;
        this.obrazek = obrazek;
    }
    public String getKolor() {
        return kolor;
    }

    public String getRanga() {
        return ranga;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setRanga(String ranga) {
        this.ranga = ranga;
    }

    public void setObrazek(ImageView obrazek) {
        this.obrazek = obrazek;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "kolor='" + kolor + '\'' +
                ", ranga='" + ranga + '\'' +
                '}';
    }
}
