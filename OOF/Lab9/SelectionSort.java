/*
 * Class Name:    SelectionSort
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 18 2018, 14:57 
 * Last Modified: Thursday, January 18 2018, 15:08
 * 
 * Class Description:
 *
 */

public class SelectionSort
{
   public static void sort(int[] a)
   {
      for(int i = 0; i < a.length - 1 ; i++)
      {
         int max = 0;
         for( int j = 0 ; j < a.length - i ; j++)
         {
            if(a[j] >a[max])
               {
                  max = j;
               }
         }
         int temp = a[a.length-1-i];
         a[a.length-1-i] = a[max];
         a[max] = temp;
      }
   }
}

