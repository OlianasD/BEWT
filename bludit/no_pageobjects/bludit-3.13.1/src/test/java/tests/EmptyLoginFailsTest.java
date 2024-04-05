package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;


public class EmptyLoginFailsTest extends BaseTest {
	
	@Test
	public void emptyLogin_Fails() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys("");
		driver.findElement(By.id("jspassword")).sendKeys("");
		driver.findElement(By.name("save")).click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.id("alert")).isDisplayed());
		assertEquals("Username or password incorrect", driver.findElement(By.id("alert")).getText());
	}
}
