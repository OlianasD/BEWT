package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class EditProtectedPage_ForbiddenTest extends BaseTest {
	
	@Test
	public void editProtectedPage_Forbidden() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("User001");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchInput")).sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.get(driver.getCurrentUrl()+"?veaction=edit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[3]/div/span[2]/a")).click();
		Thread.sleep(500);
		
		assertEquals("You do not have permission to edit this page, for the following reason:", driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/p")).getText());
		assertEquals("This page has been protected to prevent editing or other actions.", driver.findElement(By.className("permissions-errors")).getText());
	}
	
}