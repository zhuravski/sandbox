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
        String [] expected = {"test", "de", "la", "muerte"};
        wordCounter = new WordCounter("test de la muerte");

        String[] result = wordCounter.getWords();
        Assert.assertEquals(expected, result);
    }

}