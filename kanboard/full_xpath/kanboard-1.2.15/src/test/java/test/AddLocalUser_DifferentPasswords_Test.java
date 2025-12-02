package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddLocalUser_DifferentPasswords_Test extends BaseTest {
	
	@Test
	public void addDifferentPasswords() {
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
		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[2]/input[1]"));
		passwordField.sendKeys("test123");
		WebElement passwordConfField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[2]/input[2]"));
		passwordConfField.sendKeys("123test");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/div/button"));
		saveBtn.click();
		WebElement pswErrorMsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[2]/ul/li"));
		
		assertEquals("Passwords don't match", pswErrorMsg.getText());
			  
	}
	
}
