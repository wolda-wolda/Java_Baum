package com.wolda.Obst;

public class Birne extends Obst {

    public Birne(int gattung) {
        super(gattung);
    }

    public void getInfo(){
        System.out.println("Eigenschaften: leuchtet im Dunkel Leutkraft: sehr hell, Stromverbrauch: keine Ahnung");
    }
}
