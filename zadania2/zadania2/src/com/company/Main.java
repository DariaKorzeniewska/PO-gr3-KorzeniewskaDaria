package com.company;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //zad1
        float[] a= new float[] {1,2,3,4,5,6,7};
        int n=7;
        //a
        float suma=0;
        for(int i=0; i<n; i++){
            suma=suma+a[i];
        }
        System.out.println(suma);

        //b
        float iloczyn=1;
        for(int i=0; i<n; i++){
            iloczyn=iloczyn*a[i];
        }
        System.out.println(iloczyn);

        //c
        float bsuma=0;
        for(int i=0; i<n; i++){
            if (a[i]>=0) {
                bsuma = bsuma + a[i];
            }
            else bsuma = bsuma + a[i]*(-1);
        }
        System.out.println(bsuma);

        //d
        double psuma=0;
        for(int i=0; i<n; i++){
            if (a[i]<0) {
                psuma += Math.sqrt(a[i]*(-1));
            }
            else psuma = psuma + Math.sqrt(a[i]);
        }
        System.out.println(psuma);

        //e
        float biloczyn=1;
        for(int i=0; i<n; i++){
            if (a[i]<0){
                biloczyn *= a[i]*(-1);
            }
            else biloczyn *= a[i];
        }
        System.out.println(biloczyn);

        //f
        float potega=0;
        for(int i=0; i<n; i++){
            potega += Math.pow(a[i],2);
        }
        System.out.println(potega);

        //g
        float sumag=0;
        float iloczyng=1;
        for(int i=0; i<n; i++){
            sumag += a[i];
            iloczyng *= a[i];
        }
        System.out.print(sumag);
        System.out.print(" ");
        System.out.println(iloczyng);

        //h
        float sumroz=0;
        for(int i=0; i<n; i++){
            if ((i+1)%2!=0){
                sumroz += a[i];
            }
            else sumroz -= a[i];
        }
        System.out.println(sumroz);

        //i
        float silnia=1;
        float rozsum=0;
        float zmienna=1;
        for(int i=0; i<n; i++){
            if (i%2!=0){
                zmienna=-1;
            }


            silnia*=(i+1);
        }


        //zad2
        Scanner obiekt = new Scanner(System.in);
        n = obiekt.nextInt();
        int a1 = 1;
        int[] tab = new int[n];
        int[] tab1 = new int[n];

        //wzor an = a1 + (n-1)*r
        for(int i=0; i<n; i++){
            tab[i] = a1 + (n-1)*2;
        }
        tab1[n-1]=tab[0];
        for(int i=0; i<n; i++){
            tab1[i] = tab[i+1];
        }
        

    }
}
