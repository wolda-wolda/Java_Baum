package com.wolda.Baum;

public class ApfelBaum extends ObstBaum {
    private static int anzahl = 0;

    public ApfelBaum(int alter, int maxErtrag) {
        super(alter, maxErtrag);
        super.setTyp(0);
        anzahl++;
        System.out.println("Ein Apfelbaum wurde gepflanzt");
    }

    @Override
    public void getInfo() {
        System.out.println("Anzahl aller Apfelbaeume: " + anzahl+ " deren Alter: " + super.getAlter()+ " deren Fruechteanzahl: " + super.getObst().size());
    }
}
