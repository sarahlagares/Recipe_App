package unit3and4;

public class Constructors10 {

	// properties
		String gender;
		String height;
		String weight;
		String eyeColor;
		
		//code below is about 
		Constructors10 () {
			System.out.println("A human is being created");
		}

		// code below is from Methods(4) video

		// (visibility modifier), return type, method name, params, scope
		String getinfo() {
			return "Gender: " + gender + ", Height: " + height + 
					", Eye Color: " + eyeColor + ", Weight: " + weight;
		}
		
		void setProperties(String gender, String height, String weight, String eyeColor) {
			this.gender = gender;
			this.height = height;
			this.weight = weight;
			this.eyeColor = eyeColor;
		}
}
