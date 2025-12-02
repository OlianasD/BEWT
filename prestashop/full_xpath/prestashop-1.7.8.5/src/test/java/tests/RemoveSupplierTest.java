package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RemoveSupplierTest extends BaseTest {
	
	@Test
	public void test_remove_supplier(){
		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[1]/input"));
		emailField.sendKeys(adminMail);
		WebElement pswField = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[2]/input"));
		pswField.sendKeys(adminPsw);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/form/div[3]/button"));
		loginBtn.click();
		WebElement catalog = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a"));
		catalog.click();
		WebElement brandsAndSuppliers = driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/ul/li[5]/a"));
		brandsAndSuppliers.click();
		WebElement suppliersTab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a"));
		suppliersTab.click();
		WebElement threePointsIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[3]/td[7]/div/div/a[2]"));
		threePointsIcon.click();
		WebElement delete = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/form/table/tbody/tr[3]/td[7]/div/div/div/a[2]"));
		delete.click();
		WebElement confirmDelete = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/button[2]"));
		confirmDelete.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		
		assertTrue(successMsg.getText().contains("Successful deletion"));
	}
}