public class UpperCaseString
{
   public static void main(String[] args)
   {
      String first = "cup";
      String second = "of";
      String third = "java";
      String concatenatedString = first + second + third;
      System.out.println("concatenated string is " + concatenatedString );
      String upperCaseString = concatenatedString.toUpperCase();
      System.out.println(upperCaseString);
    }
}
