package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreateEmptyUser_GetsWarningTest extends BaseTest {
	
	@Test
	public void createEmptyUser_GetsWarning() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li/a"));
		loginLink.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[1]/div/input"));
		userField.clear();
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[2]/div/input"));
		pswField.clear();
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(1000);
		WebElement specialPages = driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav[2]/div/ul/li[3]/a"));
		specialPages.click();
		WebElement createAccount = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[5]/ul/li[1]/a"));
		createAccount.click();
		WebElement createAccountBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[9]/div/button"));
		createAccountBtn.click();
		WebElement usernameField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[2]/div/input"));

		assertEquals("Please fill out this field.", usernameField.getAttribute("validationMessage"));
	}
	
}
