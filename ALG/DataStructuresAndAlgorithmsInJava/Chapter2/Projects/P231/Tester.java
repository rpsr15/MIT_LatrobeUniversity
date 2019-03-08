public class Tester{
    public static void main(String[] args)
    {
        Ecosystem game = new Ecosystem(5);
        game.printEcosystem();
        game.move();
        System.out.println("moved");
        game.printEcosystem();
    }
}