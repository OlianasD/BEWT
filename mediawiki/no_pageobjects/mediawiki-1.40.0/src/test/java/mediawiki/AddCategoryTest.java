package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class AddCategoryTest extends BaseTest {
	
	@Test
	public void addCategory() throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[3]/span[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/fieldset[1]/div/div/div/div/div/div[1]/div/input"))
			.sendKeys("Browser automation tools");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/fieldset[1]/div/div/div/div/div/div[1]/div/input"))
			.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea")).sendKeys("Added category");
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]")).click();
		Thread.sleep(1000);
		
		assertEquals("Selenium WebDriver", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("Browser automation tools", driver.findElement(By.xpath("//*[@id=\"mw-normal-catlinks\"]/ul/li/a")).getText());
	}
	
}