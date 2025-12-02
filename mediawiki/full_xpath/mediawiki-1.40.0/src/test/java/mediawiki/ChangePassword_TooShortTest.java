package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ChangePassword_TooShortTest extends BaseTest {

	
	@Test
	public void changePassword_TooShort() throws InterruptedException {
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
		WebElement changeCredentials = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[6]/ul/li[6]/a"));
		changeCredentials.click();
		WebElement adminLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/dl/dd/a"));
		adminLink.click();
		WebElement newPsw = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[1]/div/div/div/input"));
		newPsw.sendKeys("vznb");
		WebElement confirmPsw = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[2]/div/div/div/input"));
		confirmPsw.sendKeys("vznb");
		WebElement changeCredBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[4]/span[1]/button"));
		changeCredBtn.click();
		Thread.sleep(1000);
		WebElement errorMsg = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[1]/div[2]/div/span[2]"));

		assertEquals("Passwords must be at least 10 characters.", errorMsg.getText());
		
	}
	
}