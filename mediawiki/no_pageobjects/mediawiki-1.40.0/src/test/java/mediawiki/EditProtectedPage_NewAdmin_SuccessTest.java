package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class EditProtectedPage_NewAdmin_SuccessTest extends BaseTest {
	
	@Test
	public void editProtectedPage_NewAdmin_Success() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("User001");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[6]/div[1]/div[1]")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[6]/div[1]/div[1]")).sendKeys(" Selenium WebDriver accepts commands (sent in Selenese, or via a Client API) and sends them to a browser.");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea")).sendKeys("Page expanded");
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]")).click();
		Thread.sleep(1000);
		
		assertEquals("Selenium WebDriver", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("Developer: Selenium Latest version: 3.141.59Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE). Selenium WebDriver accepts commands (sent in Selenese, or via a Client API) and sends them to a browser.", 
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());
	}
	
}