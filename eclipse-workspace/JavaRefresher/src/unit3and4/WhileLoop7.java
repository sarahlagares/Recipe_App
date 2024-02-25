package unit3and4;

import java.util.Date;

public class WhileLoop7 {

//	public static void main(String[] args) {
		
		//for loop example
//		ForLoops6 example1 = new ForLoops6();
//		example1.forLoopExample()
		
		
//		WhileLoopExample7 whileLoopExample = new WhileLoopExample7();
//		whileLoopExample.whileLoopExample();
		
				
//	}

	void whileLoopExample2() {
		
		Date now = new Date();
		Date stopNow = new Date(123, 10, 15, 22, 56, 0);
		System.out.println(now);
		System.out.println(stopNow);
		
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(1 + ": " + now);
			now = new Date();
			
		}
		
		
		
	}
}
