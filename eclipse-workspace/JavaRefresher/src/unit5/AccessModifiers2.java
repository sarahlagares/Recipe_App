package unit5;

public class AccessModifiers2 {

	public String someVariable = "Hi there";
	
	//Access Modifiers = private, public, protected
	public static void main (String[] args) {
		
		StaticKeywordHuman1 sarahLagares = new StaticKeywordHuman1();
		sarahLagares.setAge(23);
		
		System.out.println(sarahLagares.getStageOfLife());
	}
	
}
