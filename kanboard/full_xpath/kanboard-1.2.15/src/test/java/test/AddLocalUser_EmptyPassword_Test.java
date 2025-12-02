package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddLocalUser_EmptyPassword_Test extends BaseTest {
	
	@Test
	public void addEmptyPassword() {
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
		WebElement newUserLink = driver.findElement(By.xpath("/html/body/section/div[1]/ul/li[1]/a"));
		newUserLink.click();
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[1]/input[1]"));
		usernameField.sendKeys("TestUser2");
		WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[1]/input[2]"));
		nameField.sendKeys("User2");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[1]/input[3]"));
		emailField.sendKeys("use2r@gmail.com");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/div/button"));
		saveBtn.click();
		WebElement pswEmptyErrorMsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[2]/ul[1]"));
		
		assertEquals("The password is required", pswEmptyErrorMsg.getText());
			  
	}
	
}
