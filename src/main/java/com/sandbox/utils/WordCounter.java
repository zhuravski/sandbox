package com.sandbox.utils;
import java.io.File;
import java.util.*;


public class WordCounter implements Countable<String> {

    private String source;
    private char separator;
    private long total;

    /**
     * Basic constructor (empty source and space separator)
     */
    public WordCounter() {
        this.total = 0;
        this.source = "";
        this.separator = ' ';
    }

    /**
     * Constructor with source initialization
     * @param source The text to be analyzed
     */
    public WordCounter(String source) {
        this();
        this.source = source;
    }

    /**
     * Constructor with source and separator initialization
     * @param source The text to be analyzed
     * @param separator Character to separate words
     */
    public WordCounter(String source, char separator) {
        this(source);
        this.separator = separator;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getSource() {
        return this.source;
    }

    @Override
    public long getTotal() {
        return doCount();
    }

    /**
     * Getter for the character separator
     * @return Separator character
     */
    public char getSeparator() {
        return separator;
    }

    /**
     * Setter for the character separator
     * @param separator Separator character
     */
    public void setSeparator(char separator) {
        this.separator = separator;
    }

    /**
     * Counts all the words in the source separated by the defined separator,
     * ignoring duplicated and trailing separators.
     * @return Total amount of words in the source text
     */
    private long doCount() {
        long total = 0;
        int index = 0;

        try {
            if (getSource().length() != 0) {
                // Loop through all characters in the source text
                do {
                    // Ignore separators
                    if (getSource().charAt(index) == getSeparator()) {
                        index++;
                    } else {
                        // Word found: increment word counter and continue until next separator
                        total++;
                        while ((index < getSource().length() - 1) && (getSource().charAt(index) != getSeparator())) {
                            index++;
                        }
                    }
                } while (index < getSource().length() - 1);
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        finally {
            this.total = total;
        }

        return this.total;
    }

    /**
     * Gets all the words in the source text
     * @return A collection of all the words in the source
     */
    public String[] getWords() {
        String[] wordList;

        // Split list using the separator
        String[] splitSource = getSource().split(String.valueOf(getSeparator()),-1);

        wordList = removeEmptyStringsFromCollection(splitSource);

        return wordList;
    }

    /**
     * Given an array of strings it cleans it up from empty strings
     * @param Array of strings
     * @return Array of strings without empty strings
     */
    protected String[] removeEmptyStringsFromCollection(String[] sourceList) {
        List<String> cleanedList = new ArrayList<>();

        // Loop through the elements ignoring the empty ones
        for (String item : sourceList) {
            if (item.length() != 0)
                cleanedList.add(item);
        }

        return cleanedList.toArray(new String[cleanedList.size()]);
    }
}
