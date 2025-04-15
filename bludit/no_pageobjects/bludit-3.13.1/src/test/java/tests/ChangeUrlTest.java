package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeUrlTest extends BaseTest {
	
	@Test
	public void changeUrlTest() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-seo-tab")).click();
		driver.findElement(By.id("jsslug")).clear();
		driver.findElement(By.id("jsslug")).sendKeys("new-post-url");
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Content")).click();
		
		assertEquals("/new-post-url", driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[2]/a")).getText());
	}
	
}
