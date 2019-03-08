import java.util.Scanner;
public class AbsoluteValue{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int absValue = num >= 0 ? num : -1 * num ;
		System.out.println(absValue);
	}

}