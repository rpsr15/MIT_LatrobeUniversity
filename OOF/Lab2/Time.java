import java.util.*;

public class Time
{
   public static void main(String[] args)
   {
      System.out.println("enter no of seconds");
      int seconds;
      Scanner key = new Scanner(System.in);

     seconds = key.nextInt();

     int hours = seconds / 3600 ;
     int remainSec = seconds % 3600 ;
     int minutes = remainSec / 60;
     int secs = remainSec % 60; 
     System.out.println("Hour: "+hours+" minutes: "+minutes+" seconds "+secs);

     }

}

