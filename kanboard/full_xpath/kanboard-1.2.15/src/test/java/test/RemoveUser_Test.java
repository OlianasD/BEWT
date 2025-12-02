package test;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RemoveUser_Test extends BaseTest {
	
	@Test
	public void removeUser() throws InterruptedException {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement adminMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i"));
		adminMenuDropdown.click();
		WebElement userMgmtLink = driver.findElement(By.xpath("/html/body/div/ul/li[5]/a"));
		userMgmtLink.click();
		WebElement userDropDown = driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/div/a/strong/i"));
		userDropDown.click();
		WebElement removeLink = driver.findElement(By.xpath("/html/body/div/ul/li[15]"));
		removeLink.click();
		WebElement confirmBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/button"));
		confirmBtn.click();
		Thread.sleep(500);
		WebElement body = driver.findElement(By.xpath("/html/body"));

		assertFalse(body.getText().contains("remote1"));
			  
	}
		  

}
