public class BoundedCounter
{
   private int counter;
   public final int MAXIMUM = 999;

   //constructor
   public BoundedCounter()
   {
      this.counter = 0;
   }

   public void next()
   {
     if (counter < MAXIMUM)
     {
        counter++;
     }
    }

   public void reset()
   {
      counter = 0;
   }

   public int getCounter()
   {
      return counter;
   }
   
   public String toString()
   {
      return counter+"";

   }

}
