package com.sandbox;

import com.sandbox.utils.WordCounter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        String myStr = "    asfasdf    asdfasdf asdfasdf asdf asdf   asdf";
        String myStr2 = "THIS_IS_AN_UNDERSCORE_SEPARATED_STRING";
        WordCounter wordCounter;

        // Count words
        wordCounter = new WordCounter(myStr);
        System.out.print("Total word counting: ");
        System.out.println(wordCounter.getTotal());

        // Count words with a specified separator
        wordCounter = new WordCounter(myStr2);
        System.out.print("Total word counting: ");
        System.out.println(wordCounter.getTotal());

        // Get words in an array
        wordCounter = new WordCounter(myStr2,'_');
        String[] words = wordCounter.getWords();
        System.out.println("List of words: ");
        for (String word : words)
            System.out.print(word + " ");

        // Count words in a file
        /*String filePath = "D:" + File.separator + "data" + File.separator + "document.txt";
        File myTextFile = new File(filePath);
        wordCounter = new WordCounter(myTextFile);*/
    }
}
