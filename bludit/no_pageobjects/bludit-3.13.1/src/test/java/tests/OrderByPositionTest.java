package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OrderByPositionTest extends BaseTest {
	
	@Test
	public void orderByPosition() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("General")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("jsorderBy"))).selectByVisibleText("Position");
		driver.findElement(By.xpath("//*[@id=\"jsform\"]/div[1]/div/button")).click();
		Thread.sleep(1000);
		assertEquals("Position", new Select(driver.findElement(By.id("jsorderBy"))).getFirstSelectedOption().getText());
	}
	
	
}