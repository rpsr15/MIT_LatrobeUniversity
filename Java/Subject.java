// Laboratory 05
import java.util.*;
import java.io.*;
public class Subject
{
   private String code;
   private String title;
   private int fieldCount;
   private String fieldWeights; // a string with tokens separated by |
                                // e.g. F|20|10|70
   private int studentCount;
   private Student[] students;
   private int[] finalMarks; 

   public Subject(String code, String title, int fieldCount, 
                  String fieldWeights, int studentCount, Student[] students)
   {
      this.code = code;
      this.title = title;
      this.fieldCount = fieldCount;
      this.fieldWeights = fieldWeights;
      this.studentCount = studentCount;
      this.students = students;
      finalMarks = new int[studentCount];
   }

     public static Subject loadData(Scanner infile)
     {
      // Question 1a) - to be completed
      // Read the subject's details: 
      // code, title, fieldCount, fieldWeights, studentCount
	  while(infile.hasNext())
	  {
	  }

      // Create an array of Student objects


      // read students' details, create Student instance for each student
      // and assign each student to an array element

      // create and return a Subject instance
	  double[] ma = {10.2,12.3};
	  Student st = new Student("12", "sf",  "df",ma);
	  Student[] stA = [st];
	 Subject sub =  new Subject("","",1,"",1,stA);
	  return sub;
    }

   public void displayStudents()
   {
      // Question 1b) - to be completed
   }

   public void writeReport(PrintWriter out)
   {
      // Question 2 - to be completed

      // One approach... (if you wish to follow it... )


      // 1. Call a private method calculateFinalMarks() to update final marks
      // 2. Need variables highestMarkIndex, lowestMarkIndex, totalMarks
      // int[] frequencies = new int[11] to store number of stars 


      // for loop to find highest and lowest mark indexes, total marks
      // and fill in frequencies array


      // output the required information followed by the histogram

   }
}
