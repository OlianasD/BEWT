package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CreateRedirectTest extends BaseTest {

	
	@Test
	public void createRedirect() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Testing");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Testing")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ca-edit\"]/a")).click();
		driver.findElement(By.id("wpTextbox1")).sendKeys("#REDIRECT [[Software testing]]");
		driver.findElement(By.id("wpSave")).click();
		
		assertEquals("Software testing", driver.findElement(By.className("redirectText")).getText());
	}
	
}