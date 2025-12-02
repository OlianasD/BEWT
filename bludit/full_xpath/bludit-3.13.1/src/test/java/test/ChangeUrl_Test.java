package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangeUrl_Test extends BaseTest {
	
	@Test
	public void changeUrl_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement contentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		contentLink.click();
		WebElement articleLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[3]/a[2]"));
		articleLink.click();
		WebElement optionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		optionsSidebar.click();
		WebElement navSeoTab =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/nav/div/a[3]"));
		navSeoTab.click();
		WebElement shortUrlField = 	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[3]/div[1]/input"));
		shortUrlField.clear();
		shortUrlField.sendKeys("new-post-url");
		optionsSidebar.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondContentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		secondContentLink.click();
		WebElement shortUrlElem = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]/a"));
		assertEquals("/new-post-url", shortUrlElem.getText());
	}
	
}
