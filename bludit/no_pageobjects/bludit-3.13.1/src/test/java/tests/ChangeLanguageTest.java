package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ChangeLanguageTest extends BaseTest {
	
	@Test
	public void changeLanguage() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("General")).click();
		driver.findElement(By.id("nav-language-tab")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("jslanguage"))).selectByVisibleText("Italiano (Italia)");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		Thread.sleep(1000);
		
		assertEquals("Italiano (Italia)", new Select(driver.findElement(By.id("jslanguage"))).getFirstSelectedOption().getText());
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("jslanguage"))).selectByVisibleText("English");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		Thread.sleep(1000);
		assertEquals("English", new Select(driver.findElement(By.id("jslanguage"))).getFirstSelectedOption().getText());
		
	}
	
}