package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;




public class EditProfile extends BaseTest {
	
	@Test
	public void editProfile() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Users management")).click();
		driver.findElement(By.linkText("admin")).click();
		driver.findElement(By.linkText("Edit profile")).click();
		driver.findElement(By.xpath("//*[@id=\"form-email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"form-email\"]")).sendKeys("admin@kanboard.com");
		driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/form/div/div/button")).click();
		Thread.sleep(500);
		
		
		assertEquals("admin@kanboard.com", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[3]/strong")).getText());
	}
		  

		  
}
