package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;





public class SetReferenceCurrency_Test extends BaseTest {
	
	@Test
	public void setReference() throws InterruptedException {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement adminMenuDropdown = driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i"));
		adminMenuDropdown.click();
		WebElement settingsLink = driver.findElement(By.xpath("/html/body/div/ul/li[8]/a"));
		settingsLink.click();
		WebElement currencyRatesLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[8]/a"));
		currencyRatesLink.click();
		WebElement changeRefCurr = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/ul/li[2]/a"));
		changeRefCurr.click();
		WebElement currencySelect = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/select"));
		new Select(currencySelect).selectByVisibleText("EUR - Euro");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement displayedCurrency = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[2]"));
		
		assertEquals("Reference currency: EUR", displayedCurrency.getText());
	}
		  
		  
		  
}
