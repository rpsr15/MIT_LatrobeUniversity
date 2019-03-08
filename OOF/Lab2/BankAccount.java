import java.util.Scanner;
public class BankAccount
{
   public static void main(String[] args)
   {
     boolean passport = false , birthCertificate = true, citizenship = false, licence = false, publicServiceID = false , socialSecurity = false, universityID = true, utilityBill = false;
     int extraDocs = 0 ;
     int totalPoint = 0; 
      Scanner key = new Scanner(System.in);   
     String temp = "";
     System.out.println("Do you have a Passport?");
     // check passport value
     if (passport == true)
     {
      totalPoint += 70;

     }
   System.out.println(totalPoint);
   }

 }

