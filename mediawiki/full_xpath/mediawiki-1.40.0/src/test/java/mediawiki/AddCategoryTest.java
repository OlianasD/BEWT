package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class AddCategoryTest extends BaseTest {
	
	@Test
	public void addCategory() throws InterruptedException {
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
		WebElement editLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		editLink.click();
		WebElement threeLinesIcon = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[2]/span"));
		threeLinesIcon.click();
		WebElement categories = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[3]/span[2]/a"));
		categories.click();
		WebElement categoryField = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/fieldset[1]/div/div/div/div/div/div[1]/div/input"));
		categoryField.sendKeys("Browser automation tools");
		Thread.sleep(500);
		categoryField.sendKeys(Keys.ENTER);
		WebElement applyChanges = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span"));
		applyChanges.click();
		Thread.sleep(500);
		WebElement saveChanges = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]"));
		saveChanges.click();
		WebElement summaryField = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea"));
		summaryField.sendKeys("Added category");
		WebElement saveSummary = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]"));
		saveSummary.click();
		Thread.sleep(1000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		WebElement category = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[6]/div/ul/li/a"));

		assertEquals("Selenium WebDriver", heading.getText());
		assertEquals("Browser automation tools", category.getText());
	}
	
}