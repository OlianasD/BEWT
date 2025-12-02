package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class SetStickyPost_Test extends BaseTest {
	
	@Test
	public void setStickyPost_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement contentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		contentLink.click();
		WebElement editThirdPost = 	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[3]/a[2]"));
		editThirdPost.click();
		WebElement optionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		optionsSidebar.click();
		WebElement navAdvancedTab =	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/nav/div/a[2]"));
		navAdvancedTab.click();
		Thread.sleep(500);
		WebElement stickyLocator = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[2]/div[2]/select"));
		new Select(stickyLocator).selectByVisibleText("Sticky");
		WebElement secondOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		secondOptionsSidebar.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondContentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		secondContentLink.click();
		WebElement stickyTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/ul/li[3]/a"));
		stickyTab.click();
		WebElement stickyPost = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[3]/table/tbody/tr/td[1]/div[1]/a"));
		assertEquals("Set up your new site", stickyPost.getText());
		
	}
	
}
