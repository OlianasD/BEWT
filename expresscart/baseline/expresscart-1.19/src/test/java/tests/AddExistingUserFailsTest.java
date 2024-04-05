package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AdminLoginPage;
import po.AdminSidebar;


public class AddExistingUserFailsTest extends BaseTest {

	@Test
	public void testExpressCartExistingUserFails() throws Exception {
		goToAdminHome();
		AdminSidebar sidebar = new AdminLoginPage(driver)
			.setEmail("owner@test.com")
			.setPassword("test")
			.doLogin()
			.newUser()
			.setUsername("TestUser000")
			.setEmail("test000@test.com")
			.setPassword("password")
			.setConfirmPassword("password")
			.addUser();
			
		assertEquals("A user with that email address already exists", sidebar.getAlertText());
	}



}
