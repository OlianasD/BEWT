package mediawiki;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ApplyTemplateTest extends BaseTest {
	
	@Test
	public void applyTemplate() throws InterruptedException {
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
		Thread.sleep(500);
		WebElement editSource = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[3]/a"));
		editSource.click();
		WebElement classicEditor = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[2]/div[3]/div[1]/div[2]/div/textarea"));
		classicEditor.click();
		classicEditor.sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		classicEditor.sendKeys("{{Software|dev=Selenium|ver=3.141.59}}");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[4]/div[4]/span[1]/input"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));

		assertEquals("Selenium WebDriver", heading.getText());
		assertTrue(text.getText().contains("Developer: Selenium Latest version: 3.141.59"));
	}
	
}