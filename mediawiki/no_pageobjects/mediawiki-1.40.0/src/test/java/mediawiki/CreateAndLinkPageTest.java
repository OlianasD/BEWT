package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateAndLinkPageTest extends BaseTest {
	
	@Test
	public void createAndLinkPage() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("wpName1")).clear();
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		driver.findElement(By.id("wpPassword1")).clear();
		driver.findElement(By.id("wpPassword1")).sendKeys("Password001");
		driver.findElement(By.id("wpLoginAttempt")).click();
		driver.findElement(By.id("searchInput")).sendKeys("E2E Web Testing");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("E2E Web Testing")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/span[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]"))
			.sendKeys("End-to-End (E2E) testing is a  ");
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]")).sendKeys("[[");
		driver.findElement(By.xpath("//*[@id=\"ooui-3\"]/div/div/div/div/div/div[1]/div/input")).sendKeys("Software testing");
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[2]/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div[5]/div[1]/div[1]"))
			.sendKeys(" technique that aims to test a system as a whole, as a human tester would");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[3]/div/div[1]/div[1]/div[4]/div/span/a/span[3]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/textarea")).sendKeys("Page created");
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div[1]/div/div[1]/span/a/span[2]")).click();
		Thread.sleep(1000);
		
		assertEquals("E2E Web Testing", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		driver.findElement(By.linkText("Software testing")).click();
		assertEquals("Software testing", driver.findElement(By.xpath("//*[@id=\"firstHeading\"]")).getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item.",
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]")).getText());

		
	}
	
}