package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddEmptyDiscountCodeTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyDiscountCodeNoPO() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[2]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/main/div/h2/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"discountNewForm\"]/div[1]/div/div/button")).click();
		
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"discountNewForm\"]/div[2]/div")).getAttribute("class").contains("has-error has-danger"));
		assertTrue(driver.findElement(By.xpath("//*[@id=\"discountNewForm\"]/div[4]/div")).getAttribute("class").contains("has-error has-danger"));
		
		
	}



}
