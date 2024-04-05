package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class RevertLastCommitTest extends BaseTest {
	
	
	@Test
	public void revertLastCommit() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("View history")).click();
		driver.findElement(By.linkText("rollback 1 edit")).click();
		
		assertEquals("Reverted edits by User001 (talk | contribs | block); changed back to last revision by Admin (talk | contribs | block).", driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/p[1]")).getText());
		
		driver.findElement(By.linkText("Selenium WebDriver")).click();
		
		assertEquals("Selenium WebDriver", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("Developer: Selenium Latest version: 3.141.59Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());

		
	}
	
}