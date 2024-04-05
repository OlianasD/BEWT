package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class SearchProductTest extends BaseTest {
	
	@Test
	public void testExpressCartSearchProduct() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.id("frm_search")).sendKeys("NewProduct000");
		driver.findElement(By.id("btn_search")).click();
		
		assertEquals("NewProduct000", driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/h1/strong")).getText());
		assertEquals("NewProduct000", driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div/div/a/h3")).getText());
		
	}



}
