package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class AdminEditProtectedPage_GetsWarningTest extends BaseTest {
	
	@Test
	public void adminEditProtectedPage_GetsWarning() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(500);
		
		assertEquals("Warning: This page has been protected so that only users with administrator privileges can edit it. The latest log entry is provided below for reference:",
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/p")).getText());

	}
	
}