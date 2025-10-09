package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddProductTest extends BaseTest {
	
	@Test
	public void testExpressCartAddProduct() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[2]")).click();
		driver.findElement(By.id("productTitle")).sendKeys("NewProduct000");
		driver.findElement(By.id("productPrice")).sendKeys("15.95");
		driver.findElement(By.xpath("//*[@id=\"editor-wrapper\"]/div/div[3]/div[2]")).sendKeys("Description for product 000");
		driver.findElement(By.id("frm_edit_product_save")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(1000);
		assertEquals( "NewProduct000", driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div[3]/ul/li[2]/div/a")).getText());	
	}


}
