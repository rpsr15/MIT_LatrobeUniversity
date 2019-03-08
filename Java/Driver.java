// Laboratory 05
import java.util.*;
import java.io.*;
public class Driver
{
   private Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args)
   {
      Driver driver = new Driver();
      driver.process();
   }

   private void process()
   {
      String marksFileName = "CSEPRG";
      String reportFileName = "reportCSEPRG.txt";

      Scanner infile = null;
      PrintWriter outfile = null;

      try
      {
         infile = new Scanner(new File(marksFileName));
         outfile = new PrintWriter(reportFileName);
      }
      catch(FileNotFoundException e)
      {
         System.out.println(e.getMessage() + 
                            " ...terminating program... file opening issue");
         System.exit(0);
      }

      // Question 1 to be completed
       Subject s = Subject.loadData(infile);
      infile.close();
      // s.displayStudents();

      // Question 2 to be completed
      // s.writeReport(outfile);
      outfile.close();
   }
}
