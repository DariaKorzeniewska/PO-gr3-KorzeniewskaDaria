package com.company;

import java.lang.Cloneable;
import java.lang.Comparable;
import java.time.LocalDate;

public class Kandydet implements Cloneable, Comparable<Kandydet> {
    private String nazwa;
    private int wiek;
    private String licencjat;
    private String mistrzowie;
    private String[] wyksztalcony;
    private int lata_doswiadczenia;

    public Kandydet(String nazwa, int wiek, String[] wyksztalcony, int lata_doswiadczenia){
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.lata_doswiadczenia = lata_doswiadczenia;

        this.licencjat = licencjat;
        this.mistrzowie = mistrzowie;

        this.wyksztalcony[0] = this.licencjat;
        this.wyksztalcony[1] = this.mistrzowie;
    }

    public String get_nazwa(){
        return nazwa;
    }

    public int getWiek(){
        return wiek;
    }

    public String[] get_wyksztalcony(){
        return wyksztalcony;
    }

    public int getLata_doswiadczenia(){
        return lata_doswiadczenia;
    }

    @Override
    public int compareTo(Kandydet a){
        if(this.wyksztalcony[0].compareTo(a.wyksztalcony[0])==1){
            if(this.wyksztalcony[1].compareTo(a.wyksztalcony[1])==1){
                if(String.valueOf(this.wiek).compareTo(String.valueOf(a.wiek))==1){
                    if(String.valueOf(this.lata_doswiadczenia).compareTo(String.valueOf(a.lata_doswiadczenia))==1){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }




}
