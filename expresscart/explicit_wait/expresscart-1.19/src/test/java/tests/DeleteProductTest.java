package tests;


import static org.junit.Assert.assertFalse;

import org.junit.Test;

import po.AdminLoginPage;
import po.ProductsPage;



public class DeleteProductTest extends BaseTest {


	@Test
	public void testExpressCartDeleteProduct() throws Exception {
		goToAdminHome();
		ProductsPage products = new AdminLoginPage(driver)
			.setEmail("owner@test.com")
			.setPassword("test")
			.doLogin()
			.products()
			.deleteFirstProduct()
			.products();
		assertFalse(products.containsProduct("NewProduct000"));
	}


}
