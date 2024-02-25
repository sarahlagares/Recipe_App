package unit3and4;

public class MethodInputs5 {
	public static void main(String[] args) {
		// Class -> Blueprint for an object
		// Object -> a noun, it's an instantiation of a class

		// Data type, variable name, assignment operator
		int someNumber = 39;

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
