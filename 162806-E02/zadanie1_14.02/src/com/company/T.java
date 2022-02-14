package com.company;
import java.util.ArrayList;
import java.lang.Comparable;

public class T implements Comparable <T>{
    ArrayList lista;

    public T(ArrayList lista){
        this.lista = lista;
    }

    public void add_int(int a){
        lista.add(a);
    }

    public int size(ArrayList lista){
        return lista.size();
    }

    public int get(ArrayList lista, int index){
        int a = lista.get(index);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
