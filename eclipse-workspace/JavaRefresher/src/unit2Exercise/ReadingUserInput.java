package unit2Exercise;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Type a number between 50 and 300");
			String input = scanner.nextLine();
			Integer convertedInput = Integer.parseInt(input);
			
			if ((convertedInput <= 50) || (convertedInput >= 300)) {
				System.out.println("No!");
			} else {
				System.out.println("Yes!");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
