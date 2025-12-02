package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditProfile_Test extends BaseTest {
	
	@Test
	public void editProfile() throws InterruptedException {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement adminMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i"));
		adminMenuDropdown.click();
		WebElement userMgmtLink = driver.findElement(By.xpath("/html/body/div/ul/li[5]/a"));
		userMgmtLink.click();
		WebElement adminUserLink = driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/span/a"));
		adminUserLink.click();
		WebElement editProfileLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul[2]/li[1]/a"));
		editProfileLink.click();
		WebElement emailField = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/input[3]"));
		emailField.clear();
		emailField.sendKeys("admin@kanboard.com");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/div/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement displayedEmail = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul[1]/li[3]/strong"));
		
		assertEquals("admin@kanboard.com", displayedEmail.getText());
	}
		  

		  
}
