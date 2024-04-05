package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.BaseNavBar;
import po.EditProfilePage;

public class LoginAsNewUser extends BaseTest {
	
	@Test
	public void loginAsNewUser() {
		String name ="Test User";
		String username = "tuser01";
		String password = "tpassword";
		
		EditProfilePage profile = new BaseNavBar(driver)
				.authorLogin()
				.setUsername(username)
				.setPassword(password)
				.login();
		
		assertEquals(name, profile.getName());
		profile.standardUserLogOut();
	}
}
