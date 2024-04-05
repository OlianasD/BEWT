package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewProject extends BaseTest {
		  
	@Test
	public void addNewProject() throws InterruptedException {
		String projName = "Test 2";
		
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("New project")).click();
		driver.findElement(By.id("form-name")).sendKeys(projName);
		driver.findElement(By.xpath("//*[@id=\"project-creation-form\"]/div[2]/div/button")).click();
		Thread.sleep(1000);
		
		assertEquals(projName, driver.findElement(By.className("title")).getText());
		assertEquals("This project is open", driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/ul/li[1]")).getText());	
		
		
		
	}
		  
		  
}
