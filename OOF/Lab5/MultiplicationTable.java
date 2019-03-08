import java.util.Scanner;
public class MultiplicationTable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int increment = 0;
		int start = 0;
		//Multiplication table
		for (int i = 1 ; i <= 12; i ++)
		{
			for (int j = 1; j <= 12; j++)
			{
				System.out.printf("%4d",i*j);
				//System.out.format("%+8d%n", n);    
			}
			System.out.println();
		}
	}

}