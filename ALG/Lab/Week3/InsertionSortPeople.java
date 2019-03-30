
/*
Written by:	Julie Main, on March 11 2005, 15:07
Modified by: Richard Tresider, on March 09 2008
Modified by: Kinh Nguyen, on March 06 2018
	- Replace AbstractCollection with List, and Vector with ArrayList
*/

import java.io.*;
import java.util.*;

public class InsertionSortPeople {
   /*
    * Driver program - Loads people from the first file name specified - Stores
    * them in an array list - Sort the array list - Displays to screen the number
    * of comparisons in the sort - Writes the sorted people to the second file
    * specified
    */

   public static void main(String[] args) throws Exception {
      List<Person> people = new ArrayList<Person>();

      if (args.length != 2) {
         System.out.println("Usage: InsertionSortPeople <input file> <output file>");
         return;
      }

      // Get the names of the input and output files
      String inputFileName = args[0];
      String outputFileName = args[1];

      // Read data from input file to the people list
      loadData(inputFileName, people);

      // Reset the static attribute counter, which records
      // the number of comparsions
      Person.resetCounter();

      // Call gnomeSort to sort the list
      Sorter.insertionSort(people);

      // Print out the number of comparisons
      System.out.println(
            "There were " + Person.getCounter() + " comparisons to sort " + people.size() + " people with Gnome Sort");

      // Write the sorted list to output file
      writeData(outputFileName, people);
   }

   public static void loadData(String fileName, List<Person> people) throws IOException {
      Scanner infile = new Scanner(new File(fileName));

      while (infile.hasNext()) {
         String name = infile.nextLine();
         String[] tokens = name.split(",");
         String lastName = tokens[0].trim();
         String firstName = tokens[1].trim();

         String address = infile.nextLine();

         String suburbLine = infile.nextLine();
         tokens = suburbLine.split("\\t");
         // suburb, state and postcode are separated by tabs
         String suburb = tokens[0];
         String state = tokens[1];
         int postCode = Integer.parseInt(tokens[2]);

         Person person = new Person(firstName, lastName, address, suburb, state, postCode);
         people.add(person);

         infile.nextLine(); // consumethe line at the end of the record
         // For visibility, the last record is terminated with a dot
         // rather than a blank line
      }

      infile.close();
   }

   public static void writeData(String fileName, List<Person> people) throws IOException {
      PrintWriter outFile = new PrintWriter(new File(fileName));

      for (Person p : people) {
         outFile.println(p);
      }

      outFile.close();
   }
}
