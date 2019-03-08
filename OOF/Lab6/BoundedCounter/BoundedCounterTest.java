public class BoundedCounterTest
{
   public static void main(String[] args)
   {
      System.out.println("Test1");
      BoundedCounter myCounter = new BoundedCounter();
      System.out.println(myCounter);
        
      //Test2
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      myCounter.next();
      System.out.println(myCounter);
      //Test 3
      myCounter.reset();
      System.out.println(myCounter);

      //Test 4
      System.out.println(myCounter.getCounter());

      //Test 5
      while(myCounter.getCounter() < 997)
         {
             myCounter.next();

         }
     System.out.println(myCounter);
      myCounter.next();
      myCounter.next();
      myCounter.next();
      myCounter.next();
      myCounter.next();
      System.out.println(myCounter);
   }
}
