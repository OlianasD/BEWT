package tests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DeleteUserTest extends BaseTest {
	
	
	@Test
	public void testExpressCartDeleteUser() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[6]/a[1]"));
		usersLink.click();
		WebElement deleteUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/ul/li[3]/span/a[2]"));
		deleteUserBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		WebElement secondUsersLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[6]/a[1]"));
		secondUsersLink.click();
		WebElement usersList = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/ul"));
		
		assertFalse(usersList.getText().contains("test000@test.com"));
	}



}
