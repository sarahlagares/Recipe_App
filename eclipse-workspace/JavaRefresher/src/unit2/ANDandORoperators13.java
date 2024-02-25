package unit2;

import java.util.Scanner;

public class ANDandORoperators13 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("type in your name: ");
			String name = scanner.nextLine();
			System.out.println("Type in your age: ");
			String age = scanner.nextLine();

			if (name.equals("Sarah") 
					&& age.equals("23")) {
				System.out.println("Hey hot stuff ;)");
			} else {
				System.out.println("Hello: " + name);
			}

			scanner.close();
		}
	}

}
