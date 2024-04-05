package tests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeBoardSettings extends BaseTest {

	
	@Test
	public void changeBoardSettings() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Board settings")).click();
		driver.findElement(By.id("form-board_public_refresh_interval")).clear();
		driver.findElement(By.id("form-board_public_refresh_interval")).sendKeys("85");
		driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/form/div/button")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Application settings")).click();
		driver.findElement(By.linkText("Board settings")).click();
		
		assertEquals("85", driver.findElement(By.id("form-board_public_refresh_interval")).getAttribute("value"));
		
	}
		  
		  
}
