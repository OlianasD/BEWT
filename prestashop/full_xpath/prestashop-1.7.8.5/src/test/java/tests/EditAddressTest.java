package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EditAddressTest extends BaseTest {

	
	
	@Test()
	public void test_edit_addressNoPO(){
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement customers = driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]/a"));
		customers.click();
		WebElement addresses = driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]/ul/li[2]/a"));
		addresses.click();
		WebElement editIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[1]/td[9]/div/div/a[1]"));
		editIcon.click();
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div[2]/div[3]/div/input"));
		firstName.clear();
		firstName.sendKeys("Bob");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[3]/div[2]/button"));
		saveBtn.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		
		assertTrue(successMsg.getText().contains("Update successful"));
		
		
	}
}
