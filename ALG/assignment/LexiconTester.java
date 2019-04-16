
/*
Questions:
1. How to read two files? at the same time.
2. Is file  name random or fixed?
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.PrintWriter;

public class LexiconTester {

    private static boolean isNeighbour(String word1, String word2) {
        int differcount = 0; // to track difference in characters
        if (word1.length() == word2.length()) { // if word1 is as long as word 2
            for (int i = 0; i < word1.length(); i++) { // go from first to last character index the words
                if (word1.charAt(i) != word2.charAt(i)) { // if this character from word 1 does not equal the character
                                                          // from word 2
                    differcount++; // increase
                    if (differcount > 1)// if more than once character differnce, return false
                        return false;
                }
            }
            if (differcount == 1) // if only one character differs between two strings, return true
                return true;
            else
                return false;
        }

        return false;
    }

    // Method to read file and create dictionary for word ladder
    public static void readFile(String fileName, String ouputFileName) throws Exception {
        ArrayList<WordDetail> words = new ArrayList<>(); // words contains words with frequency and neighbours
        Scanner input = null;
        PrintWriter writer = new PrintWriter(ouputFileName, "UTF-8");
        // try {
        input = new Scanner(new FileInputStream(fileName));
        while (input.hasNext()) {
            String word = input.next().toLowerCase().replaceAll("[^a-zA-Z]", "");

            WordDetail newWord = new WordDetail(word);
            if (!word.isEmpty() && !words.contains(newWord)) {
                // System.out.println("not there so addding");
                words.add(newWord);
                // System.out.println(words);
                // search for neighbour
                for (int i = 0; i < words.size(); i++) {
                    if (isNeighbour(word, words.get(i).word)) {
                        // add to each other
                        newWord.neighbours.add(words.get(i).word);
                        words.get(i).neighbours.add(word);
                    }
                }

            } else if (!word.isEmpty()) {

                // System.out.println("already thre");
                // increase the frequency
                int index = words.indexOf(newWord);
                words.get(index).increaseFrequency();

            }
        }
        Collections.sort(words);
        // System.out.println(words);
        // write words to the file
        for (WordDetail word : words) {
            Collections.sort(word.neighbours);
            writer.write(word.toString());
        }
        writer.close();
        input.close();

    }

}