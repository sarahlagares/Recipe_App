package unit5;

public class Services5 {

	public POJO4 createUser ( String username, String password) {
		POJO4 user = new POJO4();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
}
