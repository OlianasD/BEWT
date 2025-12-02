package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangeCategoryUrl_Test extends BaseTest {
	
	@Test
	public void changeCategoryUrl_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement categoriesLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[7]/a"));
		categoriesLink.click();
		WebElement firstCategoryLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[1]/a"));
		firstCategoryLink.click();
		WebElement urlField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[5]/div/input"));
		urlField.clear();
		urlField.sendKeys("aaanewurl001");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button[1]"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement categoryUrl = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/a"));
		
		assertEquals("/category/aaanewurl001", categoryUrl.getText());
	}
}
