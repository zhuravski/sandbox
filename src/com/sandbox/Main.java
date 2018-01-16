package com.sandbox;

import com.sandbox.utils.WordCounter;

public class Main {

    public static void main(String[] args) {

        String myStr = "    asfasdf    asdfasdf asdfasdf asdf asdf   asdf";
        String myStr2 = "    asfasdf    asdfasdf asdfasdf asdf asdf   asdf   asfasdf    asdfasdf asdfasdf asdf asdf   asdf";

        WordCounter wordCounter = new WordCounter(myStr2);

        System.out.print("Total word counting: ");
        System.out.println(wordCounter.getTotal());

        String[] words = wordCounter.getWords();
        System.out.print("Total word counting: ");
        System.out.println(words.length);

    }
}
