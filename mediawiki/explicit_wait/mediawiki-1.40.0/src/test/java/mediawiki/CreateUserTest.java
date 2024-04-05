package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.CreateAccountPage;

public class CreateUserTest extends BaseTest {

	@Test
	public void createUser() {
		CreateAccountPage account = loginAsAdmin()
				.specialPages()
				.createAccount()
				.setUsername("User001")
				.setPassword("Password001")
				.confirmPassword("Password001")
				.setRealName("Real Name 001")
				.create();
		
		assertEquals("The user account for User001 (talk) has been created.", account.getSuccessMessage());
	}
	
}