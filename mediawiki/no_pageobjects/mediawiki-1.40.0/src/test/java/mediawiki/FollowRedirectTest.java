package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class FollowRedirectTest extends BaseTest {

	
	@Test
	public void followRedirect() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Testing");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		
		assertEquals("Software testing", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("(Redirected from Testing)", driver.findElement(By.className("mw-redirectedfrom")).getText());
	}
	
}