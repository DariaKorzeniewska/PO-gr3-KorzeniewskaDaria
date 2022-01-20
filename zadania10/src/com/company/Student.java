package com.company;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Osoba o) {
        int tmp = super.compareTo(o);
        if((o instanceof Student)&&(tmp==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) o).sredniaOcen);
        }
        return tmp;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " [ " + this.getNazwisko() + ", " + this.getDataUrodzenia().toString() + ", " + sredniaOcen + " ] ";
    }
}
