package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ////zadanie2
        Scanner obiekt = new Scanner(System.in);
        int n = obiekt.nextInt();
        while(n>=1 && n<=100){
            n = obiekt.nextInt();
        }
        int[] tab = new int[n];

        generuj(tab, n, 1000);
        ileNieparzystych(tab);
        ileParzystych(tab);
        ileMaxymalnych(tab);
        sumaDodatnich(tab);
        sumaUjemnych(tab);
        signum(tab);
        OdwrocFragment(tab, 2, 4);


    }

    public static void generuj(int tab[], int n, int max){
        Random rand = new Random();
        int znak;

        for(int i=0; i<n; i++){
            tab[i] = rand.nextInt(max);
            znak = rand.nextInt(2);
            if(znak==0) tab[i]*=-1;
        }
    }

    public static int ileNieparzystych(int tab[]){
        int nieparzyste =0;
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]%2 != 0) nieparzyste+=1;
        }
        return nieparzyste;
    }

    public static int ileParzystych(int tab[]){
        int parzyste =0;
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]%2 == 0) parzyste+=1;
        }
        return parzyste;
    }

    public static int ileDodatnich(int tab[]){
        int dodatnie =0;
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]>0) dodatnie+=1;
        }
        return dodatnie;
    }

    public static int ileUjemnych(int tab[]){
        int ujemne =0;
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]<0) ujemne+=1;
        }
        return ujemne;
    }

    public static int ileZerowych(int tab[]){
        int zerowe =0;
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]==0) zerowe+=1;
        }
        return zerowe;
    }

    public static int ileMaxymalnych(int tab[]){
        int ile_max =0;
        int max=tab[0];
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[i]>max) max=tab[i];
        }
        for(int i=0; i<dlugosc; i++){
            if(tab[dlugosc]==max) ile_max+=1;
        }
        return ile_max;
    }

    public static int sumaDodatnich(int tab[]){
        int dlugosc = tab.length;
        int suma=0;
        for(int i=0; i<dlugosc; i++){
            if(tab[i]>=0) suma+=tab[i];
        }
        return suma;
    }

    public static int sumaUjemnych(int tab[]){
        int dlugosc = tab.length;
        int suma=0;
        for(int i=0; i<dlugosc; i++){
            if(tab[i]<0) suma+=tab[i];
        }
        return suma;
    }

    public static void signum(int tab[]){
        int dlugosc = tab.length;
        for(int i=0; i<dlugosc; i++){
            if(tab[i]>=0) tab[i]=1;
            if(tab[i]<0) tab[i]=-1;
        }
    }

    public static void OdwrocFragment(int tab[], int lewy, int prawy){
        int dlugosc = tab.length;
        int[] pomoc = new int[dlugosc];

        if(lewy<=prawy && prawy<=dlugosc && lewy>=0) {
            
            for (int i = 0; i < dlugosc; i++) {
                if (i >= lewy && i <= prawy) {
                    pomoc[i] = tab[prawy - 1];
                } else
                    pomoc[i] = tab[i];
            }
            for (int i = 0; i < dlugosc; i++) {
                tab[i] = pomoc[i];
            }
        }
    }



}
