package com.company;


public class Main {

    public static void main(String[] args) {
	RachunekBankowy rachunek1 = new RachunekBankowy(2000.00);
    RachunekBankowy rachunek2 = new RachunekBankowy(3000.00);

    rachunek1.setRocznaStopaProcentowa(0.04);
    rachunek2.setRocznaStopaProcentowa(0.04);

    System.out.println(rachunek1.obliczMiesieczneOdsetki());
    System.out.println(rachunek2.obliczMiesieczneOdsetki());

    System.out.println(rachunek1.wypiszSaldo());
    System.out.println(rachunek2.wypiszSaldo());

    rachunek1.setRocznaStopaProcentowa(0.05);
    rachunek2.setRocznaStopaProcentowa(0.05);

    System.out.println(rachunek1.obliczMiesieczneOdsetki());
    System.out.println(rachunek2.obliczMiesieczneOdsetki());

    System.out.println(rachunek1.wypiszSaldo());
    System.out.println(rachunek2.wypiszSaldo());


    }
}


