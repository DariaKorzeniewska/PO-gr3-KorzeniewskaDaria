package com.company;

public class Main {

    public static void main(String[] args) {
	    PairDemo p = new PairDemo();
        p.setFirst(5);
        p.setSecond(10);
        System.out.println(p.getFirst()+" "+p.getSecond());
        p.swap();
        System.out.println(p.getFirst()+" "+p.getSecond());

        PairDemo a = new PairDemo();
        a.setFirst(1);
        a.setSecond(2);
        System.out.println(a.getFirst()+" "+a.getSecond());
        a = PairUtil.swap(a);
        System.out.println(a.getFirst()+" "+a.getSecond());
    }
}

