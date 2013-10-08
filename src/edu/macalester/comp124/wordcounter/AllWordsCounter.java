package edu.macalester.comp124.wordcounter;

import java.util.Set;

/**
 * A counter that keeps track of counts for all words
 *
 * @author shilad
 */
public class AllWordsCounter {

    public static final int MAX_WORDS = 10000;

    SingleWordCounter counters[] = new SingleWordCounter[10000];


    public int getNumWords() {
        int n = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] != null) {
                n++;
            }
        }
        return n;
    }

    /**
     * Increment the count for the specified word.  Remember that this may
     * be the first time the word counter has seen this particular word.
     *
     * @param word
     */
    public void count(String word) {
        int n = getNumWords();
        for (int i = 0; i < n; i++) {
            if (counters[i].wordMatches(word)) {
                counters[i].incrementCount();
                return;
            }
        }
        counters[n] = new SingleWordCounter(word);
        counters[n].incrementCount();
    }

    /**
     * Return the count for the particular word.  Remember that the
     * word may not have been seen before.
     *
     * @param word
     * @return
     */
    public int getCount(String word) {
        int n = getNumWords();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (counters[i].wordMatches(word)) {
                count = counters[i].getCount();
                return count;
            }
        }
        return count;
    }

    /**
     * @return The an array of all words that have been counted
     *         (just the words, not the values).
     */
    public String[] getAllWords() {
        // part one: create an array of strings of size equal to the number of words
        int n = getNumWords();
        String words[] = null;  // FIXME

        // part two: fill the array of strings using a loop

        return words;
    }
}
