package com.company;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(" ");
        ArrayList<Integer> c = append(a,b);
        int size = b.size()+a.size();
        for(int i=0; i<size; i++){
            System.out.print(c.get(i) +" ");
        }
        System.out.println(" ");

        System.out.println(" ");
        ArrayList<Integer> d = merge(a,b);
        size = b.size()+a.size();
        for(int i=0; i<size; i++){
            System.out.print(d.get(i) +" ");
        }
        System.out.println(" ");

        System.out.println(" ");
        ArrayList<Integer> e = mergeSorted(a,b);
        size = b.size()+a.size();
        for(int i=0; i<size; i++){
            System.out.print(e.get(i) +" ");
        }
        System.out.println(" ");

        System.out.println(" ");
        ArrayList<Integer> f = reversed(a);
        size = a.size();
        for(int i=0; i<size; i++){
            System.out.print(f.get(i) +" ");
        }
        System.out.println(" ");

        System.out.println(" ");
        ArrayList<Integer> g = reversed2(a);
        size = g.size();
        for(int i=0; i<size; i++){
            System.out.print(g.get(i) +" ");
        }
        System.out.println(" ");

        System.out.println(" ");
        reverse(b);
        size = b.size();
        for(int i=0; i<size; i++){
            System.out.print(b.get(i) +" ");
        }
        System.out.println(" ");

    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        int size = a.size();
        c.addAll(0,a);
        c.addAll(size,b);
        return c;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> big = new ArrayList<Integer>();
        ArrayList<Integer> small = new ArrayList<Integer>();
        int size=0;
        if(a.size()>b.size()){
            big.addAll(a);
            small.addAll(b);
            size=small.size();
        }
        else{
            big.addAll(b);
            small.addAll(a);
            size=small.size();
        }
        int i=0;
        for(i=0; i<size;i++){
            c.add(small.get(i));
            c.add(big.get(i));
        }

        while(i<big.size()){
            c.add(big.get(i));
            i+=1;
        }
        return c;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = append(a,b);
        Collections.sort(c);
        return c;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int size = a.size();
        for(int i=size-1; i>=0; i--){
            lista.add(a.get(i));
        }
        return lista;
    }

    public static ArrayList<Integer> reversed2(ArrayList<Integer> a){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int size = a.size();
        int j=size-1;
        for(int i=0; i<size; i++){
            lista.add(a.get(j-i));
        }
        return lista;
    }

    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> pomoc = new ArrayList<Integer>();
        int size = a.size();
        for(int i=size-1; i>=0; i--){
            pomoc.add(a.get(i));
            a.remove(i);
        }
        a.addAll(pomoc);

    }
}
