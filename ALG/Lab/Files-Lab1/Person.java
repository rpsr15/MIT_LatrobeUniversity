// Written by:	Julie Main, on March 11 2005, 15:07
// Modified by: Richard Tresider, on March 09 2008
// Modified by: Kinh Nguyen, on March 06 2018

import java.util.*;

public  class Person implements Comparable<Person>
{
   private String firstName;
   private String lastName;
   private String address;
   private String suburb;
   private String state;
   private int postCode;

   // To count number of comparisons
   // This static attribute is increased each time method
   // compareTo is callled
   //
   private static int nrOfComparisons = 0;

   public Person(String firstName, String lastName, String address,
                String suburb, String state, int postCode)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
      this.suburb = suburb;
      this.state = state;
      this.postCode = postCode;
   }

   public String toString()
   {
      return lastName + ", " + firstName + "\n" +
             address + "\n" +
             suburb + "\t" + state + "\t" + postCode + "\n";
   }

   public boolean equals(String first, String last, int post)
   {
      return this.firstName.equalsIgnoreCase(first)
             && this.lastName.equalsIgnoreCase(last)
             && this.postCode == post;
   }

   public  int compareTo(Person p)
   {
      ++nrOfComparisons;

      int lastNameDifference =
          this.lastName.compareToIgnoreCase(p.lastName);

      if (lastNameDifference != 0)
      {
         return lastNameDifference;
      }
      else
      {
         int firstNameDifference =
             this.firstName.compareToIgnoreCase(p.firstName);
         if (firstNameDifference != 0)
         {
            return firstNameDifference;
         }
         else
         {
            return this.postCode - p.postCode;
         }
      }
   }

   public String getLastName()
   {
      return this.lastName;
   }

   public String getFirstName()
   {
      return this.firstName;
   }

   public String getAddress()
   {
      return this.address;
   }

   public String getSuburb()
   {
      return this.suburb;
   }

   public String getState()
   {
      return this.state;
   }

   public int getPostCode()
   {
      return this.postCode;
   }

   public static int getCounter()
   {
      return nrOfComparisons;
   }

   public static void resetCounter()
   {
      nrOfComparisons = 0;
   }
}

