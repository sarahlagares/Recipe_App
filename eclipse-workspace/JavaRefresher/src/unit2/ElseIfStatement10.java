package unit2;

public class ElseIfStatement10 {

	public static void main(String[] args) {
		int age = 64;

		if (age >= 19) {
			System.out.println("you are an adult");
			if (age > 65) {
				System.out.println("You are a senior");
			}
		} else if (age >= 13){
			System.out.println("you are a teenager");
		} else if (age == 12){
			System.out.println("you are a pre-teen");
		} else {
			System.out.println("you are a child");
		}
		System.out.println("Your age is " + age);
	}

}
