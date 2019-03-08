/*
 * Class Name:    CommissionEmployeeTest
 *
 * Author:        Your Name
 * Creation Date: Friday, January 19 2018, 19:02 
 * Last Modified: Friday, January 19 2018, 19:27
 * 
 * Class Description:
 *
 */

public class CommissionEmployeeTest
{
   public static void main(String[] args)
   {

      CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

      // get commission employee data
      System.out.println("Employee information obtained by get methods");
      System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is ", employee.getLastName());
      System.out.printf("%s %s%n", "Social secutiy number is ", employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is ", employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
      employee.setGrossSales(5000);
      employee.setCommissionRate(.1);
      System.out.printf("%n%s:%n%n%s%n","Updated employee information obtained by toString", employee);

   }// end main
} // end class CommissionEmployeeTest

