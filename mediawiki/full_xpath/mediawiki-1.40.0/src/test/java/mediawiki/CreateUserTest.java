package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateUserTest extends BaseTest {
	
	@Test
	public void createUser() throws InterruptedException {
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
		WebElement username = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[2]/div/input"));
		username.sendKeys("User001");
		WebElement psw = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[3]/div/input"));
		psw.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement pswConfirm = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[5]/div/input"));
		pswConfirm.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement realname = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[6]/div/input"));
		realname.sendKeys("Real Name 001");
		WebElement createAccountBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[1]/form/div/div[9]/div/button"));
		createAccountBtn.click();

		WebElement successText = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/p[1]"));
		assertEquals("The user account for User001 (talk) has been created.", successText.getText());
	}
	
}