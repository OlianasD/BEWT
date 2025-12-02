package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchProductTest extends BaseTest {
	
	@Test
	public void testExpressCartSearchProduct() throws Exception {
		driver.get(appUrl);
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/input"));
		searchBar.sendKeys("NewProduct000");
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/div/button"));
		searchBtn.click();
		WebElement searchResTitle = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/h1/strong"));
		WebElement searchResItem = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div/div/a/h3"));

		assertEquals("NewProduct000", searchResTitle.getText());
		assertEquals("NewProduct000", searchResItem.getText());
		
	}



}
