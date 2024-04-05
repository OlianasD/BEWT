package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewPrivateProject extends BaseTest {
	
	@Test
	public void addNewPrivateProject() throws InterruptedException {
		String projName = "Test private 2";
		
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("New personal project")).click();
		driver.findElement(By.id("form-name")).sendKeys(projName);
		driver.findElement(By.xpath("//*[@id=\"project-creation-form\"]/div[2]/div/button")).click();
		Thread.sleep(1000);
		
		assertEquals(projName, driver.findElement(By.className("title")).getText());
		assertEquals("This project is open", driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/ul/li[1]")).getText());	
		assertTrue(driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/ul/li[3]")).getText().contains("This project is personal"));
		assertEquals("Public access disabled", driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/ul/li[4]")).getText());
	}
		  
		  
		  
}
