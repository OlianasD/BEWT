package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class CreateUserPageTest extends BaseTest {
	
	@Test
	public void createUserPage() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("User001");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.linkText("User001")).click();
		driver.findElement(By.linkText("Create source")).click();
		driver.findElement(By.id("wpTextbox1")).sendKeys("This is my user page");
		driver.findElement(By.id("wpSave")).click();
		
		
		assertEquals("User:User001", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("This is my user page",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());
	}
	
	
}