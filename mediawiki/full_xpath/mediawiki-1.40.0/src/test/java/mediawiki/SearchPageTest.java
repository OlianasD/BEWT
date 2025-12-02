package mediawiki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPageTest extends BaseTest {
	
	@Test
	public void searchPage() throws InterruptedException {
		WebElement searchField = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/form/div/input[1]"));
		searchField.sendKeys("Software testing");
		Thread.sleep(500);
		searchField.sendKeys(Keys.ENTER);
		WebElement heading = driver.findElement(By.xpath("/html/body/div[3]/h1/span"));
		WebElement text = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p"));
		
		assertEquals("Software testing", heading.getText());
		assertEquals("According to the IEEE/ANSI 1059 definition, software testing is the process of analyzing a software item to detect the differences between existing and required conditions (that is defects/errors/bugs) and to evaluate the features of the software item.",
				text.getText());
	}
	
}