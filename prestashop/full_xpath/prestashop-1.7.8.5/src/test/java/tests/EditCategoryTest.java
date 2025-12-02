package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditCategoryTest extends BaseTest {
	
	@Test
	public void test_edit_category() throws InterruptedException {
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement categories = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[2]/a"));
		categories.click();
		WebElement editCategory = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[5]/div/div[1]/div[2]/div/div/div[2]/div/form/table/tbody/tr[4]/td[7]/div/div/a[1]"));
		editCategory.click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/div/div[1]/input"));
		name.clear();
		name.sendKeys("Fall Collection");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		Thread.sleep(1000);
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		
		
		assertTrue(successMsg.getText().contains("Successful update"));
	}	 
}
