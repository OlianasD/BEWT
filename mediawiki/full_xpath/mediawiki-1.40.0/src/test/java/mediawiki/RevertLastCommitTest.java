package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class RevertLastCommitTest extends BaseTest {
	
	
	@Test
	public void revertLastCommit() throws InterruptedException {
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
		WebElement viewHistory = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[4]/a"));
		viewHistory.click();
		Thread.sleep(500);
		WebElement rollback = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/form/section/ul/li[1]/span[9]/span[1]/span/a"));
		rollback.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/p[1]"));

		assertEquals("Reverted edits by User001 (talk | contribs | block); changed back to last revision by Admin (talk | contribs | block).", successMsg.getText());

		WebElement pageLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/p[2]/a"));
		pageLink.click();
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));
		assertEquals("Selenium WebDriver", heading.getText());
		assertEquals("Developer: Selenium Latest version: 3.141.59Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language (Selenium IDE).",
				text.getText());

		
	}
	
}