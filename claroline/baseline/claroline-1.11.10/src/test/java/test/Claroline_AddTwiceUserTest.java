package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AdminAddNewUserPage;
import po.IndexPage;

public class Claroline_AddTwiceUserTest extends BaseTest {
	
	@Test
	public void runTest() throws InterruptedException{
		AdminAddNewUserPage aanup = new IndexPage(driver)
				.login("admin", "admin")
				.goToAdminPage()
				.addUser()
				.addNewStudent("Name001", "Firstname001", "user001", "password001", "password001");
		
		assertEquals("This username is already taken",aanup.getMessage());
		aanup.doLogout();
	}
}
