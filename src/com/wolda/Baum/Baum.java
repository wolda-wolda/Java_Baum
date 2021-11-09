package com.wolda.Baum;

abstract public class Baum {
    private int alter;

    public Baum(int alter) {
        this.alter = alter;
    }

    public abstract boolean giessen();

    public abstract void getInfo();

    public int getAlter() {
        return alter;
    }
}
