package tests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;





public class SetReferenceCurrency extends BaseTest {
	
	@Test
	public void setReference() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Currency rates")).click();
		driver.findElement(By.linkText("Change reference currency")).click();
		new Select(driver.findElement(By.id("form-application_currency"))).selectByVisibleText("EUR - Euro");
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div/div/button")).click();
		Thread.sleep(500);
		
		
		assertEquals("Reference currency: EUR", driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/div[2]")).getText());	  
	}
		  
		  
		  
}
