import java.util.Arrays;

public class ArrayManipulations
{
   public static void main(String[] args)
   {
      int[] filledIntArray = new int[10];
      Arrays.fill(filledIntArray, 7);

      for( int i : filledIntArray)
      {
         System.out.println(i);
        }
    }

}
