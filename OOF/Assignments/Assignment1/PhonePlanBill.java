import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PhonePlanBill {

	public static void main(String[] args) {
		// variables to store call records and constant info
		String fileName = "", dataPlan = null, callPlan = null;
		int dataPlanA = 500, dataPlanB = 800, dataPlanC = 1000;
		int callCapA = 50, callCapB = 100, callCapC = 200;
		int callLimitA = 100, callLimitB = 300, callLimitC = 1000;
		int dataUsed = 0;
		int userDataPlanLimit = 0, userCallCap = 0, userCallLimit = 0;
		String userDataPlan = null, userCallPlan = null;
		double localConnectionFee = 0.03, internationalConnectionFee = 0.05, specialConnectionFee = 0.05,
				dataCost = 0.05;
		double localCallCost = 0.05, internationalCallCost = 0.07, specialCallCost = 0.10;
		double specialBill = 0.0, localBill = 0.0, internationalBill = 0.0, dataBill = 0.0, totalBill = 0.0,
				localAboveCap = 0.0;
		Scanner keyboard = null, inputStream = null;
		System.out.println("**19539061 Ravi Rathore Assignment A**\nPhone Plan Bill");
		System.out.println("Enter file name");
		keyboard = new Scanner(System.in);
		fileName = keyboard.nextLine();
		keyboard.close();
		// check if filename is empty,if yes exit
		if (fileName.isEmpty()) {
			System.out.println("File name is empty. exiting.....");
			System.exit(0);
		}
		try {
			inputStream = new Scanner(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Cant open file or file not found.exiting");
			System.exit(0);
		}
		int lineCount = 0;
		int localCallCount = 0, localCallDuration = 0;
		int specialCallCount = 0, specialCallDuration = 0;
		int internationalCallCount = 0, internationalCallDuration = 0;
		while (inputStream.hasNext()) {
			lineCount++;
			String line = inputStream.nextLine();
			switch (lineCount) {
			case 1:
				dataPlan = line.substring(line.indexOf(':') + 1).trim();
				if (dataPlan.equals("A")) {
					userDataPlanLimit = dataPlanA;
					userDataPlan = "A";
				} else if (dataPlan.equals("B")) {
					userDataPlanLimit = dataPlanB;
					userDataPlan = "B";
				} else {
					userDataPlanLimit = dataPlanC;
					userDataPlan = "C";
				}
				break;
			case 2:
				dataUsed = Integer.parseInt(line.trim());
				break;
			case 3:
				callPlan = line.substring(line.indexOf(':') + 1).trim();
				if (callPlan.equals("A")) {
					userCallCap = callCapA;
					userCallLimit = callLimitA;
					userCallPlan = "A";
				} else if (callPlan.equals("B")) {
					userCallCap = callCapB;
					userCallLimit = callLimitB;
					userCallPlan = "B";
				} else {
					userCallCap = callCapC;
					userCallLimit = callLimitC;
					userCallPlan = "C";
				}
				break;
				// lines from 4 containing call records
			default:
				if (line.contains("+")) // parse if it is an outbound call
				{
					char callType = line.charAt(0);
					int duration = 0;
					switch (callType) {
					case 'S':
						specialCallCount++;
						duration = Integer.parseInt(line.substring(17));
						specialCallDuration += duration;
						break;
					case 'I':
						internationalCallCount++;
						duration = Integer.parseInt(line.substring(15));
						internationalCallDuration += duration;
						break;
					case 'L':
						localCallCount++;
						duration = Integer.parseInt(line.substring(13));
						localCallDuration += duration;
						break;
					}
				}
				break;
			}
		}
		specialBill = specialCallCount * specialConnectionFee + specialCallDuration * specialCallCost;
		// calculation international call bill
		internationalBill = internationalCallCount * internationalConnectionFee
				+ internationalCallDuration * internationalCallCost;
		// calcuation for local call
		double tempTotal = localCallCount * localConnectionFee + localCallDuration * localCallCost;
		System.out.println(tempTotal);
		if (userCallLimit > tempTotal) {
			localBill = userCallCap;
		} else {
			localBill = userCallCap + (tempTotal - userCallLimit);
			localAboveCap = (tempTotal - userCallLimit);
		}
		// calculation for data bill
		dataBill = userDataPlanLimit > dataUsed ? 0.0 : (dataUsed - userDataPlanLimit) * dataCost;
		// Print Phone Bill
		totalBill = specialBill + internationalBill + dataBill + localBill;
		System.out.println("PHONE BILL\nPhone plan : " + userCallPlan + "\nData plan : " + userDataPlan);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Local calls");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Local calls capped cost                    $ " + userCallCap);
		System.out.println("Local calls cost above cap                 $ " + localAboveCap);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("International calls");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("International calls cost                   $ " + internationalBill);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Special calls");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Special calls cost                         $ " + specialBill);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Data");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Data charges                               $ " + dataBill);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("Total cost                                 $ " + totalBill);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
	}

}
