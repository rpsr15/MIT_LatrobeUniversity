/*
 * Class Name:    BubbleSort
 *
 * Author:        Your Name
 * Creation Date: Thursday, January 18 2018, 14:08 
 * Last Modified: Thursday, January 18 2018, 14:53
 * 
 * Class Description:
 *
 */

public class BubbleSort
{
   public static void sort(String[] a)
   {
      for( int i = 0; i < a.length -1 ;i++)
         {
            for(int j=0;j< a.length - 1 -i ; j++)
            {
               if(a[j].compareTo(a[j+1]) > 0 )
               {
                  String temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
               }
            }
         }
   }

   public static void sort(int[] array)
   {
      for(int i =0 ; i < array.length - 1; i++)
      {
         for( int j =0; j < array.length - 1 - i; j++)
         {
            System.out.println("compairing"+array[j]+"with"+array[j+1]);
            if(array[j] > array[j+1])
            {
               int temp = array[j+1];
               array[j+1] = array[j];
               array[j] = temp;
            }
         }
      }
   }

}

