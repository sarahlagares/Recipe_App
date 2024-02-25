package unit3and4;

import java.util.Random;

public class RandomNumberGeneration9 {

	public static void main(String[] args) {
		// Class -> Blueprint for an object
		// Object -> a noun, it's an instantiation of a class

		// Data type, variable name, assignment operator
		Random random = new Random();
		
		
		for (int i=0; i<20; i = i+1) {
			System.out.println("Random number is" + random.nextInt(10)); 
		}
		

		Objects1Human trevorPage = new Objects1Human();
		Objects1Human elonMusk = new Objects1Human();
		Objects1Human christinaPage = new Objects1Human();

//		trevorPage.setProperties("male", "5'10\"", "160", "brown");
//		elonMusk.setProperties("male", "6'1\"", "190", "blue");
//		christinaPage.setProperties("female", "5'5\"", "125", "brown");
		
		System.out.println(trevorPage.getinfo());
		System.out.println(elonMusk.getinfo());
		System.out.println(christinaPage.getinfo());
	
	

	}	
	
}
