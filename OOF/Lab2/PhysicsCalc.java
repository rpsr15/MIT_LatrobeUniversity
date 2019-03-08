public class PhysicsCalc
{
   public static void main(String[] args)
   {
      double time = 3.0;
      double initialVelocity = 4.5;
      double acceleration = 9.5;
      double finalVelocity = 0;
      double displacement = 0;

      displacement = initialVelocity * time ;
      System.out.println("Equation 1: " + displacement);

      displacement = initialVelocity * time + (((double)1/2) * acceleration * time * time) ;
      System.out.println("Equation 2: "+ displacement);

      finalVelocity = initialVelocity + acceleration * time ;
      System.out.println("Equation 3: " + finalVelocity );

      finalVelocity = Math.sqrt( initialVelocity * initialVelocity + 2 * acceleration * displacement );
      System.out.println("Equation 4: " + finalVelocity);

    }

}
