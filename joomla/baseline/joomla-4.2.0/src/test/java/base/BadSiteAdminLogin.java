package base;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import po.SiteAdminLogin;

public class BadSiteAdminLogin extends BaseTest {
	
	@Test
	public void badSiteAdminLogin() {
		SiteAdminLogin login = loginAsAdmin()
			.siteAdmin()
			.setUsername("administrator")
			.setPassword("wrongpassword")
			.badLogin();
		
		assertEquals("Username and password do not match or you do not have an account yet.", login.getAlertMessage());
	}
}
