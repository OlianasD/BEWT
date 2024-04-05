package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;


public class AddNewCurrencyRate extends BaseTest {
	
	@Test
	public void addNewCurrencyRate() throws InterruptedException {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Currency rates")).click();
		driver.findElement(By.linkText("Add or change currency rate")).click();
		driver.findElement(By.id("form-rate")).sendKeys("1.2");
		driver.findElement(By.xpath("//*[@id=\"modal-content\"]/form/div/div/button")).click();
		Thread.sleep(500);
		
		assertEquals("USD", driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/table/tbody/tr[2]/td[1]/strong")).getText());
		assertEquals("1.20", driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/table/tbody/tr[2]/td[2]")).getText());  
	}


}
