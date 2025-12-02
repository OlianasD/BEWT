package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddUserTest extends BaseTest {
	
	@Test
	public void testExpressCartNewUser() throws Exception {
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
		Thread.sleep(1000);
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[6]/a[1]"));
		usersLink.click();
		Thread.sleep(2000);
		WebElement userRow = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/ul/li[3]"));
		assertEquals(userRow.getText(), "User: TestUser000 - (test000@test.com)\nRole: User");
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[3]/li/a"));
		logoutLink.click();
	}


}
