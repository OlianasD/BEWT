package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class EditProtectedPage_NewAdmin_SuccessTest extends BaseTest {
	
	@Test
	public void editProtectedPage_NewAdmin_Success() throws InterruptedException {
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
		Thread.sleep(1000);
		WebElement editLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		editLink.click();
		WebElement editor = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[6]/div[1]/div[1]"));
		editor.sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		editor.sendKeys(" Selenium WebDriver accepts commands (sent in Selenese, or via a Client API) and sends them to a browser.");
		Thread.sleep(500);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]"));
		saveBtn.click();
		WebElement summary = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea"));
		summary.sendKeys("Page expanded");
		WebElement saveSummaryBtn = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]"));
		saveSummaryBtn.click();
		Thread.sleep(2000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[5]/div[1]/p"));

		assertEquals("Selenium WebDriver", heading.getText());
		assertEquals("Developer: Selenium Latest version: 3.141.59Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE). Selenium WebDriver accepts commands (sent in Selenese, or via a Client API) and sends them to a browser.",
				text.getText());
	}
	
}