package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewTask extends BaseTest {
		  
	@Test
	public void addNewTask() {
		String taskName = "task 3";
		
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("Test 2")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown\"]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form-title\"]")).sendKeys(taskName);
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div/div[4]/div/div/button")).click();
		
		assertEquals(taskName, driver.findElement(By.xpath("//*[@id=\"board\"]/tbody/tr[2]/td[1]/div[1]/div/div[2]/div[3]/a")).getText());
		
	}
		  
		  
}
