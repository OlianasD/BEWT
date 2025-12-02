package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreatePageFromSourceTest extends BaseTest {
	
	@Test
	public void createPageFromSource() throws InterruptedException {
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
		searchField.sendKeys(Keys.ENTER);
		WebElement nonExistingPageLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[2]/div[1]/p[2]/a"));
		nonExistingPageLink.click();
		WebElement closeNotice = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]"));
		closeNotice.click();
		WebElement createSource = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		createSource.click();
		WebElement classicEditor = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[2]/div[3]/div[1]/div[2]/div/textarea"));
		classicEditor
				.sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/div[4]/div[4]/span[1]/input"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));

		assertEquals("Selenium WebDriver", heading.getText());
		assertEquals("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).",
				text.getText());
	}
	
}