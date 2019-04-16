
/*
questinos:
reading file into memory?
how to check output?
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

public class WordMatchTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LexiconTester lexcionTester = new LexiconTester();
        ArrayList<WordDetail> list = new ArrayList<>();
        try {
            lexcionTester.readFile("sample.txt", "sample4.txt");

            // Read file
            Scanner inputFile = new Scanner(new FileInputStream("sample4.txt"));
            while (inputFile.hasNext()) {
                String line = inputFile.nextLine();
                String[] words = line.split(" ");
                String theWord = words[0];
                int frequency = Integer.parseInt(words[1]);
                WordDetail wordDetail = new WordDetail(theWord, frequency);
                list.add(wordDetail);
            }
            // System.out.println(list);
            String input = "";
            while (!input.equals("e")) {
                input = in.nextLine().replaceAll("\\?", ".").replaceAll("\\*", ".*");
                System.out.println("entered :" + input);
                int matchCount = 0;
                for (WordDetail word : list) {
                    if (word.word.matches(input)) {
                        System.out.println(word);
                    }
                }
                if (matchCount == 0)

                {
                    System.out.println("No words in the lexicon match the pattern");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}