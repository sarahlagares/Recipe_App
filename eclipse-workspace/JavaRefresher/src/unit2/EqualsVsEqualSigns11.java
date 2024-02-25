package unit2;

public class EqualsVsEqualSigns11 {

	public static void main(String[] args) {
		// one "=" just assigns the value to the object.
		// Double "==" actually compares the value to the object
		int age = 18;

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
		
		String output = "Your age is " + age;
		
		System.out.println(output);
		
		if (output.equals("Your age is 18")) {
			System.out.println("Yay you can vote!");
		} else if (output == "your age is 21") {
			System.out.println("yay you can drink");
		}
	}

}
