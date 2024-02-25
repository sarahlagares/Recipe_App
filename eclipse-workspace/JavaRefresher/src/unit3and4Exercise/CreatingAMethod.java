package unit3and4Exercise;

import java.util.Scanner;

public class CreatingAMethod {

	public static void main(String[] args) {
  
		System.out.println("Type a number between 50 and 300");
		
		Scanner sc = new Scanner(System.in);
		Integer userInput = sc.nextInt();
		
		System.out.println("The number you typed in was: " + checkUserInput(userInput));
			
			
		
		}

	private static Integer checkUserInput(Integer userInput) {
		if (userInput <= 50 || userInput >= 300) {
				return null;
			}
		return userInput;
	}
}
