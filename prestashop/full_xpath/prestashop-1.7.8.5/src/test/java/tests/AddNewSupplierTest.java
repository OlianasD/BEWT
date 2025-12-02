package tests;

import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddNewSupplierTest extends BaseTest {
	
	@Test
	public void test_add_supplier(){
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
		WebElement addSupplier = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/a[1]"));
		addSupplier.click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/div/input"));
		name.sendKeys("John");
		WebElement address = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[5]/div/input"));
		address.sendKeys("Via Fianle Ligure");
		WebElement city = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div[8]/div/input"));
		city.sendKeys("Finale Ligure");
		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div/div[2]/button"));
		saveBtn.click();
		WebElement successMsg = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div"));
		
		assertTrue(successMsg.getText().contains("Successful creation"));
	}
}
