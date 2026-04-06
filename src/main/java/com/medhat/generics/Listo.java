package com.medhat.generics;

public class Listo <T> {
    private T[] list = null;
    int count = 0;

    @SuppressWarnings("unchecked")
    public Listo(int size){
        list = (T[]) new Object[size];
    }

    public void add(T obj){
        if (count < list.length) {
            list[count++] = obj;
        } else {
            System.out.println("Cannot add: The list is currently full.");
        }
    }

    public void replace(int index, T obj){
        if (index >= 0 && index < count) {
            list[index] = obj;
        } else {
            System.out.println("Cannot replace: Index " + index + " is out of bounds.");
        }
    }

    public int len(){
        return count;
    }

    public T view(int index){
        if (index >= 0 && index < count) {
            return list[index];
        }
        return null;
    }

    public void viewALL(){
        for(int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }
}