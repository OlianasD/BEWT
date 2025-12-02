package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddEmptyUserTest extends BaseTest {
	
	@Test
	public void testExpressCartEmptyUser() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("owner@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement addUserIcon = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[6]/a[2]"));
		addUserIcon.click();
		WebElement createUserBtn = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div/button"));
		createUserBtn.click();
		Thread.sleep(1000);
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[1]"));
		WebElement userEmailField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[2]"));
		WebElement userPswField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[3]"));
		WebElement pswConfField = driver.findElement(By.xpath("/html/body/div[2]/div/main/div/form/div[4]"));
		assertTrue(usernameField.getAttribute("class").contains("has-error has-danger"));
		assertTrue(userEmailField.getAttribute("class").contains("has-error has-danger"));
		assertTrue(userPswField.getAttribute("class").contains("has-error has-danger"));
		assertTrue(pswConfField.getAttribute("class").contains("has-error has-danger"));
	}


}
