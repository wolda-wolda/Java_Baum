package com.wolda.Baum;

import com.wolda.Obst.Apfel;
import com.wolda.Obst.Birne;
import com.wolda.Obst.Obst;

import java.util.ArrayList;
import java.util.Random;

abstract public class ObstBaum extends Baum {
    private int typ;
    private int maxErtrag;
    private boolean voll = false;
    private String gattung;
    private ArrayList<Obst> obst = new ArrayList<>();

    public ObstBaum(int alter, int maxErtrag) {
        super(alter);
        this.maxErtrag = maxErtrag;
    }

    @Override
    public boolean giessen() {
        Random random = new Random();
        int rand = random.nextInt(4) + 2;
        if (rand > maxErtrag - getObst().size()) {
            rand = maxErtrag - getObst().size();
            voll = true;
        }
        for (int i = 0; i < rand; i++) {
            if (obst.size() == maxErtrag) {
                break;
            }
            addObst(typ);
        }
        if (typ == 0) {
            gattung = " Apfel";
        } else {
            gattung = " Birne";
        }
        if (voll) {
            System.out.println("Baum ist voll, es sind " + rand + gattung + " gewachsen und " + obst.size() + " befinden sich auf dem Baum");
        } else {
            System.out.println("Der Baum wurde gegossen, es sind " + rand + gattung + " gewachsen und " + obst.size() + " befinden sich auf dem Baum");
        }
        return voll;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    private void addObst(int gattung) {
        if (gattung == 0) {
            obst.add(new Apfel(gattung));
        } else {
            obst.add(new Birne(gattung));
        }
    }

    public Obst removeObst() {
        if (obst.size() == 0) {
            System.out.println("Kein Obst mehr auf dem Baum");
            return null;
        }
        Obst temp = obst.get(0);
        obst.remove(0);
        return temp;
    }

    public ArrayList getObst() {
        return obst;
    }
}
