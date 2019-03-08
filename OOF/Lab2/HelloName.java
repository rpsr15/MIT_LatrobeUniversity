import java.util.*;
public class HelloName{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("what is your name?");
      String name = keyboard.nextLine();
      System.out.println("Hello "+ name);
   }

}

