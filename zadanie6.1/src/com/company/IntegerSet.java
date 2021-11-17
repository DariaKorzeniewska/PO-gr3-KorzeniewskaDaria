package com.company;

public class IntegerSet {
    boolean[] bool = new boolean[100];
    private int i;

    public IntegerSet(boolean[] bool){
        this.bool = bool;
        for(int j=0;j<100;j++){
            bool[j]=false;
        }
        if(i>=1 && i<=100){
            bool[i]=true;
        }
    }

    public boolean[] union(boolean[] a, boolean[] b){
        boolean[] c = new boolean[100];
        for(int j=0;j<100;j++){
            if(a[j]!=false) c[j]=true;
            else if (b[j]!=false) c[j]=true;
            else{
                c[j]=false;
            }
        }
        return c;
    }

    public boolean[] intersection(boolean[] a, boolean[] b){
        boolean[] c = new  boolean[100];
        for(int j=0;j<100;j++){
            if(a[j]&&b[j]) c[j]=true;
        }
        return c;
    }

    public void insertElement(boolean[] a, int i){
        if(i>=1 && i<=100){
            for(int j=0;j<100;j++){
                if(j==i) a[j]=true;
            }
        }
    }

    public void deleteElement(boolean[] a, int i){
        if(i>=0 && i<=100){
            for(int j=0;j<100;j++){
                if(j==i) a[j]==false;
            }
        }
    }

    public String toString(boolean[] a, int i){

    }

}
