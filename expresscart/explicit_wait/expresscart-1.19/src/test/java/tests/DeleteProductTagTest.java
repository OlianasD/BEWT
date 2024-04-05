package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import po.AdminLoginPage;
import po.EditProductPage;


public class DeleteProductTagTest extends BaseTest {

	@Test
	public void testExpressCartDeleteProductTag() throws Exception {
		goToAdminHome();
		EditProductPage product = new AdminLoginPage(driver)
			.setEmail("owner@test.com")
			.setPassword("test")
			.doLogin()
			.products()
			.goToProduct("NewProduct000")
			.deleteTag()
			.saveProduct();
		
		assertTrue(product.productHasNoTags());
	
		
	}


}
