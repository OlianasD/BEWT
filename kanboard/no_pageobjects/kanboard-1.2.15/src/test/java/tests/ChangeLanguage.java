package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class ChangeLanguage extends BaseTest {
		  
	@Test
	public void changeLang() {
		driver.findElement(By.id("form-username")).sendKeys("admin");
		driver.findElement(By.id("form-password")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/form/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/a/i")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Application settings")).click();
		new Select(driver.findElement(By.id("form-application_language"))).selectByVisibleText("Italiano");
		driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/form/div/button")).click();
		assertEquals("Italiano", new Select(driver.findElement(By.id("form-application_language"))).getFirstSelectedOption().getText());
		assertEquals("Lingua", driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/form/fieldset[1]/label[2]")).getText());
		
		new Select(driver.findElement(By.id("form-application_language"))).selectByVisibleText("English (US)");
		driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/form/div/button")).click();
		
		assertEquals("English (US)", new Select(driver.findElement(By.id("form-application_language"))).getFirstSelectedOption().getText());
		assertEquals("Language", driver.findElement(By.xpath("//*[@id=\"config-section\"]/div[2]/form/fieldset[1]/label[2]")).getText());
		
		
	}
		  
}
