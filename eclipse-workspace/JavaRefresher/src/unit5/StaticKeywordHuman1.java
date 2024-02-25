package unit5;

public class StaticKeywordHuman1 {

	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable => better to keep them private so we can have getters 
	// and setters so they can still be accessible in other classes
	private int age;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getStageOfLife () {
		if (age < TEENAGER_AGE) {
			return "Child";
		}else if (age < ADULT_AGE) {
			return "Teenager";
		}else if ( age < SENIOR_AGE){
		    return "Adult";
		}else {
			return "Senior";
		}
	}
}
