package com.company;

public class PairDemo<T> {
    public PairDemo()
    {
        first = null;
        second = null;
    }
    public PairDemo(T first, T second)
    {
        this.first = first;
        this.second = second;
    }
    public T getFirst()
    {
        return first;
    }
    public T getSecond()
    {
        return second;
    }
    public void setFirst(T newValue)
    {
        first = newValue;
    }
    public void setSecond(T newValue)
    {
        second = newValue;
    }
    private T first;
    private T second;

    public void swap()
    {
        T zmienna = first;
        first = second;
        second = zmienna;

    }
}
