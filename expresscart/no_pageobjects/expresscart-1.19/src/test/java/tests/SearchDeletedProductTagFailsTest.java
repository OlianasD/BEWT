package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;


public class SearchDeletedProductTagFailsTest extends BaseTest {


	@Test
	public void testExpressCartSearchDeletedProductTagFails() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.id("frm_search")).sendKeys("tag000");
		driver.findElement(By.id("btn_search")).click();
		
		assertEquals("No products found", driver.findElement(By.className("text-danger")).getText());
		
	}



}
