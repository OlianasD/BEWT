package base;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;


public class SeeArchivedArticle extends BaseTest {
	
	@Test
	public void seeArchivedArticle() {
		String title = "Your Modules";
		
		driver.findElement(By.linkText("Author Login")).click();
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys(rootPassword);
		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.linkText("Test menu item")).click();
		
		assertTrue(driver.findElement(By.linkText(title)).isDisplayed());
		
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.className("btn-primary")).click();
		
	}
}
