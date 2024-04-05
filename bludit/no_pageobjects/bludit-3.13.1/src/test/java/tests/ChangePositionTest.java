package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangePositionTest extends BaseTest {
	
	@Test
	public void changePosition() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Content")).click();
		driver.findElement(By.xpath("//*[@id=\"pages\"]/table/tbody/tr[1]/td[3]/a[2]")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		driver.findElement(By.id("jsposition")).clear();
		driver.findElement(By.id("jsposition")).sendKeys("30");
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("jsbuttonSave")).click();
		driver.findElement(By.id("jsoptionsSidebar")).click();
		driver.findElement(By.id("nav-advanced-tab")).click();
		
		assertEquals("30", driver.findElement(By.id("jsposition")).getAttribute("value"));
	}
}
