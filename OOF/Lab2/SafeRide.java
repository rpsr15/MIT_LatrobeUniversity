import java.util.Scanner;

public class SafeRide
{
   public static void main(String[] args)
   {
      int height;
      String gender;
      boolean ifPregnant;
      int safeLimit = 110; //in cm
      System.out.println("Please provide your height in cms");
      Scanner key = new Scanner(System.in);
     height =  key.nextInt();
     if (height < safeLimit)
      {
         System.out.println("sorry you are not eligible for theride");
      }
     gender = key.nextLine(); 
     System.out.println(gender);


     }

}
