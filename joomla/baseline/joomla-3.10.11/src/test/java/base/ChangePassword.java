package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.BaseNavBar;
import po.EditProfilePage;

public class ChangePassword extends BaseTest {
	
	@Test
	public void changePassword() {
		String username = "tuser01";
		String oldPassword = "tpassword";
		String password = "newpassword01";
		
		EditProfilePage profile = new BaseNavBar(driver)
				.authorLogin()
				.setUsername(username)
				.setPassword(oldPassword)
				.login()
				.setPassword(password)
				.confirmPassword(password)
				.submit();
		
		assertEquals("Profile saved.", profile.getAlertMessage());
		profile.standardUserLogOut();
		
	}
	
}
