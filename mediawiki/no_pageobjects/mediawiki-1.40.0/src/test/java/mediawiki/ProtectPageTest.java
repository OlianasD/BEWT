package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ProtectPageTest extends BaseTest {
	
	@Test
	public void protectPage() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("p-cactions-checkbox")).click();
		driver.findElement(By.linkText("Protect")).click();
		driver.findElement(By.xpath("//*[@id=\"mwProtect-level-edit\"]/div/span")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"mw-Protect-submit\"]/button")).click();
		driver.findElement(By.id("p-cactions-checkbox")).click();
		driver.findElement(By.linkText("Change protection")).click();
		
		assertEquals("Allow only administrators", driver.findElement(By.xpath("//*[@id=\"ooui-1\"]")).getText());
	}
	
}