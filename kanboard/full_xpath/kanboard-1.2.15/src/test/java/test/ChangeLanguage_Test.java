package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ChangeLanguage_Test extends BaseTest {
		  
	@Test
	public void changeLang() throws InterruptedException {
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
		WebElement appSettingsLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[2]/a"));
		appSettingsLink.click();
		WebElement langSelect = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/select"));
		new Select(langSelect).selectByVisibleText("Italiano");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/div/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement secondLangSelect = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/select"));
		WebElement langLabel = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/label[2]"));
		assertEquals("Italiano", new Select(secondLangSelect).getFirstSelectedOption().getText());
		assertEquals("Lingua", langLabel.getText());
		Thread.sleep(500);
		new Select(secondLangSelect).selectByVisibleText("English (US)");
		Thread.sleep(500);
		WebElement secondSaveBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/div/button"));
		Thread.sleep(500);
		secondSaveBtn.click();
		Thread.sleep(1000);

		WebElement thirdLangSelect = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/select"));
		WebElement secondLangLabel = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset[1]/label[2]"));

		assertEquals("English (US)", new Select(thirdLangSelect).getFirstSelectedOption().getText());
		assertEquals("Language", secondLangLabel.getText());
		
		
	}
		  
}
