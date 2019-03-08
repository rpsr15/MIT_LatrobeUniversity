public class ChangingChar
{
   public static void main(String[] args)
   {
      int number = 76;
      char character = 'E';
      System.out.println("character before assignment: " + character);
      character = (char) number;
      System.out.println("character after assignment: " + character);
   
   }
}
