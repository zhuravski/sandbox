package com.sandbox;

import com.sandbox.utils.FileReader;
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
        wordCounter = new WordCounter(myStr2, '_');
        System.out.print("Total word counting: ");
        System.out.println(wordCounter.getTotal());

        // Get words in an array
        wordCounter = new WordCounter(myStr2,'_');
        String[] words = wordCounter.getWords();
        System.out.println("List of words: ");
        for (String word : words)
            System.out.print(word + " ");
        System.out.println("");

        // Count words in a file
        String fileName = "D:/dev/data/document.txt";
        FileReader fileReader = new FileReader(fileName);
        String fileContent = fileReader.getFileContent();
        System.out.println("\n\nThis is the content of '" + fileName + "':");
        System.out.println(fileContent);

        // Count words with a specified separator
        wordCounter = new WordCounter(fileContent);
        System.out.print("Total words in the file: ");
        System.out.println(wordCounter.getTotal());
    }
}
