package com.sandbox.utils;

public interface Countable<T> {

    /**
     * Setter for the source object
     * @param source The object to be analyzed
     */
    public void setSource(T source);

    /**
     * Getter for the source object
     * @return  The object to be analyzed
     */
    public T getSource();

    /**
     * Gets the total occurrences of the item to be counted
     * @return Total occurrences
     */
    public default long getTotal() {
        return 0;
    }

}
