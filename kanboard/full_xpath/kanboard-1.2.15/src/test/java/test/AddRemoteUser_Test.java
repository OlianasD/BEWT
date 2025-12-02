package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddRemoteUser_Test extends BaseTest {
	
	@Test
	public void addRemoteUser() {
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
		usernameField.sendKeys("TestRemote");
		WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[1]/input[2]"));
		nameField.sendKeys("remote1");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[1]/input[3]"));
		emailField.sendKeys("remote@gmail.com");
		WebElement remoteCheckbox = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[1]/div[1]/fieldset[2]/label[1]/input"));
		remoteCheckbox.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[2]/div/button"));
		saveBtn.click();

		WebElement displayedUsername = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul[1]/li[1]/strong"));
		WebElement displayedName = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul[1]/li[2]/strong"));
		WebElement displayedEmail = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul[1]/li[3]/strong"));
		WebElement displayedRemote = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/ul[2]/li[3]/strong"));

		assertEquals("TestRemote", displayedUsername.getText());
		assertEquals("remote1", displayedName.getText());
		assertEquals("remote@gmail.com", displayedEmail.getText());
		assertEquals("Remote", displayedRemote.getText());

	}
		  

		  
		  
}
