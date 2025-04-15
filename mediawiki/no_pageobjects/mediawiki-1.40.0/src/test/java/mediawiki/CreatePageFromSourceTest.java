package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreatePageFromSourceTest extends BaseTest {
	
	@Test
	public void createPageFromSource() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Selenium WebDriver")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ca-edit\"]/a")).click();
		driver.findElement(By.id("wpTextbox1")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).");
		driver.findElement(By.id("wpSave")).click();
		Thread.sleep(1000);
		assertEquals("Selenium WebDriver", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());
	}
	
}