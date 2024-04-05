package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddEmptyProductTest extends BaseTest {
	
	@Test
	public void testExpressCartAddEmptyProduct() throws Exception {
		driver.get(appUrl+"/admin");
		driver.findElement(By.id("email")).sendKeys("owner@test.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginForm")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/nav/div/ul[1]/li[3]/a[2]")).click();
		driver.findElement(By.id("frm_edit_product_save")).click();
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"productNewForm\"]/div[2]/div")).getAttribute("class").contains("has-error has-danger"));
		assertTrue(driver.findElement(By.xpath("//*[@id=\"productNewForm\"]/div[3]/div[1]/div")).getAttribute("class").contains("has-error has-danger"));
	}

}
