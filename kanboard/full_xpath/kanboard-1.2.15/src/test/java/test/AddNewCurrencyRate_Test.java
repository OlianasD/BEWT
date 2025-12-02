package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewCurrencyRate_Test extends BaseTest {
	
	@Test
	public void addNewCurrencyRate() throws InterruptedException {
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
		WebElement addCurrencyRateLink = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/ul/li[1]/a"));
		addCurrencyRateLink.click();
		WebElement rateField = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input[2]"));
		rateField.sendKeys("1.2");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement rateCurrency = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/table/tbody/tr[2]/td[1]/strong"));
		WebElement rateValue = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/table/tbody/tr[2]/td[2]"));

		assertEquals("USD", rateCurrency.getText());
		assertEquals("1.20", rateValue.getText());
	}


}
