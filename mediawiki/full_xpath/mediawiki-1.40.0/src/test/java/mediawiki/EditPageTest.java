package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditPageTest extends BaseTest {
	
	@Test
	public void editPage() throws InterruptedException {
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
		searchField.sendKeys("Software testing");
		Thread.sleep(500);
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement editLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a"));
		editLink.click();
		WebElement editor = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[6]/div[1]/div[1]"));
		editor.sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		editor.sendKeys(" Testing is performed by running test cases against the system under test (SUT) and collecting their results.");
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
		
		assertEquals("Software testing", heading.getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item. Testing is performed by running test cases against the system under test (SUT) and collecting their results.", 
				text.getText());

	}
	
}