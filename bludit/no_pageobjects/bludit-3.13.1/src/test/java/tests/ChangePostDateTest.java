package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangePostDateTest extends BaseTest {

	@Test
	public void changePostDate() throws InterruptedException {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		driver.findElement(By.id("jsdate")).clear();
		driver.findElement(By.id("jsdate")).sendKeys("2022-08-03 14:42:26");
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		Thread.sleep(500);
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		
		assertEquals("2022-08-03 14:42:26", driver.findElement(By.id("jsdate")).getAttribute("value"));
		
	}
}