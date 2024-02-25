package unit3and4;

public class Objects1Human {
	// properties
	String gender;
	String height;
	String weight;
	String eyeColor;

	// code below is from lesson 10-Constructors
	
	Objects1Human (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	Objects1Human() {
		System.out.println("A human is being created");
	}
	
	// code below is from Methods(4) video

	// (visibility modifier), return type, method name, params, scope
	String getinfo() {
		return "Gender: " + gender + ", Height: " + height + 
				", Eye Color: " + eyeColor + ", Weight: " + weight;
	}
	
//	void setProperties(String gender, String height, String weight, String eyeColor) {
//		this.gender = gender;
//		this.height = height;
//		this.weight = weight;
//		this.eyeColor = eyeColor;
//	}
}
