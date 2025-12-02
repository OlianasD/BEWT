package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class ChangeLanguage_Test extends BaseTest {
	
	@Test
	public void changeLanguage_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement generalLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[10]/a"));
		generalLink.click();
		WebElement languageTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[6]"));
		languageTab.click();
		Thread.sleep(1000);
		WebElement langLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/div[1]/div/select"));
		new Select(langLocator).selectByVisibleText("Italiano (Italia)");
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		submitBtn.click();
		Thread.sleep(1000);
		WebElement secondLangLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/div[1]/div/select"));
		assertEquals("Italiano (Italia)", new Select(secondLangLocator).getFirstSelectedOption().getText());
		Thread.sleep(1000);
		WebElement thirdLangLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/div[1]/div/select"));
		new Select(thirdLangLocator).selectByVisibleText("English");
		WebElement secondSubmitBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		secondSubmitBtn.click();
		Thread.sleep(1000);
		WebElement fourthLangLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/div[1]/div/select"));
		assertEquals("English", new Select(fourthLangLocator).getFirstSelectedOption().getText());
		
	}
	
}