package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ChangeParent_Test extends BaseTest {
	
	@Test
	public void changeParent_Test() throws InterruptedException {
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
		WebElement parentDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[2]/div[5]/span/span[1]/span"));
		parentDropdown.click();
		WebElement parentField = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		parentField.sendKeys("Create your own content");
		Thread.sleep(1000);
		WebElement selector = driver.findElement(By.xpath("//*[@id=\"select2-jsparent-results\"]/li"));
		selector.click();
		WebElement secondOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		secondOptionsSidebar.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement thirdOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		thirdOptionsSidebar.click();
		WebElement secondNavAdvancedTab = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/nav/div/a[2]"));
		secondNavAdvancedTab.click();
		WebElement parent = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[2]/div[5]/span/span[1]/span/span[1]"));
		
		assertEquals("Create your own content", parent.getAttribute("title"));
	}
}
