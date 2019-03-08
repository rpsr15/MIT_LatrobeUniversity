import java.util.*;
public class KineticEnergy
    {
       public static void main(String[] args)
       {
          Scanner key = new Scanner(System.in);
          System.out.println("Please enter the mas of the objhect: ");
            double mass = key.nextDouble(); 
          System.out.println("Please enter the velocityof the object:");
            double velocity = key.nextDouble();
            double kineticEnergy = 1 * mass * velocity * velocity / 2; 
          System.out.println("The kinetic energy is : " + kineticEnergy);
       }

     }
