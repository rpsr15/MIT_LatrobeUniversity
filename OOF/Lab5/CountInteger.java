import java.util.Scanner;
public class CountInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		for (int i = 1; num > 0 ; num = num / 10)
		{
			System.out.print("#");
		}

	}

}
