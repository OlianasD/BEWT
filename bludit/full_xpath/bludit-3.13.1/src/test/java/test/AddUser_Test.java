package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;


public class AddUser_Test extends BaseTest {
	
	@Test
	public void addUser_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[8]/a"));
		usersLink.click();
		WebElement addUserLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/a"));
		addUserLink.click();
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/input"));
		usernameField.sendKeys("usertest");
		WebElement passwordField = 	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div/input"));
		passwordField.sendKeys("usertest123");
		WebElement confirmPassword = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[4]/div/input"));
		confirmPassword.sendKeys("usertest123");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[6]/div/input"));
		emailField.sendKeys("user@test.com");
		WebElement roleLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[5]/div/select"));
		new Select(roleLocator).selectByVisibleText("Administrator");
		WebElement submitBtn = 	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		submitBtn.click();
		Thread.sleep(500);
		WebElement addedUser = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a"));
		
		assertEquals("usertest", addedUser.getText());
		
	}
	
}
