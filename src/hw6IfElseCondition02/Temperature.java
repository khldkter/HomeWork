package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] ags) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Put today's Temperature please---");
		int todaysTemperature = scanner.nextInt();
		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperature < 55) {
			System.out.println("Pleasant");
		} else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperature < 101) {
			System.out.println("Hot");
		} else {
			System.out.println("Ice on my Head Please");
		}

		scanner.close();
	}

}
