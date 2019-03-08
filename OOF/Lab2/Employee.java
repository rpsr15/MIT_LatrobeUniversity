import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Employee
{
   public static void main(String[] args)
   {
      String nameEmployee = null;
      String fileName = null;
      double numberHour = 0.0, rateHour = 0.0, totalSales = 0.0 ;
      Scanner key = null, in = null;
      in = new Scanner(System.in);
      System.out.println("Enter file name");
      fileName = in.nextLine();
      
      try
      {
         key = new Scanner(new FileInputStream(fileName));

       }
      catch(FileNotFoundException e)
      {
         System.out.println("Cannot read from file.please check file name");
         System.exit(0);
       }
      nameEmployee = key.nextLine();
      numberHour = key.nextDouble();
      rateHour = key.nextDouble();
      totalSales = key.nextDouble();
       double avgSalePerHour = totalSales / numberHour;
       double expectedSale = 200.0 * numberHour;
       double bonusSale = totalSales - expectedSale;

       double bonus = .10 * bonusSale;
       double payHour = numberHour * rateHour;
      double totalSalary = bonus + payHour;
      System.out.println("Pay: $"+totalSalary);
      }

}
