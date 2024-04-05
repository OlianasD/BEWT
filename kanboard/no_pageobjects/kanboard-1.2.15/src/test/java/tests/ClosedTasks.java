package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class ClosedTasks extends BaseTest {
	
	@Test
	public void searchClosedTask() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.id("form-search")).sendKeys("status:closed");
		driver.findElement(By.id("form-search")).sendKeys(Keys.RETURN);
		
		assertEquals("task 3", driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/span/a")).getText());		  
	}
		  

		  
}
