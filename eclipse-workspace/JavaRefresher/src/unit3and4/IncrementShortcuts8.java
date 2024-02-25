package unit3and4;

public class IncrementShortcuts8 {

	void forLoopExample() {
		//init; termination condition; increment
		for (int i = 1; i <= 100; i = i + 1) {
			System.out.print(i + ": ");
			System.out.println(i * i);
		}
		System.out.println("Done");
	}

	void incrementExample1() {
		System.out.println("Incrementing example");
		for (int j=0; j<10; j++) {
			System.out.println(j);
		}
		
		for (int j=9; j>0; j = j--) {
			System.out.println(j);
		}

	}

	void incrementExample2() {

	}
}
