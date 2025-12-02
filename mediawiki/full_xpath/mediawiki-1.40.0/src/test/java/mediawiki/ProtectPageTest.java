package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ProtectPageTest extends BaseTest {
	
	@Test
	public void protectPage() throws InterruptedException {
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
		WebElement searchField = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/form/div/input[1]"));
		searchField.sendKeys("Selenium WebDriver");
		Thread.sleep(500);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement more = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/input"));
		more.click();
		WebElement protect = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/div/ul/li[3]/a"));
		protect.click();
		WebElement protectionLevelSelect = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/fieldset/div/div/div[1]/fieldset/div/div/div/div[1]/div/div/div/div/span"));
		protectionLevelSelect.click();
		WebElement adminOnly = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[3]/span[3]"));
		adminOnly.click();
		WebElement confirmBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/fieldset/div/div/div[5]/span/button"));
		confirmBtn.click();
		Thread.sleep(1000);
		WebElement secondMore = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/input"));
		secondMore.click();
		WebElement secondProtect = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[2]/div/ul/li[3]/a"));
		secondProtect.click();
		WebElement displayedProtectionLevel = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/form/fieldset/div/div/div[1]/fieldset/div/div/div/div[1]/div/div/div/div/span/span[2]"));

		assertEquals("Allow only administrators", displayedProtectionLevel.getText());
	}
	
}