package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.EditProfilePage;

public class AdminLoginTest extends BaseTest {
	
	@Test
	public void adminLoginTest() {
		EditProfilePage profile = loginAsAdmin();
		assertEquals("Super User", profile.getName());
		profile.adminLogout();
	}
}