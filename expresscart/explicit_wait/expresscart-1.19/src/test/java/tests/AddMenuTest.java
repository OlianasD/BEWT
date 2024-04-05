package tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import po.AdminLoginPage;
import po.MenuPage;


public class AddMenuTest extends BaseTest {


	@Test
	public void testExpressCartAddMenu() throws Exception {
		goToAdminHome();
		MenuPage menus = new AdminLoginPage(driver)
			.setEmail("owner@test.com")
			.setPassword("test")
			.doLogin()
			.menu()
			.setName("Test Menu")
			.setLink("/category/tag000")
			.addMenu();
		assertEquals("Menu created successfully.", menus.getAlertText());
		
	}



}
