import java.util.Scanner;
public class PettingZoo
{
   public static void main(String[] args)
   {
      int numberAdults = 0, numberChildren = 0;
      Scanner key = new Scanner(System.in);
      System.out.println("Enter Number of adults");
      numberAdults = key.nextInt();
      System.out.println("Enter number of children");
      numberChildren = key.nextInt();

      int adultCost = 10, childCost = 5, familyCost = 26;

      int min = Math.min(numberAdults,numberChildren);
      System.out.println(min);
      int numberFamily = min / 2;
      int childFamily = 2 * numberFamily ; 
      int adultFamily = 2 * numberFamily ;
      int childWithOutFamily = numberChildren - childFamily;
      int adultWithoutFamily = numberAdults - adultFamily;
      System.out.println("Number Of adults: "+ numberAdults);
      System.out.println("Number of children: "+ numberChildren);
      System.out.println();
       if (numberFamily != 0 )
       {
      System.out.println("Number of family tickets: "+numberFamily);
       }
      if (adultWithoutFamily != 0 )
       {
          System.out.println("Number of adult tickets: "+ adultWithoutFamily);

         }
       if ( childWithOutFamily != 0 )
       {
          System.out.println("Number of child tickets: "+childWithOutFamily);
        }
      int totalCost = adultCost*adultWithoutFamily + childCost*childWithOutFamily + familyCost*numberFamily ;
      System.out.println("Total cost: $"+totalCost);     
    }

}
