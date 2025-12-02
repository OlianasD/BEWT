package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchProductTagTest extends BaseTest {
	
	@Test
	public void testExpressCartSearchProductTag() throws Exception {
		driver.get(appUrl);
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/input"));
		searchBar.sendKeys("tag000");
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/div/button"));
		searchBtn.click();
		WebElement searchResItem = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div/div/a/h3"));

		assertEquals("NewProduct000", searchResItem.getText());
	}



}
