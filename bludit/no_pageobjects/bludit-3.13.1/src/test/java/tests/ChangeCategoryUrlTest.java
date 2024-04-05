package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeCategoryUrlTest extends BaseTest {
	
	@Test
	public void changeCategoryUrl() {
		driver.findElement(By.id("jsusername")).sendKeys(username);
		driver.findElement(By.id("jspassword")).sendKeys(password);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Categories")).click();
		driver.findElement(By.linkText("Category001")).click();
		driver.findElement(By.id("jsnewKey")).clear();
		driver.findElement(By.id("jsnewKey")).sendKeys("aaanewurl001");
		driver.findElement(By.name("save")).click();
		
		assertEquals("/category/aaanewurl001", driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a")).getText());
	}
}
