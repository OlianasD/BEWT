package mediawiki;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ApplyTemplateTest extends BaseTest {
	
	@Test
	public void applyTemplate() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Edit source")).click();
		driver.findElement(By.id("wpTextbox1")).click();
		driver.findElement(By.id("wpTextbox1")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		driver.findElement(By.id("wpTextbox1")).sendKeys("{{Software|dev=Selenium|ver=3.141.59}}");
		driver.findElement(By.id("wpSave")).click();
		
		assertEquals("Selenium WebDriver", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertTrue(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText()
				.contains("Developer: Selenium Latest version: 3.141.59"));
	}
	
}