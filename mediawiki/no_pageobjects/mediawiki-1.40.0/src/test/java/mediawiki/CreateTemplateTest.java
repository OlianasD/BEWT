package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateTemplateTest extends BaseTest {
	
	@Test
	public void createTemplate() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Template:Software");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Template:Software")).click();
		driver.findElement(By.id("wpTextbox1")).sendKeys("Developer: {{{dev}}} Latest version: {{{ver}}}");
		driver.findElement(By.id("wpSave")).click();
		
		assertEquals("Template:Software", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("Developer: {{{dev}}} Latest version: {{{ver}}}",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());
	}
	
}