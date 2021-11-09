package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obiekt = new Scanner(System.in);

        int n=0;
        while (n<1 || n >100){
            System.out.println("Podaj liczbe naturalna: ");
            n = obiekt.nextInt();
        }
        int[] tablica = new int[n];
        int liczba=0;

        Random r = new Random();


        for(int i=0; i<n; i++){
            tablica[i] = r.nextInt(1000);
            liczba = r.nextInt(2);
            if(liczba==1) tablica[i]*=(-1);
            System.out.print(tablica[i] + " " );
        }


        //zad1a
        int p=0;
        int np=0;

        for(int i=0; i<n; i++){
            if(tablica[i]%2==0) p+=1;
            else np+=1;
        }
        System.out.println(" ");
        System.out.println("parzyste:" + p + " nieparzyste:" + np);

        //zad1b
        int uj=0;
        int dod=0;
        int zerow=0;

        for(int i=0; i<n; i++){
            if(tablica[i]<0) uj+=1;
            if(tablica[i]>0) dod+=1;
            if(tablica[i]==0) zerow+=1;
        }

        //zad1c
        int max=tablica[0];
        int ileMax=0;

        for(int i=1; i<n; i++){
            if(tablica[i]>max) max=tablica[i];
        }
        for(int i=0; i<n; i++){
            if(tablica[i]==max) ileMax+=1;
        }
        System.out.println("max="+max+" ile max="+ileMax);

        //zad1d
        int sumaD=0;
        int sumaU=0;

        for(int i=0; i<n; i++){
            if(tablica[i]<0) sumaU+=tablica[i];
            else sumaD+=tablica[i];
        }
        System.out.println("Suma Dodatnich="+sumaD+" Suma ujemnych="+sumaU);

        //zad1e
        int wonsz=0;
        int tym=0;

        for(int i=0; i<n; i++){
            if(tablica[i]>=0) {
                tym+=1;
            }
            else {
                if(tym>wonsz){
                    wonsz=tym;
                    tym=0;
                }
                tym=0;
            }
        }
        System.out.println("wonsz="+wonsz);

        //zad1f

        int[] tablicak = new int[n];
        for(int i=0; i<n; i++){
            tablicak[i]=tablica[i];
        }

        for(int i=0; i<n; i++){
            if(tablicak[i]<0) tablicak[i]=-1;
            else tablicak[i]=1;
            System.out.print(tablicak[i]+" ");
        }
        System.out.println(" ");

        //zad1g

        System.out.println("Podaj zakres prawy:");
        int prawy = obiekt.nextInt();
        System.out.println("Podaj zakres lewy:");
        int lewy = obiekt.nextInt();

        while(prawy>=0 && prawy<n){
            System.out.println("prawy zakres poza tablicą");
            prawy = obiekt.nextInt();
        }
        while(lewy>=0 && lewy<n){
            System.out.println("Lewy zakres poza tablicą");
            lewy = obiekt.nextInt();
        }
         int[] tabg = new int[n];

        for(int i=0; i<n; i++){
            if(i>=lewy && i<=prawy){
                tabg[i] = tablica[prawy-i];
            }
            else
                tabg[i] = tablica[i];
        }




    }
}
