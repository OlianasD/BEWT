package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;




public class AddLocalUser extends BaseTest {
	
	@Test
	public void addLocalUser() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Users management")).click();
		driver.findElement(By.linkText("New user")).click();
		driver.findElement(By.id("form-username")).sendKeys("TestUser");
		driver.findElement(By.id("form-name")).sendKeys("User1");
		driver.findElement(By.id("form-email")).sendKeys("user@gmail.com");
		driver.findElement(By.id("form-password")).sendKeys("test123");
		driver.findElement(By.id("form-confirmation")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[2]/div/button")).click();
		
		assertEquals("TestUser", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[1]/strong")).getText());
		assertEquals("User1", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[2]/strong")).getText());
		assertEquals("user@gmail.com", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[3]/strong")).getText());
	}
		  

		  
		  
		  
}
