package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class UseDiscountCodePercentTest extends BaseTest {
	
	@Test
	public void testExpressCartUseDiscountCodePercentNoPO() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("customerloginForm")).click();
		Thread.sleep(1000);
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div/a/h3")).click();
		driver.findElement(By.className("product-add-to-cart")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"cart\"]/div[2]/div/a")).click();
		driver.findElement(By.id("checkoutInformation")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[1]/a[2]")).click();
		driver.findElement(By.id("discountCode")).sendKeys("discperc000");
		driver.findElement(By.id("addDiscountCode")).click();
		Thread.sleep(6000);
		
		
		assertTrue(driver.findElement(By.tagName("body")).getText().contains("Discount: £7.98"));
	}


}
