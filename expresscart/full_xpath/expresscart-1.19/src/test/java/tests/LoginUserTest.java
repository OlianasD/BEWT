package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginUserTest extends BaseTest {
	
	@Test
	public void testExpressCartLoginUser() throws Exception {
		driver.get(appUrl+"/admin");
		WebElement emailField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[1]/input"));
		emailField.sendKeys("test000@test.com");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/input"));
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/form/button"));
		loginBtn.click();
		WebElement dashboardLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[1]/li[2]/a"));
		assertEquals(dashboardLink.getText(), "  Dashboard");
		WebElement logoutLink = driver.findElement(By.xpath("/html/body/div[2]/div/nav/div/ul[3]/li/a"));
		logoutLink.click();
	}



}
