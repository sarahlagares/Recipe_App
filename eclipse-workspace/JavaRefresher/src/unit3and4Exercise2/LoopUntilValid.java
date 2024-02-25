package unit3and4Exercise2;

import java.util.Scanner;

public class LoopUntilValid {

	public static void main(String[] args) {

		System.out.println("Type in a number between 50 and 300");
		Scanner sc = new Scanner(System.in);
		Integer userInput = sc.nextInt();

		LoopService loopMethod = new LoopService(); 
		loopMethod.inputCheck(userInput);

	}


}
