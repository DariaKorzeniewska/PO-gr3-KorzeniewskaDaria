package com.company;

import java.util.ArrayList;

public class ArrayUtil {

    public int jestPalindromem(T lista){
        int tak = 0;
        for(int i=0;i>lista.size();i++){
            if(lista.get(i) == lista.get(lista.size()-i)){
                tak+=1;
            }
        }
        if(tak == lista.size()){
            return 1;
        }
        return 0;
    }
}
