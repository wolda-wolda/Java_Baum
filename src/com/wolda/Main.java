package com.wolda;

import com.wolda.Baum.ApfelBaum;
import com.wolda.Baum.Baum;
import com.wolda.Baum.BirnenBaum;
import com.wolda.Baum.NadelBaum;
import com.wolda.Obst.Apfel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bauer bauer = new Bauer();
        ApfelBaum apfelbaum = new ApfelBaum(2, 10);
        ApfelBaum apfelbaum1 = new ApfelBaum(5, 20);
        BirnenBaum birnenbaum = new BirnenBaum(4, 12);

        apfelbaum.getInfo();
        apfelbaum1.getInfo();
        birnenbaum.getInfo();

        NadelBaum badelnaum = new NadelBaum(3, 1.5);

        bauer.pfluecken(apfelbaum);
        bauer.printInfo();

        apfelbaum.giessen();
        apfelbaum1.giessen();
        birnenbaum.giessen();
        badelnaum.giessen();

        apfelbaum.getInfo();
        apfelbaum1.getInfo();
        birnenbaum.getInfo();
        badelnaum.getInfo();

        while (!bauer.pfluecken(apfelbaum)){
        }
        System.out.println("Fertig mit plücken");

        boolean stay = true;
        ArrayList<Baum> baume = new ArrayList<>();
        baume.add(apfelbaum);
        baume.add(apfelbaum1);
        System.out.println("Hoi woldi von eli, Hoi eli");
        baume.add(birnenbaum);
        baume.add(badelnaum);

        while (stay) {
            for (Baum baum : baume) {
                if (baum.giessen()) {
                    stay = false;
                    break;
                }
            }
        }
        for (int j = 0; j < 2; j++) {
            bauer.ablegen("");
        }
        bauer.pfluecken(apfelbaum);
        bauer.pfluecken(birnenbaum);
        bauer.printInfo();
        bauer.ablegen("Birne");
        bauer.baumfaellen(badelnaum);
        badelnaum.getInfo();

        while (!bauer.pfluecken(apfelbaum1)){
        }
        apfelbaum.getInfo();
        badelnaum.getInfo();
        birnenbaum.getInfo();
    }
}
