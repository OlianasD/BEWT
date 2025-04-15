package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class DeleteProductTagTest extends BaseTest {
	
	@Test
	public void testExpressCartDeleteProductTag() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.linkText("NewProduct000")).click();
		driver.findElement(By.xpath("//*[@id=\"productEditForm\"]/div/div[9]/div/div/div/a")).click();
		driver.findElement(By.id("productUpdate")).click();
		
		assertTrue(driver.findElement(By.id("productTags-tokenfield")).getAttribute("value").equals(""));
		
		
	}


}
