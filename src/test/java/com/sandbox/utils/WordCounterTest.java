package com.sandbox.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WordCounterTest {

    WordCounter wordCounter;

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testGetWords() throws Exception {
        String[] expected = {"test", "de", "la", "muerte"};
        WordCounter wordCounter = new WordCounter("test de la muerte");

        String[] result = wordCounter.getWords();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testRemoveEmptyStringsFromCollection() {
        String[] expected = {"string", "array", "without", "empty", "strings"};
        String[] source = {"", "string", "array", "", "without", "empty", "strings", "", ""};
        String[] result = null;

        WordCounter wordCounter = new WordCounter();
        result = wordCounter.removeEmptyStringsFromCollection(source);

        assertEquals(expected, result);
    }
}