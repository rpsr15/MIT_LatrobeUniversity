import java.util.*;
public class HelloNameModified{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("what is your name?");
      String name = keyboard.nextLine();
      int index = name.indexOf(" ");  
      char firstName = name.charAt(0);
      String lastName = name.substring(index+1); 
      System.out.println(lastName+", "+firstName); 
       
   }

}

