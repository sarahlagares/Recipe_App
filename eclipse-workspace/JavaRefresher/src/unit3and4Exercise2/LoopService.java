package unit3and4Exercise2;

import java.util.Scanner;

public class LoopService {

	void inputCheck(Integer userInput) {
		Scanner sc = new Scanner(System.in);
		
		while (userInput <= 50 || userInput >= 300) {
			System.out.println("Oops! Try again");
			userInput = sc.nextInt();
		}
		System.out.println("The number you typed in was: " + userInput);
	}

}
