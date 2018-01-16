package com.sandbox.utils;

import java.util.*;

public class WordCounter implements Countable<String> {

    private String source;
    private char separator;
    private long total;

    public WordCounter() {
        this.total = 0;
        this.source = "";
        this.separator = ' ';
    }

    public WordCounter(String source) {
        this();
        this.source = source;
    }

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

    public char getSeparator() {
        return separator;
    }

    public void setSeparator(char separator) {
        this.separator = separator;
    }

    private long doCount() {
        long total = 0;
        int index = 0;

        try {
            if (getSource().length() != 0) {
                do {
                    if (getSource().charAt(index) == getSeparator()) {
                        index++;
                    } else {
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

    public String[] getWords() {
        List<String> words = new ArrayList<>();
        String[] wordList;
        int index = 0;

        // Split list using the separator
        String[] splitSource = getSource().split(String.valueOf(getSeparator()),-1);

        // Cleanup empty strings from the list
        for (String word : splitSource) {
            if (word.length() != 0)
                words.add(word);
            index++;
        }

        wordList = new String[words.size()];

        // Convert back to a simple array
        words.toArray(wordList);

        return wordList;
    }
}
