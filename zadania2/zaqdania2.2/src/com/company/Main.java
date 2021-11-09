package com.company;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        //zadanie1
	    Scanner obiekt = new Scanner(System.in);
        int n = obiekt.nextInt();
        int[] tablica = new int[n];

        for(int i=0; i<n; i++){
            tablica[i] = obiekt.nextInt();
        }
        int count = 0;

        //a
        for(int i=0; i<n; i++){
            if(tablica[i]%2 != 0) count+=1;
        }
        System.out.println("A->"+count);

        //b
        count=0;
        for(int i=0; i<n; i++){
            if(tablica[i]%3 == 0 && tablica[i]%5 == 0) count+=1;
        }
        System.out.println("B->"+count);

        //c
        count=0;
        for(int i=0; i<n; i++){
            if(Math.sqrt(tablica[i])%2 == 0) count+=1;
        }
        System.out.println("C->"+count);

        //d
        count=0;
        for(int i=2; i<n; i++){
            if(tablica[i] < (tablica[i-1]+tablica[i+1])/2) count+=1;
        }
        System.out.println("D->"+count);

        //e
        count=0;
        int silnia=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                silnia*=tablica[i];
                if (Math.pow(2, i) < tablica[i] && tablica[i] < silnia) count+=1;
            }
        }
        System.out.println("E->"+count);

        //f
        count=0;
        for(int i=0; i<n; i++){
            if((i+1)%2 != 0 && tablica[i]%2 == 0) count+=1;
        }
        System.out.println("F->"+count);

        //g
        count=0;
        for(int i=0; i<n; i++){
            if(tablica[i]%2 != 0 && tablica[i]>=0) count+=1;
        }
        System.out.println("G->"+count);

        //h
        count=0;
        int zmienna=0;
        for(int i=0; i<n; i++){
            zmienna = tablica[i];
            if(tablica[i]<0) zmienna*=-1;
            if(zmienna < Math.pow(i,2)) count+=1;
        }
        System.out.println("H->"+count);


        ////zadanie2
        n = obiekt.nextInt();
        int[] tab = new int[n];
        for(int i=0; i<n; i++){
            tab[i] = obiekt.nextInt();
        }
        int suma_podw = 0;
        for(int i=0; i<n; i++){
            if(tab[i]>=0) suma_podw+=tab[i]*2;
            }
        System.out.println("Zadanie2->"+suma_podw);

        ////zadanie3
        n = obiekt.nextInt();
        int[] tab3 = new int[n];
        for(int i=0; i<n; i++){
            tab3[i] = obiekt.nextInt();
        }
        int ujemne=0;
        int dodatnie=0;
        int zera=0;

        for(int i=0; i<n; i++){
            if(tab3[i]<0) ujemne+=1;
            if(tab3[i]>0) dodatnie+=1;
            if(tab3[i]==0) zera+=1;
        }
        System.out.println("Ujemne->"+ujemne+" Dodatnie->"+dodatnie+" Zera->"+zera);

        ////zadanie4

        n = obiekt.nextInt();
        int[] tab4 = new int[n];
        for(int i=0; i<n; i++){
            tab4[i] = obiekt.nextInt();
        }
        int najw=tab4[0];
        int najm=tab4[0];
        for(int i=0; i<n; i++){
            if(tab4[i]>najw) najw=tab4[i];
            if(tab4[i]<najm) najm=tab4[i];
        }
        System.out.println("Najwieksza->"+najw+" Najmniejsza->"+najm);

        ////zadanie5

        n = obiekt.nextInt();
        int[] tab5 = new int[n];
        for(int i=0; i<n; i++){
            tab5[i] = obiekt.nextInt();
        }
        System.out.println("Pary:");
        for(int i=0; i<n-1; i++){
            if(tab5[i]>0 && tab5[i+1]>0) System.out.println("("+tab5[i]+","+tab5[i]+")  ");
        }

    }
}
