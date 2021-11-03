package com.company;
import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuffer;

public class Main {

    public static void main(String[] args) {
	///////////////////// zadanie1

        Scanner obiekt = new Scanner(System.in);
        int n = obiekt.nextInt();
        int[] tab = new int[n];

        Random r = new Random();

        for(int i=0; i<n; i++) {
            int rand = r.nextInt(10 - 1) + 1;
            tab[i] = rand;
            System.out.print(tab[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

        showPrimes(tab, n);

        /////////////////zadanie2

        int n1 = obiekt.nextInt();
        int[] tab1 = new int[n1];

        for(int i=0; i<n1; i++){
            int randd = r.nextInt(50 - 1) + 1;
            int randdd = r.nextInt(3-1) + 1;
            if(randdd==1) randd*=-1;
            tab1[i] = randd;
            System.out.print(tab1[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

        int max = tab1[0];
        for(int i=1; i<n1; i++){
            if(tab1[i]>max) max=tab1[i];
        }

        int counter=0;
        for(int i=0; i<n1; i++){
            if(tab1[i]==max) counter+=1;
        }

        System.out.println("Najwiekszy element to: ");
        System.out.println(max);
        System.out.println("Wystepuje tyle razy:");
        System.out.println(counter);
        System.out.println(" ");
        //////////////////////////////////////////

        //////////////////zadanie3

        String str = "ala ma kota";
        char c = 'a';

        System.out.println(delete(str,c));
        }

        //////////////////////zadanie1
        public static void showPrimes(int[] tab, int list) {
            for(int i=0; i<list; i++){
                if(tab[i]==1 || tab[i]==3 || tab[i]==5 || tab[i]==7) {
                    System.out.print(tab[i]);
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

        /////////////////zadanie3

        public static String delete(String str, char c){
        int dlugosc = str.length();
        StringBuffer Buf = new StringBuffer();
        char a = ' ';

        for(int i=0; i<dlugosc; i++){
            if(str.charAt(i)==c && i!=0) Buf.append(a);
            else
                Buf.append(str.charAt(i));
        }

        return Buf.toString();
        }

    }

