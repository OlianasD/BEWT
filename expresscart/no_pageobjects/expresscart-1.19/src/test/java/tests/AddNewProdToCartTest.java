package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;




public class AddNewProdToCartTest extends BaseTest {
	
	@Test
	public void testExpressCartAddNewProdToCart() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div/a/h3")).click();
		driver.findElement(By.className("product-add-to-cart")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"navbarMenu\"]/ul/li[1]/a")).click();
		assertEquals("1", driver.findElement(By.id("cart-count")).getText());
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[2]/a")).click();
		Thread.sleep(500);
		
		assertEquals("NewProduct000", driver.findElement(By.xpath("//*[@id=\"cart\"]/div[1]/div/div[1]/div[1]/div/div/div[2]/div/div[1]/h6/a")).getText());
	}



}
