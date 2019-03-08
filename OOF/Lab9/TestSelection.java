/*
 * Class Name:    TestSelection
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 18 2018, 15:05 
 * Last Modified: Thursday, January 18 2018, 15:07
 * 
 * Class Description:
 *
 */

public class TestSelection
{
   public static void main(String[] args)
   {
      int[] test = {4,5,7,1,45,0};
      SelectionSort.sort(test);
      for(int i : test)
      {
         System.out.println(i);
      }
   }
}

