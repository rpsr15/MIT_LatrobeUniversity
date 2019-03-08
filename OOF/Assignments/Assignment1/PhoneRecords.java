import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PhoneRecords {
	public static void main(String[] args) {
		// scanner object to read input from command line
		Scanner keyboard = new Scanner(System.in);
		System.out.println("**19539061 Ravi Rathoe Assignment A**\nPhone Record Search");
		System.out.println("Enter file name");
		String fileName = keyboard.nextLine();
		System.out.println(fileName);
		// if fine name is an empty string, the program would exit while displaying
		// "file not found"
		if (fileName.isEmpty()) {
			System.out.print("No file name was provided!!");
			keyboard.close();
			System.exit(0);
		}
		// Read type of call and direction from user
		System.out.println("Enter type of call international(I), local(L), special(S)");
		String typeOfCall = keyboard.next();

		System.out.println("Enter if phone call was outbound(O) or inbound(I)");
		String callDirection = keyboard.next();
		Scanner inputStream = null;
		// scanner needs an input stream, in this case it is file inputstream
		try {
			inputStream = new Scanner(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("file not found.exiting!");
			System.exit(0);
		}
		// move to fourth line of input file as we dont require information from first
		// three lines
		inputStream.nextLine();
		inputStream.nextLine();
		inputStream.nextLine();

		while (inputStream.hasNext()) { // reading one line at a time
			String line = inputStream.nextLine();
			// find type is on first index and then we find last index of delimiter ":" and
			// subtract one index to get bound and subtract two
			// indexes to get number, which starts at index 2 in all cases.
			String typeCall = line.substring(0, 1);
			int lastIndex = line.lastIndexOf(':');
			// assign O or I for respective "+"/"-"
			String bound = (line.charAt(lastIndex - 1) + "").equals("+") ? "O" : "I";
			String number = line.substring(2, lastIndex - 2);
			// verify if details match to the provided by user
			if (typeOfCall.equalsIgnoreCase(typeCall) && callDirection.equalsIgnoreCase(bound)) {
				// if matched to the preference given by user print it
				System.out.println(number);
			}
		}
		inputStream.close();
		keyboard.close();
	}
}
