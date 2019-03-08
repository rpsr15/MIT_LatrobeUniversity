/*
 * Class Name:    CommissionEmployee
 *
 * Author:        Your Name
 * Creation Date: Friday, January 19 2018, 18:28 
 * Last Modified: Friday, January 19 2018, 19:24
 * 
 * Class Description:
 *
 */

public class CommissionEmployee
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales;
   private double commissionRate;

   //five argument constructor
   public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
   {
      if ( grossSales < 0.0)
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      if ( commissionRate < 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }// end of constructor

   //return first Name
   public String getFirstName()
   {
      return firstName;
   }

   //return last name
   public String getLastName()
   {
      return lastName;
   }

   //return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if(grossSales < 0.0)
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   }

   // return gross sales amount
   public double getGrossSales()
   {
      return this.grossSales;
   }

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if ( commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return commissionRate * grossSales;
   }

   @Override
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission emmployee", firstName, lastName,"social security number", socialSecurityNumber,"gross Sales", grossSales, "commission rate", commissionRate);

   }

}// end class CommissionEmployee

