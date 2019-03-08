import java.util.*;

public class SumAverage
{
   public static void main(String[] args)
   {
      int x,y;
      Scanner key = new Scanner(System.in);
      System.out.println("Enter first number");
      x = key.nextInt();
      System.out.println("Enter second number");
      y = key.nextInt();

      int sum = x + y;

      float average = (float)sum / 2;
      System.out.println("The sum is "+sum+"and the average of two numbers is "+average);

      }
}
