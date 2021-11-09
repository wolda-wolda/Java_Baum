package com.wolda;

import com.wolda.Baum.NadelBaum;
import com.wolda.Baum.ObstBaum;
import com.wolda.Items.Holz;
import com.wolda.Items.Items;
import com.wolda.Items.Korb;
import com.wolda.Obst.Obst;

import java.util.ArrayList;
import java.util.Objects;

public class Bauer {
    private ArrayList<Obst> hand = new ArrayList<>();
    private ArrayList<Items> items = new ArrayList<>();
    private boolean baumLeer = false;
    private int maxSize=2;

    public boolean pfluecken(ObstBaum baum) {
        if (hand.size() < maxSize) {
            Obst returned_obst = baum.removeObst();
            if (returned_obst != null) {
                hand.add(returned_obst);
                if (returned_obst.getGattung() == 0) {
                    System.out.println("Apfel wurde gepflueckt");
                } else {
                    System.out.println("Birne wurde gepflueckt");
                }
            }else{
                return true;
            }
        } else {
            for (int i = 0; i <= hand.size(); i++) {
                ablegen("NULL");
            }
        }
        return baumLeer;
    }

    public void ablegen(String gattung) {
        Obst obst;
        if (Objects.equals(gattung, "Apfel")){
           obst = hand.get(0);
           if(obst.getGattung()==0){
               hand.remove(0);
           }else{
               hand.remove(1);
           }
            System.out.println("Eine Apfel wurde abgelegt");
        }else if(Objects.equals(gattung,"Birne")){
            obst = hand.get(0);
            if(obst.getGattung()==1){
                hand.remove(0);
            }else{
                hand.remove(1);
            }
            System.out.println("Ein Birne wurde abgelegt");
        }else{
            if (hand.size() > 0) {
                obst = hand.get(0);
                hand.remove(0);
                if (obst.getGattung() == 0) {
                    System.out.println("Eine Apfel wurde abgelegt");
                } else {
                    System.out.println("Ein Birne wurde abgelegt");
                }
            } else {
                System.out.println("Keine Obst in der Hand");
            }
        }
    }

    public void printInfo() {
        if(hand.size() > 0) {
            System.out.println("Obst in den Händen:");
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getGattung() == 0) {
                    System.out.print("Apfel in der Hand mit SusGrad " + hand.get(i).getSusgrad());
                } else {
                    System.out.println("Birne in der Hand");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nichs in der Hand");
        }
    }
    public void baumfaellen(NadelBaum nadelBaum){
        nadelBaum.setAnzahl(-1);
        nadelBaum.setExists(false);
        System.out.println("Baum wurde gefällt");
        items.add(new Holz());
    }
    public void createKorb(){
        if (items.get(0).getTyp()==0){
            items.remove(0);
            items.add(new Korb());
            this.maxSize=20;
            System.out.println("Du besitzt jetzt einen Korb");
        }else{
            System.out.println("Du besitzt kein Holz");
        }
    }
}
