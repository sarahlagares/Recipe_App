package unit3and4;

public class Methods4 {
	public static void main(String[] args) {
		// Class -> Blueprint for an object
		// Object -> a noun, it's an instantiation of a class

		// Data type, variable name, assignment operator
		int someNumber = 39;

		Objects1Human trevorPage = new Objects1Human("male", "5'10\"", "160", "brown");

//		trevorPage.eyeColor = "brown";
//		trevorPage.gender = "male";
//		trevorPage.height = "5'10\"";
//		trevorPage.weight = "160";

		System.out.println(trevorPage.getinfo());
//
//		Objects1Human elonMusk = new Objects1Human();
//
//		elonMusk.eyeColor = "blue";
//		elonMusk.gender = "male";
//		elonMusk.height = "6'1\"";
//		elonMusk.weight = "190";
//
//		System.out.println(elonMusk.getinfo());
//		
//		Objects1Human christinaPage = new Objects1Human();
//		
//		christinaPage.eyeColor = "brown";
//		christinaPage.gender = "female";
//		christinaPage.height = "5'5\"";
//		christinaPage.weight = "125";
//		
//		System.out.println(christinaPage.getinfo()); 
	}
}
