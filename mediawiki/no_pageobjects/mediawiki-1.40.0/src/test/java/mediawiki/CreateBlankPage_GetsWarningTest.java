package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CreateBlankPage_GetsWarningTest extends BaseTest {
	
	
	@Test
	public void createBlankPage_GetsWarning() {
		String res = "Warning: The page you are creating is blank. If you click \"Save page\" again, the page will be created without any content.";
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Empty");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Empty")).click();
		driver.findElement(By.id("wpSave")).click();
		
		assertEquals(res, driver.findElement(By.id("mw-blankarticle")).getText());

	}
	
}