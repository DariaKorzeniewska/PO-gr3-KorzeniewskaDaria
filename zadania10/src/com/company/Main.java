//lab10


package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Test Osoba");
        System.out.println();

        ArrayList<Osoba> grupa = new ArrayList<Osoba>(5);

        Osoba o1 = new Osoba("Smith", LocalDate.of(1995, 10, 20));
        Osoba o2 = new Osoba("Brown", LocalDate.of(1988,3,15));
        Osoba o3 = new Osoba("Black", LocalDate.of(2000,8,3));
        Osoba o4 = new Osoba("Lee", LocalDate.of(1999,5,2));
        Osoba o5 = new Osoba("Willis", LocalDate.of(1980,11,22));

        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);

        System.out.println("Nieposortowana grupa: ");
        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);

        System.out.println(" ");
        System.out.println("Posortowana grupa: ");
        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }


        System.out.println();
        System.out.println("Test Student");
        System.out.println();

        ArrayList<Osoba> studenci = new ArrayList<>(5);

        Student s1 = new Student("Kiwison", LocalDate.of(2000, 12, 25), 3.5);
        Student s2 = new Student("Bananason", LocalDate.of(1998, 8, 15), 4.5);
        Student s3 = new Student("Pearson", LocalDate.of(1995, 10, 10), 4.5);
        Student s4 = new Student("Melonson", LocalDate.of(1980, 5, 5), 4);
        Student s5 = new Student("Appleson", LocalDate.of(1999, 11, 20), 5);

        studenci.add(s1);
        studenci.add(s2);
        studenci.add(s3);
        studenci.add(s4);
        studenci.add(s5);

        System.out.println("Nieposortowana grupa: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(studenci.get(i));
        }

        Collections.sort(studenci);
        System.out.println(" ");

        System.out.println("Posortowana grupa: ");
        for(int i=0; i<5; i++){
            System.out.println(studenci.get(i));
        }


        System.out.println(" ");

    }
}
