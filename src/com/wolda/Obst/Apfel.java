package com.wolda.Obst;

public class Apfel extends Obst {
    private final int susgrad=3;
    public Apfel(int gattung) {
        super(gattung);
    }

    public int getSusgrad() {
        return susgrad;
    }
}
