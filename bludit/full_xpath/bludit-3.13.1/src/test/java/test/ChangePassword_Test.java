package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangePassword_Test extends BaseTest {
	
	@Test
	public void changePassword_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement usersLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[8]/a"));
		usersLink.click();
		WebElement user = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[1]/a"));
		user.click();
		WebElement securityTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[3]"));
		securityTab.click();
		WebElement changePasswordBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[3]/div[1]/a"));
		changePasswordBtn.click();
		WebElement newPsw = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div/input"));
		newPsw.sendKeys("newpassword");
		WebElement confirmPsw =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[4]/div/input"));
		confirmPsw.sendKeys("newpassword");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement userStatus = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[2]/td[4]"));

		assertEquals("Enabled", userStatus.getText());

	}
	
}
