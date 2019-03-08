// Laboratory 05
public class Student
{
   private String studentNumber;
   private String familyName;
   private String initials;
   private double[] marks;

   public Student(String studentNumber, String familyName, String initials, 
                  double[] marks)
   {
      this.studentNumber = studentNumber;
      this.familyName = familyName;
      this.initials = initials;
      this.marks = marks;
   }

   public boolean setMark(int markNumber, double mark)
   // markNumber-1 is the position of the mark in the marks array
   {
      if (markNumber > marks.length)
      {
         return false;
      }
      else
      {
         marks[markNumber-1] = mark;
         return true;
      }
   }

   public double getMark(int markNumber)
   {
      if (markNumber > marks.length)
      {
         return -1;
      }
      else
      {
         return marks[markNumber-1];
      }
   }

   public String getName()
   {
      return familyName;
   }

   public String getInitials()
   {
      return initials;
   }

   public String getStudentNumber()
   {
      return studentNumber;
   }

   public String toString()
   {
      String description = getClass().getName() + 
             "[studentNumber " + studentNumber +
             " familyName " + familyName +
             " initials " + initials;
      for (double m: marks)
      {
         description += " " + m;
      }
      return description;
   }
}
