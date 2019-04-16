public class Tester {
    public static void main(String[] args) {
        ArrayList<String> lol = new ArrayList<String>();
        lol.add(0, "Hello");
        lol.add(1, "worold");
        lol.add(2, "is");
        lol.add(3, "great");
        for (int i = 0; i < lol.size(); i++) {
            System.out.println(lol.get(i));
        }

    }
}