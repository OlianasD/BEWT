package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreateAndLinkPageTest extends BaseTest {
	
	@Test
	public void createAndLinkPage() throws InterruptedException {
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
		searchField.sendKeys("E2E Web Testing");
		searchField.sendKeys(Keys.ENTER);
		WebElement nonExistingPageLink = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[2]/div[1]/p[2]/a"));
		nonExistingPageLink.click();
		WebElement closeNotice = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]"));
		closeNotice.click();
		WebElement editor = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[5]/div[1]/div[1]"));
		editor.click();
		editor.click();
		editor.sendKeys("End-to-End (E2E) testing is a  ");
		editor.sendKeys("[[");
		WebElement pageToLinkField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[5]/div[2]/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div/form/div/div[2]/div[1]/div[1]/div/div/div/div/div/div[1]/div/input"));
		pageToLinkField.sendKeys("Software testing");
		WebElement pageToLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[5]/div[2]/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div/form/div/div[2]/div[1]/div[1]/div/div/div/div/div/div[2]/div/div/a/span"));
		pageToLink.click();
		editor.click();
		editor.sendKeys(" technique that aims to test a system as a whole, as a human tester would");
		Thread.sleep(500);
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]"));
		saveBtn.click();
		WebElement summary = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea"));
		summary.sendKeys("Page created");
		WebElement saveSummaryBtn = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]"));
		saveSummaryBtn.click();
		Thread.sleep(1000);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		assertEquals("E2E Web Testing", heading.getText());
		WebElement link = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p/a"));
		link.click();
		WebElement secondHeading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));

		assertEquals("Software testing", secondHeading.getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item.",
				text.getText());

		
	}
	
}