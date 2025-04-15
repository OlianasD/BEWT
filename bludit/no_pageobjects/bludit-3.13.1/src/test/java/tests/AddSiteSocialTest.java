package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddSiteSocialTest extends BaseTest {
	
	@Test
	public void addSiteSocial() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("General")).click();
		driver.findElement(By.id("nav-social-tab")).click();
		driver.findElement(By.id("jsinstagram")).clear();
		driver.findElement(By.id("jsinstagram")).sendKeys("https://instagram.com/bludit595159516");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		Thread.sleep(500);
		
		assertEquals("https://instagram.com/bludit595159516", driver.findElement(By.id("jsinstagram")).getAttribute("value"));
		
	}
	
}


