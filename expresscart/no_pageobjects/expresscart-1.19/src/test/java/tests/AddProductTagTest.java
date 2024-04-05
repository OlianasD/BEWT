package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddProductTagTest extends BaseTest {
	
	@Test
	public void testExpressCartAddProductTagNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.linkText("NewProduct000")).click();
		driver.findElement(By.id("productTags-tokenfield")).sendKeys("tag000,");
		driver.findElement(By.id("productUpdate")).click();
		
		assertEquals("tag000", driver.findElement(By.xpath("//*[@id=\"productEditForm\"]/div/div[9]/div/div/div/span")).getText());	
	}



}
