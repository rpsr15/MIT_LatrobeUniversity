import java.util.Scanner;
public class PalindromIgnoreCaseCheck{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		String line = key.nextLine();
		int length = line.length() - 1;
		
		for(int i = 0 ,  j = length; i <= j ; i++,j--)
		{
			boolean test = (line.charAt(i)+"").equalsIgnoreCase(line.charAt(j)+"");
			if(!test)
			{
				System.out.println("It is not a palindrom");
				System.exit(0);
			}
		}
		System.out.println("The string is a palindrome");
		key.close();
	}

}