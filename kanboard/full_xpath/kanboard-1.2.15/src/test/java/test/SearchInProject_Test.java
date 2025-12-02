package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class SearchInProject_Test extends BaseTest {
	
	@Test
	public void searchInProject() {
		WebElement userField = driver.findElement(By.xpath("/html/body/div/form/input[2]"));
		userField.sendKeys("admin");
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/form/input[3]"));
		pswField.sendKeys("admin");
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/form/div[1]/button"));
		loginBtn.click();
		WebElement searchBar = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/form/div/input"));
		searchBar.sendKeys("status:open");
		searchBar.sendKeys(Keys.RETURN);
		WebElement searchRes = driver.findElement(By.xpath("/html/body/section/div[3]/div[2]/div[1]/span/a"));

		assertEquals("task 3", searchRes.getText());
	}
		  
		  
}
