package com.wolda.Baum;

public class BirnenBaum extends ObstBaum {
    private static int anzahl = 0;

    public BirnenBaum(int alter, int maxErtrag) {
        super(alter, maxErtrag);
        super.setTyp(1);
        anzahl++;
        System.out.println("Ein Birnebaum wurde gepflanzt");
    }

    @Override
    public void getInfo() {
        System.out.println("Anzahl aller Birnenbaeume: " + anzahl+ " deren Alter: " + super.getAlter()+ " deren Fruechteanzahl: " + super.getObst().size());
    }
}
