import java.util.ArrayList;

public class WordDetail implements Comparable {
    public String word;
    private int frequency;
    ArrayList<String> neighbours;

    public WordDetail(String word) {
        this.word = word;
        this.neighbours = new ArrayList<String>();
        frequency = 1;
    }

    public WordDetail(String word, int frequency) {
        this.word = word;
        this.neighbours = new ArrayList<String>();
        this.frequency = frequency;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int newFrequency) {
        if (frequency >= 0) {
            this.frequency = newFrequency;
        }
    }

    public void increaseFrequency() {
        this.frequency++;
    }

    public boolean equals(Object obj) {

        if ((obj.getClass() == this.getClass()) && ((WordDetail) obj).word.equals(this.word)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object obj) {

        return this.word.compareTo(((WordDetail) obj).word);

    }

    public String toString() {
        return String.format("%s %d %s\n", this.word, this.getFrequency(), neighbours);
    }

}