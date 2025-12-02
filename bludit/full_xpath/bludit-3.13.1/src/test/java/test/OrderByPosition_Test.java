package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class OrderByPosition_Test extends BaseTest {
	
	@Test
	public void orderByPosition_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement generalLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[10]/a"));
		generalLink.click();
		WebElement navAdvancedTab =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/nav/div/a[2]"));
		navAdvancedTab.click();
		Thread.sleep(1000);
		WebElement orderLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div[2]/div/select"));
		new Select(orderLocator).selectByVisibleText("Position");
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div/button"));
		submitBtn.click();
		Thread.sleep(1000);
		WebElement secondOrderLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/div[2]/div/select"));

		assertEquals("Position", new Select(secondOrderLocator).getFirstSelectedOption().getText());
	}
	
	
}