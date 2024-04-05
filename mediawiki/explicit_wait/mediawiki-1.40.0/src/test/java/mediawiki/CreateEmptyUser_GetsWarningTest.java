package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.CreateAccountPage;

public class CreateEmptyUser_GetsWarningTest extends BaseTest {

	@Test
	public void createEmptyUser_GetsWarning() {
		CreateAccountPage account = loginAsAdmin()
				.specialPages()
				.createAccount()
				.create();
		
		assertEquals("Compila questo campo.", account.getUsernameValidationMessage());
	}
	
}
