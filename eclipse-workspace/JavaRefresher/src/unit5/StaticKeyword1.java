package unit5;

public class StaticKeyword1 {

	//static = belongs to the class, not an instance of the class
	//non-static = belongs to the instance of the class (not the class itself)
	int someNumber = 10;
	
	public static void main(String[] args ) {
		StaticKeyword1 staticNumber = new StaticKeyword1();
		
		if (staticNumber.someNumber > 11) {
			 System.out.println("say something");
		 }
		
		StaticKeywordHuman1 aChild = new StaticKeywordHuman1();
		aChild.setAge(19);
		System.out.println(aChild.getStageOfLife());
	}
}
