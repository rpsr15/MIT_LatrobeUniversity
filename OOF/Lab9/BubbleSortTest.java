/*
 * Class Name:    BubbleSortTest
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 18 2018, 14:10 
 * Last Modified: Thursday, January 18 2018, 14:56
 * 
 * Class Description:
 *
 */

public class BubbleSortTest
{
   public static void main(String[] args)
   {
      int[] test = {4,6,8,3,56,1};
      String[] call = {"ravi","sam","RAVI","rAvi","x","alia"};
      BubbleSort.sort(call);
      for( String i : call)
      {
         System.out.println(i);
      }
   }

}

