package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AdminAddNewUserPage;
import po.IndexPage;

public class Claroline_AddWrongPasswordUserTest extends BaseTest {
	
	@Test
	public void runTest() throws InterruptedException{
		AdminAddNewUserPage aanup = new IndexPage(driver)
				.login("admin", "admin")
				.goToAdminPage()
				.addUser()
				.addNewStudent("user", "user", "user", "password", "passowrd");
		
		assertEquals("You typed two different passwords",aanup.getMessage());
		aanup.doLogout();
	}
}
