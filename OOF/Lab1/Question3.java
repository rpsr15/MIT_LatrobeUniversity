public class TotalPercent 
{
   public static void main(String[] args)
   {
      int coalitionVotes = 6_908_710;
      int laborVotes = 6_006_217;
      int formalVotes = coalitionVotes + laborVotes;
      System.out.println("Total formal votes" + formalVotes);
      double percentOfVotes = (double) laborVotes / formalVotes * 100.0;
      
      System.out.println("Percentage of labor party" + percentOfVotes);
      double percentCoalitionVotes = (double) coalitionVotes / formalVotes * 100.0 ;
      System.out.println("Percentage of coalition Votes" + percentCoalitionVotes); 
   }
}
