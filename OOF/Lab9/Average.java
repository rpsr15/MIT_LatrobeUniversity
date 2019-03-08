/*
 * Class Name:    Average
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 18 2018, 15:09 
 * Last Modified: Thursday, January 18 2018, 15:19
 * 
 * Class Description:
 *
 */

public class Average
{
   public static double calculateAverage(int[] data)
   {
      int sum = 0;
      for(int i : data)
      {
         sum += i;
      }

      return ((double)sum)/data.length;
   }
   public static int totalBelowAverage(int[] data, double average)
   {
      int count = 0;
      for( int i  : data)
         {
            if((double)i < average)
               {
                  count++;
               }
         }
         return count;
   }
   public static void main(String[] args)
   {
      int[] test = {1,2,3,4,5,6,7,8,9,10};

      System.out.println(calculateAverage(test));
      System.out.println(totalBelowAverage(test,5.5));
   }
}

