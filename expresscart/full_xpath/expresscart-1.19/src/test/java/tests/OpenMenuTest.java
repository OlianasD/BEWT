package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenMenuTest extends BaseTest {
	
	@Test
	public void testExpressCartOpenMenuNoPO() throws Exception {
		driver.get(appUrl);
		WebElement testMenuLink = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/ul/li[4]/a"));
		testMenuLink.click();
		WebElement category = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/h1/strong"));
		WebElement product = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div/div/a/h3"));

		assertEquals("tag000", category.getText());
		assertEquals("NewProduct000", product.getText());
		
	}



}
