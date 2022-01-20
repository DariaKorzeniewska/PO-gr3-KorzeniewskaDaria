package com.company;
import java.util.Collections;
import java.util.LinkedList;

public class Main {


    public static <String >void redukuj(LinkedList<String> pracownicy, int n)
    {

        for(int i=n-1; i<pracownicy.size(); i+=(n-1))
        {
            pracownicy.remove(i);
        }

    }
    public static <String> void odwroc(LinkedList<String> lista)
    {

        Collections.reverse(lista);

    }



    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<String>();
        pracownicy.add("Kowalski");
        pracownicy.add("Nowak");
        pracownicy.add("Kowal");
        pracownicy.add("Tak");
        pracownicy.add("Kot");
        pracownicy.add("Dabrowski");
        pracownicy.add("Grabowski");

        System.out.println("\npracownicy: \n" + pracownicy);
        redukuj(pracownicy,2);
        System.out.println("\npracownicy po redukcji: \n" + pracownicy);
        odwroc(pracownicy);
        System.out.println("\npracownicy po odwroceniu: \n" + pracownicy);


    }
}
