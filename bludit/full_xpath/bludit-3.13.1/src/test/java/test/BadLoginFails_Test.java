package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BadLoginFails_Test extends BaseTest {
	
	@Test
	public void badLoginFails_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys("wrongpassword");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.xpath("/html/body/div[1]"));

		assertTrue((alert).isDisplayed());
		assertEquals("Username or password incorrect", alert.getText());
		
	}
}