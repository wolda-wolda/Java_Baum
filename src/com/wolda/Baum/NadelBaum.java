package com.wolda.Baum;

import java.util.Random;

public class NadelBaum extends Baum {
    private static int anzahl = 0;
    private double hoehe;
    private boolean exists=true;

    public NadelBaum(int alter, double hoehe) {
        super(alter);
        anzahl++;
        this.hoehe = hoehe;
        System.out.println("Ein Nadelbaum wurde gepflanzt");
    }

    public boolean giessen() {
        if (exists){
            Random random = new Random();
            double tmp = random.nextDouble() * random.nextInt(2) + 1;
            hoehe += tmp;
            System.out.print("Der Baum gegossen und ist um " + tmp + " Meter gewachsen und ist jetzt ");
            System.out.printf("%.2f Meter\n", hoehe);
        }
        return false;
    }

    @Override
    public void getInfo() {
        if (exists){
            System.out.println("Anzahl aller Nadelbaeume: " + anzahl + " das Alter: " + super.getAlter() + " die Hoehe: " + hoehe);
        }
    }

    public void setAnzahl(int anzahl) {
        NadelBaum.anzahl += anzahl;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
