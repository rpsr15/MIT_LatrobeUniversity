import java.util.*;

public class DistanceBetweenPoints
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in); 
      System.out.println("Enter x1 :");
      float x1 = key.nextFloat();
      System.out.println("Enter y1 :");
      float y1 = key.nextFloat();
      System.out.println("Enter x2 :");
      float x2 = key.nextFloat();
      System.out.println("Enter y2 :");
      float y2 = key.nextFloat();
      
      double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
      System.out.println("distance between points is "+distance);


     }


}
