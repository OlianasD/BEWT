package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddRemoteUser extends BaseTest {
	
	@Test
	public void addRemoteUser() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Users management")).click();
		driver.findElement(By.linkText("New user")).click();
		driver.findElement(By.id("form-username")).sendKeys("TestRemote");
		driver.findElement(By.id("form-name")).sendKeys("remote1");
		driver.findElement(By.id("form-email")).sendKeys("remote@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[1]/div[1]/fieldset[2]/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div[2]/div/button")).click();
		
		assertEquals("TestRemote", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[1]/strong")).getText());
		assertEquals("remote1", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[2]/strong")).getText());
		assertEquals("remote@gmail.com", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[1]/li[3]/strong")).getText());
		assertEquals("Remote", driver.findElement(By.xpath("//*[@id=\"user-section\"]/div[2]/ul[2]/li[3]/strong")).getText());

	}
		  

		  
		  
}
