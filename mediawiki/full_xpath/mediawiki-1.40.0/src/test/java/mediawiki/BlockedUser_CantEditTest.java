package mediawiki;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BlockedUser_CantEditTest extends BaseTest {
	
	@Test
	public void blockedUser_CantEdit() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li/a"));
		loginLink.click();
		WebElement userField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[1]/div/input"));
		userField.clear();
		userField.sendKeys("User001");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[2]/div/input"));
		pswField.clear();
		pswField.sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/div[2]/form/div/div[4]/div/button"));
		loginBtn.click();
		WebElement userLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li[1]/a"));
		userLink.click();
		WebElement editLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		editLink.click();
		Thread.sleep(1000);
		WebElement error1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/p"));
		WebElement error2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/p[1]/strong"));
		
		assertEquals("You do not have permission to edit this page, for the following reason:",
				error1.getText());
		assertTrue(error2.getText().contains("Your username or IP address has been blocked"));
	}
	
}