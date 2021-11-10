package com.company;
import java.util.Scanner;
import java.lang.StringBuffer;


public class Main {

    public static void main(String[] args) {
	    String napis = "napis do zestawu zadan numer 4 do jutra";
        char c = 'n';
        String subnapis = "do";
        String napis2 = "middle";

        System.out.println(countChar(napis,c));
        System.out.println(countSubStr(napis,subnapis));
        System.out.println(middle(napis2));
        System.out.println(repeat(subnapis, 7));

        System.out.println(" ");
        int[] tab = where(napis,subnapis).clone();
        for(int i=0;i<where(napis,subnapis).length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println(" ");
        String liczba = "10000000";
        System.out.println(nice(liczba));
        System.out.println(nice2(liczba,6,'.'));

    }

    public static int countChar(String str, char c){
        int size = str.length();
        int znak=0;
        for(int i=0; i<size; i++){
            if(str.charAt(i)==c) znak+=1;
        }
        return znak;
    }

    public static int countSubStr(String str, String substr){
        int size = str.length();
        int sizeB = substr.length();
        int tak = 0;
        int ile = 0;

        for(int i=0;i<size;i++){
            if(str.charAt(i)==substr.charAt(0)){
                for(int j=0;j<sizeB;j++){
                    if(str.charAt(i+j)==substr.charAt(j)) tak+=1;
                }
                if(tak==sizeB) ile+=1;
                tak=0;
            }
        }
        return ile;
    }

    public static String middle(String str){
        StringBuffer Buf = new StringBuffer();
        int size= str.length();

        if(size%2==0){
            Buf.append(str.charAt(size/2 - 1));
            Buf.append(str.charAt(size/2));
        }
        else{
            Buf.append(str.charAt(size));
        }
        return Buf.toString();
    }

    public static String repeat(String str, int n){
        StringBuffer Buf = new StringBuffer();
        for(int i=0;i<=n;i++){
            Buf.append(str);
        }
        return Buf.toString();
    }

    public static int[] where(String str, String substr){
        StringBuffer Buf = new StringBuffer();
        int size = str.length();
        int sizeB = substr.length();
        int tak = 0;
        String gdzie;

        for(int i=0;i<size;i++){
            if(str.charAt(i)==substr.charAt(0)){
                for(int j=0;j<sizeB;j++){
                    if(str.charAt(i+j)==substr.charAt(j)) tak+=1;
                }
                gdzie = String.valueOf(i);
                if(tak==sizeB) Buf.append(gdzie);
                tak=0;
            }
        }
        int[] tab = new int[Buf.length()];
        int i=0;
        int do_tablicy = 0;
        while(Buf.isEmpty()){
            do_tablicy=0;
            do_tablicy= Integer.valueOf(Buf.charAt(i));
            tab[i]=do_tablicy;
        }
        return tab;
    }

    public static String change(String str){
        StringBuffer Buf = new StringBuffer();
        int size = str.length();
        for(int i=0;i<size;i++){
            if(Character.isUpperCase(str.charAt(i))){
                Buf.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                Buf.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return Buf.toString();
    }

    public static String nice(String str){
        StringBuffer Buf = new StringBuffer();
        int size = str.length();
        int trzy =1;
        for(int i=0;i<size;i++){
            Buf.append(str.charAt(size-1-i));
            if(trzy==3) {
                Buf.append("'");
                trzy=0;
            }
            trzy+=1;
        }
        Buf.reverse();
        return Buf.toString();
    }

    public static String nice2(String str, int a, char c){
        StringBuffer Buf = new StringBuffer();
        int size = str.length();
        int ile =1;
        for(int i=0;i<size;i++){
            Buf.append(str.charAt(size-1-i));
            if(ile==a) {
                Buf.append(String.valueOf(c));
                ile=0;
            }
            ile+=1;
        }
        Buf.reverse();
        return Buf.toString();
    }


}
