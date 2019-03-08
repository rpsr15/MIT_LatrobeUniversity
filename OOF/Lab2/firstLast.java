import java.util.*;
public class firstLast
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a line with atleast two words.");
      String line = keyboard.nextLine();
      
      
      int firstIndex = line.indexOf(" "); 
      int lastIndex = line.lastIndexOf(" ");
      String lastWord = line.substring(lastIndex+1);
      String firstWord = line.substring(0,firstIndex);
      
      System.out.println("first word: "+firstWord+" last word "+lastWord);
   }
}
