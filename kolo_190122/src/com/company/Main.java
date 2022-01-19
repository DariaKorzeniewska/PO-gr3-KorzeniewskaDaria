package com.company;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String[] N = new String[2];
        N[0] = "Licencjat";
        N[1] = "Humanistyczne";

        String[] M = new String[2];
        M[0] = "Inżynierka";
        M[1] = "Matematyczne";

        Kandydet Natalia = new Kandydet("Natalia", 23, N, 1);
        Kandydet Klaudia = new Kandydet("Klaudia", 30, N, 3);
        Kandydet Monica = new Kandydet("Monica", 25, M, 2);
        Kandydet Joanna = new Kandydet("Joanna", 25, N, 2);

        ArrayList<Kandydet> grupa = new ArrayList<Kandydet>();
        grupa.add(Natalia);
        grupa.add(Klaudia);
        grupa.add(Monica);
        grupa.add(Joanna);

        for(int i=0; i<4; i++){
            Kandydet a = grupa.get(i);
            System.out.println(a.get_nazwa());
            System.out.println(a.getWiek());
            System.out.println(a.get_wyksztalcony()[0]);
            System.out.println(a.get_wyksztalcony()[1]);
            System.out.println(a.getLata_doswiadczenia());
        }

        //grupa.sort();
        for(int i=0; i<4; i++){
            Kandydet a = grupa.get(i);
            System.out.println(a.get_nazwa());
            System.out.println(a.getWiek());
            System.out.println(a.get_wyksztalcony()[0]);
            System.out.println(a.get_wyksztalcony()[1]);
            System.out.println(a.getLata_doswiadczenia());
        }






    }
}
