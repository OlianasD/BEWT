package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;

public class DeleteUser_Test extends BaseTest {
	
	@Test
	public void deleteUser_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[8]/a"));
		usersLink.click();
		WebElement secondUser = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a"));
		secondUser.click();
		WebElement securityTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[3]"));
		securityTab.click();
		WebElement deleteUser = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[3]/div[4]/div[2]/button[3]"));
		deleteUser.click();
		Thread.sleep(1000);
		WebElement body = driver.findElement(By.xpath("/html/body"));
		
		assertFalse(body.getText().contains("usertest"));
		
	}
}