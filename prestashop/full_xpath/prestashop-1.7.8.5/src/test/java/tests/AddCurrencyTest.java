package tests;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddCurrencyTest extends BaseTest {
	
	@Test
	public void test_add_currency() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement international = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/a"));
		international.click();
		WebElement localization = driver.findElement(By.xpath("/html/body/nav/div/ul/li[13]/ul/li[1]/a"));
		localization.click();
		WebElement currencies = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/a"));
		currencies.click();
		WebElement addCurrency = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addCurrency.click();
		WebElement altCurrency = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/div"));
		altCurrency.click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[3]/div/div/div[1]/input"));
		name.sendKeys("Something");
		WebElement isoCode = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[5]/div[1]/div/input"));
		isoCode.sendKeys("STH");
		WebElement exchangeRate = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[5]/div[2]/div/input"));
		exchangeRate.clear();
		exchangeRate.sendKeys("10");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[3]/button"));
		saveBtn.click();
		Thread.sleep(2000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		assertTrue(successMsg.getText().contains("Successful creation"));
	}
}
