package com.company;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        Flet flet = new Flet();
        Fortepian fortepian = new Fortepian();
        Skrzypce skrzypce = new Skrzypce();

        orkiestra.add(flet);
        orkiestra.add(fortepian);
        orkiestra.add(skrzypce);
        orkiestra.add(flet);
        orkiestra.add(flet);

        flet.setProducent("muzykant");
        skrzypce.setProducent("muzykpol");
        fortepian.setProducent("muzyx");

        flet.setRokProdukcji(2020, 8,25);
        skrzypce.setRokProdukcji(2019, 11, 5);
        fortepian.setRokProdukcji(2021, 1, 20);


        for(int i=0; i<orkiestra.size(); i++)
        {
            orkiestra.get(i).dzwiek();
        }

        System.out.println(" ");

        System.out.println("Producent fletu to: " + flet.getProducent());
        System.out.println("Producent fortepianu to: " + fortepian.getProducent());
        System.out.println("Producent skrzypiec to: " + skrzypce.getProducent());

        System.out.println(" ");

        System.out.println("Rok produkcji fletu to: " + flet.getRokProdukcji());
        System.out.println("Rok produkcji skrzypiec to: " + skrzypce.getRokProdukcji());
        System.out.println("Rok produkcji fortepianu to: " + fortepian.getRokProdukcji());

        System.out.println(" ");

        System.out.println(skrzypce.getRokProdukcji().toString());
        System.out.println(flet.getProducent().equals(fortepian.getProducent()));

    }
}
