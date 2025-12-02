package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddExistingUserFailsTest extends BaseTest {
	
	@Test
	public void testExpressCartExistingUserFails() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement addUserIcon = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[6]/a[2]"));
		addUserIcon.click();
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[1]/input"));
		usernameField.sendKeys("TestUser000");
		WebElement userEmailField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[2]/input"));
		userEmailField.sendKeys("test000@test.com");
		WebElement userPswField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[3]/input"));
		userPswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswConfField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[4]/input"));
		pswConfField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement createUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div/button"));
		createUserBtn.click();
		Thread.sleep(500);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[3]"));
		assertEquals("A user with that email address already exists", errorMsg.getText());
		
	}



}
