package unit3and4;

public class DotProperties3 {

	public static void main(String[] args) {
	//Class -> Blueprint for an object
			//Object -> a noun, it's an instantiation of a class
			
			//Data type, variable name, assignment operator
	        int someNumber = 39;
	
			Objects1Human trevorPage = new Objects1Human();
			
			trevorPage.eyeColor = "brown";
			trevorPage.gender = "male";
			trevorPage.height = "5'10\"";
			trevorPage.weight = "160";
			
			System.out.println(trevorPage);
			
			Objects1Human elonMusk = new Objects1Human();
			
			elonMusk.eyeColor = "blue";
			elonMusk.gender = "male";
			elonMusk.height = "6'1\"";
			elonMusk.weight = "190";
			
			System.out.println(elonMusk);
			
}
}