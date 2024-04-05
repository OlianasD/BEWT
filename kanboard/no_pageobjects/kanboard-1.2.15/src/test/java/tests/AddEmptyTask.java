package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddEmptyTask extends BaseTest {
	
		  
	@Test
	public void addEmptyTask() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("Test 2")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div/div[4]/div/div/button")).click();
		
		assertEquals("The title is required", driver.findElement(By.className("form-errors")).getText());
	}
		  
		  
}