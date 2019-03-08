import java.util.Scanner;
public class CompoundInterest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float principalAmount = 25000.0F;
		float rateOfInterest = 4.0F;
		float a = 25000.0F;
		for(int i = 0; i < 10 ; i++)
		{   
			float interest = (a*rateOfInterest)/100;
			
			a += interest;
			System.out.println(a);
			
		}

	}

}
