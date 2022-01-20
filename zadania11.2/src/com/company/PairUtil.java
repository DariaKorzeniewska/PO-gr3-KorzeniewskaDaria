package com.company;

public class PairUtil {
    public static PairDemo swap(PairDemo data){
        PairDemo p = new PairDemo();
        p.setFirst(data.getFirst());
        p.setSecond(data.getSecond());
        p.swap();
        return p;
    }
}
