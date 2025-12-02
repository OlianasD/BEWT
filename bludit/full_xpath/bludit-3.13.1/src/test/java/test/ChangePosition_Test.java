package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangePosition_Test extends BaseTest {
	
	@Test
	public void changePosition_Test() throws InterruptedException {
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
		WebElement navAdvancedTab =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/nav/div/a[2]"));
		navAdvancedTab.click();
		WebElement position = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[2]/div[3]/input"));
		position.clear();
		position.sendKeys("30");
		WebElement secondOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		secondOptionsSidebar.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement thirdOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		thirdOptionsSidebar.click();
		WebElement secondNavAdvancedTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/nav/div/a[2]"));
		secondNavAdvancedTab.click();
		WebElement secondPosition = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[2]/div[3]/input"));
		
		assertEquals("30", secondPosition.getAttribute("value"));
	}
}
