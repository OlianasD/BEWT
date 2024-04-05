package tests;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.openqa.selenium.By;


public class RemoveUser extends BaseTest {
	
	@Test
	public void removeUser() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Users management")).click();
		driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Remove")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-confirm-button\"]")).click();
		Thread.sleep(500);
		
		assertFalse(driver.findElement(By.tagName("body")).getText().contains("remote1"));
			  
	}
		  

}
