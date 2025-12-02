package mediawiki;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BlockUserTest extends BaseTest {
	
	@Test
	public void blockUser() throws InterruptedException {
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
		WebElement blockUserLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[6]/ul/li[3]/a"));
		blockUserLink.click();
		WebElement blockTarget = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[1]/fieldset/div/div/div/div/div/div/div/input"));
		blockTarget.sendKeys("User001");
		WebElement blockIp = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[6]/fieldset/div/div/div/div[1]/div/span[1]/span/input"));
		blockIp.click();
		WebElement expiry = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[4]/fieldset/div/div/div/div/div/div/div/div[3]/div[2]/input"));
		expiry.sendKeys("indefinite");
		WebElement blockUserBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/div[7]/span/button"));
		blockUserBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/p"));
		
		assertTrue(successMsg.getText().contains("User001 has been blocked."));
	}
	
}