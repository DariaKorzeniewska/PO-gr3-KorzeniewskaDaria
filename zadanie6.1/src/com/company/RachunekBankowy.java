package com.company;
import java.math.*;

public class RachunekBankowy{
    private double kapital;
    private double saldo;
    private static double stopa;

    public RachunekBankowy(double kapital){
        this.kapital = kapital;
        this.saldo = saldo;

    }

    public double obliczMiesieczneOdsetki(){
        saldo=kapital;
        double odsetki = (saldo * stopa)/12;
        saldo += odsetki;
        return odsetki;
    }

    public void setRocznaStopaProcentowa(double new_stopa){
        stopa = new_stopa;
    }

    public double wypiszSaldo(){
        return saldo;
    }
}
