import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Sample {
    static final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) {
        String[] s = { "}][}}(}][))]", "{)[](}]}]}))}(())(" };
        String[] r = braces(s);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }

    }

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    static String[] braces(String[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = "YES";
            Stack<Character> st = new Stack<Character>();
            char[] exp = values[i].toCharArray();
            boolean cnt = true;
            for (int j = 0; j < exp.length && cnt == true; j++) {

                if (exp[j] == '{' || exp[j] == '(' || exp[j] == '[')
                    st.push(exp[j]);

                if (exp[j] == '}' || exp[j] == ')' || exp[j] == ']') {

                    if (st.isEmpty()) {
                        result[i] = "NO";
                        cnt = false;

                    } else if (!isMatchingPair(st.pop(), exp[j])) {
                        result[i] = "NO";

                        cnt = false;

                    }
                }

            }

            if (st.isEmpty() && cnt == true) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
            st.clear();

        }
        return result;

    }

    public static String longestEvenWord(String sentence) {
        String[] s = sentence.split(" ");
        int max = 0;
        int index = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() % 2 == 0 && s[i].length() > max) {
                index = i;
                max = s[i].length();
            }
        }
        if (index == -1) {
            return "00";
        } else {
            return s[index];
        }
        // return s[i];
    }

    public static void maximumCupcakes(List<String> trips) {
        // Write your code here
        for (int i = 0; i < trips.size(); i++) {
            System.out.println(trips.get(i));
            int result = count(12 / 4, 4);
            System.out.println(result);

        }

    }

    static int count(int pie, int ration) {

        if (pie == 0) {
            return 0;
        }
        int wrapper = pie / ration;

        return pie + count(wrapper, ration);

    }

    static int maxTickets(List<Integer> tickets) {
        ArrayList<Integer> list = new ArrayList<Integer>(tickets);
        Collections.sort(list);
        if (list.size() == 1) {
            return 1;
        }
        int max;
        int count = 1;
        max = count;
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            if (diff <= 1 && diff >= 0) {
                count++;
                if (max < count) {
                    max = count;
                }

            } else {
                count = 1;
            }
        }
        return max;
    }

}