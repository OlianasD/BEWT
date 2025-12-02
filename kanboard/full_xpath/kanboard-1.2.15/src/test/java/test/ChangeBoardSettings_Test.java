package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangeBoardSettings_Test extends BaseTest {

	
	@Test
	public void changeBoardSettings() throws InterruptedException {
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
		WebElement boardSettingsLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[5]/a"));
		boardSettingsLink.click();
		WebElement refreshIntervalField = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset/input[2]"));
		refreshIntervalField.clear();
		refreshIntervalField.sendKeys("85");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/div/button"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement appSettingsLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[2]/a"));
		appSettingsLink.click();
		WebElement secondBoardSettingsLink = driver.findElement(By.xpath("/html/body/section/section/section/div[1]/ul/li[5]/a"));
		secondBoardSettingsLink.click();
		WebElement secondRefreshIntervalField = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/form/fieldset/input[2]"));

		assertEquals("85", secondRefreshIntervalField.getAttribute("value"));
		
	}
		  
		  
}
