package unit2;

import java.util.Scanner;

public class ReadingUserInput12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("type out any input");
		String userInput = scanner.nextLine();
		
		System.out.println("You typed in: " + userInput);
	}

}
