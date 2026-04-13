package com.medhat.generics;

import java.util.Iterator;

/**
 * A custom, fixed-size generic list that allows for basic element manipulation and iteration.
 * * @param <T> the type of elements held in this collection
 * @author Mohamed Medhat (MedZ)
 */
public class Listo<T> implements Iterable<T> {

    /**
     * The internal array used to store the elements of the list.
     */
    private T[] elements = null;

    /**
     * The current number of elements in the list.
     */
    private int count = 0;

    /**
     * Constructs an empty list with the specified initial capacity.
     * @param size the maximum number of elements this list can hold
     */
    @SuppressWarnings("unchecked")
    public Listo(int size) {
        elements = (T[]) new Object[size];
    }

    /**
     * Appends the specified element to the end of this list if capacity permits.
     * Prints an error message to the console if the list is full.
     * @param obj the element to be appended to this list
     */
    public void add(T obj) {
        if (count < elements.length) {
            elements[count++] = obj;
        } else {
            System.out.println("Cannot add: The list is currently full.");
        }
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * Prints an error message to the console if the index is out of bounds.
     * @param index the index of the element to replace
     * @param obj the new element to be stored at the specified position
     */
    public void replace(int index, T obj) {
        if (index >= 0 && index < count) {
            elements[index] = obj;
        } else {
            System.out.println("Cannot replace: Index " + index + " is out of bounds.");
        }
    }

    /**
     * Returns the number of elements currently present in the list.
     * @return the number of elements in the list
     */
    public int len() {
        return count;
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index the index of the element to return
     * @return the element at the specified index, or null if the index is out of bounds
     */
    public T view(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        }
        return null;
    }

    /**
     * Prints all currently stored elements to the standard output, each on a new line.
     */
    public void viewALL() {
        for (int i = 0; i < count; i++) {
            System.out.println(elements[i]);
        }
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return an Iterator over the elements in this list
     */
    @Override
    public Iterator<T> iterator() {
        return new IteratorList();
    }

    /**
     * Internal implementation of the Iterator interface for traversing the Listo elements.
     */
    private class IteratorList implements Iterator<T> {

        /**
         * The index of the next element to be returned.
         */
        private int index = 0;

        /**
         * Returns true if the iteration has more elements.
         * @return true if the iteration has more elements, otherwise false
         */
        @Override
        public boolean hasNext() {
            return index < count;
        }

        /**
         * Returns the next element in the iteration.
         * * @return the next element in the iteration
         */
        @Override
        public T next() {
            return elements[index++];
        }
    }
}