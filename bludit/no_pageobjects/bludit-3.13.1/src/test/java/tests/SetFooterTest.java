package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class SetFooterTest extends BaseTest {
	
	@Test
	public void setFooter() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("General")).click();
		driver.findElement(By.id("nav-general-tab")).click();
		driver.findElement(By.id("jsfooter")).clear();
		driver.findElement(By.id("jsfooter")).sendKeys("E2E Web testing benchmark");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		Thread.sleep(500);
		
		assertEquals("E2E Web testing benchmark", driver.findElement(By.id("jsfooter")).getAttribute("value"));
		
	}
	
}
