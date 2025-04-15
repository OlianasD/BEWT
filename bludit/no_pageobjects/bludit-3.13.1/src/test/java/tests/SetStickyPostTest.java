package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SetStickyPostTest extends BaseTest {
	
	@Test
	public void setStickyPost() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[3]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		Thread.sleep(500);
		new Select(driver.findElement(By.id("jstypeSelector"))).selectByVisibleText("Sticky");
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.id("sticky-tab")).click();
		assertEquals("Set up your new site", driver.findElement(By.xpath("//*[@id=\"sticky\"]/table/tbody/tr/td[1]/div[1]/a")).getText());
		
	}
	
}
