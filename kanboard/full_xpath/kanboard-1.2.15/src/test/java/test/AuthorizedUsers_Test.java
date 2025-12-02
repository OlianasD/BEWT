package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AuthorizedUsers_Test extends BaseTest {
	
	@Test
	public void showAuthorizedUsers() {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement projectDropdownIcon = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[2]/div[2]/div[1]/div/a/strong/i"));
		projectDropdownIcon.click();
		WebElement configureProjectLink = driver.findElement(By.xpath("/html/body/div/ul/li[5]/a"));
		configureProjectLink.click();
		WebElement permissionsLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[12]/a"));
		permissionsLink.click();
		WebElement allowedUser = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/table/tbody/tr[2]/td[1]"));
		
		assertEquals("admin", allowedUser.getText());
	}
		  
		  
}
