package tests;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchDeletedProductFailsTest extends BaseTest {

	@Test
	public void testExpressCartSearchDeletedProductFails() throws Exception {
		driver.get(appUrl);
		WebElement searchBar = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/input"));
		searchBar.sendKeys("NewProduct000");
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/form/div/div/button"));
		searchBtn.click();
		WebElement noResMsg = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/p"));
		assertEquals("No products found", noResMsg.getText());
		
	}


}
