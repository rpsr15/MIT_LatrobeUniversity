import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("sample1-pp.txt"));
            String line, wrd;
            ArrayList<String> wordsNeighbors;
            String[] wordsOnLine;

            // initialize dict to empty list
            ArrayList<Word> dict = new ArrayList<Word>();

            // fill the dictionary with all the words and their neighbors
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                wordsOnLine = line.split("\\s");

                // the word is the first thing on the line
                wrd = wordsOnLine[0];
                wordsNeighbors = new ArrayList<String>();

                // then come the words that differ by only one character
                for (int i = 1; i < wordsOnLine.length; i++) {
                    wordsNeighbors.add(wordsOnLine[i]);
                }

                // create a Word object and add it to the dictionary
                dict.add(new Word(wrd, wordsNeighbors));
            }
            scan.close();

            // sort the dictionary for fast lookup with binary search
            Collections.sort(dict);
            System.out.println(dict);
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}