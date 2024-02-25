package unit5;

public class Service5Application {
		public static void  main (String [] args) { 
			Services5 userService = new Services5 ();
			
			POJO4 sarahLagares = userService.createUser("smlagares@gmail.com", "password123");
			System.out.println(sarahLagares);
			
		}
}
