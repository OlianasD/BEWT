package tests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;




public class AuthorizedUsers extends BaseTest {
	
	@Test
	public void showAuthorizedUsers() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();	
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[2]/div[2]/div[2]/div[1]/div/a/strong/i")).click();
		driver.findElement(By.linkText("Configure this project")).click();
		driver.findElement(By.linkText("Permissions")).click();
		
		
		assertEquals("admin", driver.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/table/tbody/tr[2]/td[1]")).getText());	
	}
		  
		  
}
