package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class AssignCategory_Test extends BaseTest {
	
	@Test
	public void assignCategory_Test() throws InterruptedException {
		WebElement usrElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/input"));
		usrElem.sendKeys(username);
		WebElement pswElem = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/input"));
		pswElem.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[4]/button"));
		loginBtn.click();
		WebElement contentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		contentLink.click();
		WebElement postLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[3]/a[2]"));
		postLink.click();
		WebElement optionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		optionsSidebar.click();
		WebElement categorySelect = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[1]/div[1]/select"));
		new Select(categorySelect).selectByVisibleText("Category001");
		WebElement secondOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		secondOptionsSidebar.click();
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[2]/button[1]"));
		saveBtn.click();
		Thread.sleep(500);
		WebElement secondContentLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul/li[6]/a"));
		secondContentLink.click();
		WebElement secondPostLink = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[3]/a[2]"));
		secondPostLink.click();
		WebElement thirdOptionsSidebar = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[1]/div[1]/button[2]"));
		thirdOptionsSidebar.click();
		WebElement secondCategorySelect = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[2]/div/div[1]/div[1]/select"));

		assertEquals("Category001", new Select(secondCategorySelect).getFirstSelectedOption().getText());
		
		
	}
}