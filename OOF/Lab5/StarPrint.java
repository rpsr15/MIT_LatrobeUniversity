import java.util.Scanner;
public class StarPrint{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		for(int i = 1; i <= num ; i++)
		{
			for(int j = 1 ; j <= num ; j++){
				if(i == 1 || i == num || j == 1 || j == num ){
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
