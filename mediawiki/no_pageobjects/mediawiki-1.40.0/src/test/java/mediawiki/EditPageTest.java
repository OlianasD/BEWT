package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditPageTest extends BaseTest {
	
	@Test
	public void editPage() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("e2eW3Bt3s71nGB3nchM4rK");
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchInput")).sendKeys("Software testing");
		Thread.sleep(500);
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[6]/div[1]/div[1]")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[6]/div[1]/div[1]")).sendKeys(" Testing is performed by running test cases against the system under test (SUT) and collecting their results.");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea")).sendKeys("Page expanded");
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]")).click();
		Thread.sleep(1000);
		
		assertEquals("Software testing", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item. Testing is performed by running test cases against the system under test (SUT) and collecting their results.", 
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());

	}
	
}