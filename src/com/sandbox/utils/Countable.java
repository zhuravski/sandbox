package com.sandbox.utils;

public interface Countable<T> {

    // Setter and getter for the object to count
    public void setSource(T source);
    public T getSource();

    // Gets the total occurrences
    public long getTotal();

}
