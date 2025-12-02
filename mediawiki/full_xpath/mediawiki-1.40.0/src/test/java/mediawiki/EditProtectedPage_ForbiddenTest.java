package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EditProtectedPage_ForbiddenTest extends BaseTest {
	
	@Test
	public void editProtectedPage_Forbidden() throws InterruptedException {
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
		Thread.sleep(1000);
		WebElement searchField = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/form/div/input[1]"));
		searchField.sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.get(driver.getCurrentUrl()+"?veaction=edit");
		Thread.sleep(2000);
		WebElement initialPopup = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[3]/div/span[2]/a"));
		initialPopup.click();
		Thread.sleep(500);
		WebElement error1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/p"));
		WebElement error2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/p"));

		assertEquals("You do not have permission to edit this page, for the following reason:", error1.getText());
		assertEquals("This page has been protected to prevent editing or other actions.", error2.getText());
	}
	
}