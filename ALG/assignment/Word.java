import java.util.*;
import java.io.*;

public class Word implements Comparable<Word> {
    private String word;
    private ArrayList<String> neighbors;

    public Word(String aWord) {
        word = aWord;
        neighbors = null;
    }

    public Word(String aWord, ArrayList<String> theNeighbors) {
        word = aWord;
        neighbors = theNeighbors;
    }

    public boolean equals(Object otherObj) {
        if (otherObj == null) {
            return false;
        }
        if (otherObj.getClass() != getClass()) {
            return false;
        }

        Word otherWord = (Word) otherObj;
        return (this.word.equals(otherWord.word));
    }

    public int compareTo(Word otherWord) {
        return this.word.compareTo(otherWord.word);
    }

    public String toString() {
        String rval = word + " ";
        for (String s : neighbors) {
            rval += s + " ";
        }
        return rval + "\n";
    }
}