package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class SetFooter_Test extends BaseTest {
	
	@Test
	public void setFooter_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement generalLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[10]/a"));
		generalLink.click();
		WebElement generalTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[1]"));
		generalTab.click();
		WebElement footerField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div/input"));
		footerField.clear();
		footerField.sendKeys("E2E Web testing benchmark");
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		submitBtn.click();
		Thread.sleep(500);
		WebElement secondFooterField = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div[4]/div/input"));

		assertEquals("E2E Web testing benchmark", secondFooterField.getAttribute("value"));
		
	}
	
}
