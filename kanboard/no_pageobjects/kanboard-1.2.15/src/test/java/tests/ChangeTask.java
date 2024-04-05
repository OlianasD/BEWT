package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;

public class ChangeTask extends BaseTest {
	
	@Test
	public void changeTask() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.linkText("Test 2")).click();
		driver.findElement(By.linkText("task 3")).click();
		driver.findElement(By.linkText("Close this task")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-confirm-button\"]")).click();
		Thread.sleep(1000);
		
		assertEquals("closed", driver.findElement(By.xpath("//*[@id=\"task-summary\"]/div/div/div[1]/ul/li[1]/span")).getText());
	}
		  

		  
}
