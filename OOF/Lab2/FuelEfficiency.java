import java.util.*;
public class FuelEfficiency
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many Litres does your fule tank hold?");
      double tankSize = keyboard.nextDouble();
      System.out.print("How many kilometers do you travel on one fule tank?");
      double kilometers = keyboard.nextDouble();
      System.out.print("How much do your pay per litre for furl?");
      double pricePerLitre = keyboard.nextDouble();

      //Equation 1
      // Add code here
      double litresPer100Km = ( tankSize / kilometers) * 100;
      System.out.println("Litres per 100km = " + litresPer100Km);

      // Equation 2
      // Add code here
      double costPerKilometer = ( litresPer100Km * pricePerLitre) / 100;
      System.out.println("It costs you $" + costPerKilometer + " for each kilometer you drive ");
   }
}
