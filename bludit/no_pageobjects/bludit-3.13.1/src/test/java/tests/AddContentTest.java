package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddContentTest extends BaseTest {
	
	@Test
	public void addContentTest() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("New content")).click();
		driver.findElement(By.id("jstitle")).sendKeys("Test Content");
		driver.findElement(By.id("jsbuttonSave")).click();
		
		assertEquals("Test Content", driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[1]/div[1]/a")).getText());
	}
}