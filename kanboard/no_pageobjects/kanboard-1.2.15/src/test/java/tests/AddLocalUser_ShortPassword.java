package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddLocalUser_ShortPassword extends BaseTest {
	
	@Test
	public void addShortPassword() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Users management")).click();
		driver.findElement(By.linkText("New user")).click();
		driver.findElement(By.id("form-username")).sendKeys("TestUser2");
		driver.findElement(By.id("form-name")).sendKeys("User2");
		driver.findElement(By.id("form-email")).sendKeys("use2r@gmail.com");
		driver.findElement(By.id("form-password")).sendKeys("test");
		driver.findElement(By.id("form-confirmation")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[2]/div/button")).click();
		
		assertEquals("The minimum length is 6 characters", driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[2]/ul[1]")).getText());
			  
	}
	
}
