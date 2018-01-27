package com.sandbox.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WordCounterTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testGetWords() throws Exception {
        String[] expected = {"this", "is", "a", "list", "of", "words"};
        WordCounter wordCounter = new WordCounter("  this is a list of words  ");

        String[] result = wordCounter.getWords();
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testRemoveEmptyStringsFromCollection() {
        String[] expected = {"string", "array", "without", "empty", "strings"};
        String[] source = {"", "string", "array", "", "without", "empty", "strings", "", ""};
        String[] result = null;

        WordCounter wordCounter = new WordCounter();
        result = wordCounter.removeEmptyStringsFromCollection(source);

        assertEquals(result, expected);
    }

    @Test
    public void testDoCount() {
        String myString;
        Long totalWords;
        Long expected;
        WordCounter wordCounter;

        // No words
        myString = "        ";
        expected = 0L;
        wordCounter = new WordCounter(myString);
        totalWords = wordCounter.getTotal();
        assertEquals(totalWords, expected);

        // Spaced separated string with trailing spaces
        myString = "   this is a normal string with   separators and trailing spaces    ";
        expected = 10L;
        wordCounter = new WordCounter(myString);
        totalWords = wordCounter.getTotal();
        assertEquals(totalWords, expected);

        // Underscore separated string
        myString = "____this_is_a_normal_string_with____separators_and_trailing_underscores_____";
        expected = 10L;
        wordCounter = new WordCounter(myString, '_');
        totalWords = wordCounter.getTotal();
        assertEquals(totalWords, expected);

        // String with symbols and other blanks
        myString = " #543ASd as#@%asGQW#$t _)(=-0- 23r3\tasf2 3r\n\r@#%@_!@)_   ";
        expected = 5L;
        wordCounter = new WordCounter(myString);
        totalWords = wordCounter.getTotal();
        assertEquals(totalWords, expected);
    }
}