package com.medhat.generics;

public class Listo <T> {
    private T[] list = null;
    int count = 0;

    @SuppressWarnings("unchecked")
    public Listo(int size){
        list = (T[]) new Object[size];
    }

    public void add(T obj){
        list[count++] = obj;
    }

    public int len(){
        return count;
    }

    public T view(int index){
        return list[index];
    }

    public void viewALL(){
        for(T x : list)
        {
            System.out.println(x);
        }
    }
}
