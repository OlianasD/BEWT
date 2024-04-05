package tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

public class SearchDeletedProductFailsTest extends BaseTest {

	@Test
	public void testExpressCartSearchDeletedProductFails() throws Exception {
		driver.get(appUrl);
		driver.findElement(By.id("frm_search")).sendKeys("NewProduct000");
		driver.findElement(By.id("btn_search")).click();
		
		assertEquals("No products found", driver.findElement(By.className("text-danger")).getText());
		
	}


}
