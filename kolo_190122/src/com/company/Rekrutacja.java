package com.company;

import java.util.ArrayList;

public class Rekrutacja {
    static int doswiadczenie;
    private ArrayList<Kandydet> kandy;

    public Rekrutacja(ArrayList<Kandydet> kandy){
        this.kandy = kandy;
    }

    public void set() {
        doswiadczenie = 2;
    }
}
